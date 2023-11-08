package com.apicatalog.multicodec;

import java.io.PrintWriter;

import com.apicatalog.multicodec.Multicodec.Tag;
import com.apicatalog.uvarint.VarEncoder;

public class CodecDef {

    String name;
    Tag tag;
    Long code;
    byte[] varint;
    String status;
    String description;

    public static final CodecDef from(String line) {

        final String[] columns = line.split(",");

        // import only keys
        if (!"key".equals(columns[1].trim())
                && !"identity".equals(columns[0].trim())) {
            return null;
        }

        final CodecDef def = new CodecDef();
        
        String type = columns[1].trim();
        
        def.code = Long.parseLong(columns[2].trim().substring(2), 16);
        def.varint = VarEncoder.encode(def.code);

        def.name = columns[0].trim();
        def.tag = Tag.valueOf(Character.toUpperCase(type.charAt(0)) + type.substring(1));
        def.status = columns[3].trim();
        def.description = columns[4].trim();
        return def;
    }

    public final void writeCode(PrintWriter writer) {
        writer.print("    ");
        writer.print("/** ");
        writer.print(name);
        writer.print(": ");
        writer.print(description);
        writer.print(", status = ");
        writer.print(status);
        writer.print(", code = ");
        writer.print(code);
        writer.println(" */");

        writer.print("    ");
        writer.print("public static Multicodec ");
        writer.print(toName(name));
        if (Tag.Key == tag) {
            writer.print("_KEY");
        }
        writer.print(" = new Multicodec(\"");
        writer.print(name);
        writer.print("\", Tag.");
        writer.print(tag.name());
        writer.print(", ");
        writer.print(code);
        writer.print(", new byte[] {");
        for (int i = 0; i < varint.length; i++) {
            if (i > 0) {
                writer.print(", ");
            }
            writer.print("(byte)");
            writer.print(String.format("0x%02x", varint[i]));
        }
        writer.println("});");
    }

    static final String toName(String name) {
        return name.replaceAll("-", "_")
                .replace("priv", "PRIVATE")
                .replace("pub", "PUBLIC")
                .toUpperCase();
    }
}
