package com.apicatalog.multicodec;

import java.io.PrintWriter;

import com.apicatalog.multicodec.Multicodec.Tag;

public class CodecDef {

    String name;
    Tag tag;
    Long code;
    String status;
    String description;

    public static final CodecDef from(String[] columns) {

        final CodecDef def = new CodecDef();

        String type = columns[1].trim();

        def.code = Long.parseLong(columns[2].trim().substring(2), 16);
        def.name = columns[0].trim();
        def.tag = Tag.valueOf(Character.toUpperCase(type.charAt(0)) + type.substring(1));
        def.status = columns[3].trim();
        def.description = columns.length > 4 ? columns[4].trim() : null;
        return def;
    }

    public final void writeCode(PrintWriter writer, Class<?> clazz) {
        writer.print("    ");
        writer.print("/** ");
        writer.print(tag);
        writer.print(": ");
        writer.print(name);
        if (description != null) {
            writer.print(", ");
            writer.print(description);
        }
        writer.print(", status = ");
        writer.print(status);
        writer.print(", code = ");
        writer.print(String.format("0x%x", code));
        writer.println(" */");

        writer.print("    ");
        writer.print("public static final ");
        writer.print(clazz.getSimpleName());
        writer.print(" ");
        writer.print(getJavaName());
        writer.print(" = ");
        writer.print(clazz.getSimpleName());
        writer.print(".of(\"");
        writer.print(name);
        writer.print("\", ");
        if (Multicodec.class.equals(clazz)) {
            writer.print(" Tag.");
            writer.print(tag.name());
            writer.print(", ");
        }
        writer.print(String.format("0x%x",code));
        writer.println(");");
    }

    protected final String getJavaName() {
        return name.replaceAll("-", "_")
                .replace("priv", "PRIVATE")
                .replace("pub", "PUBLIC")
                .toUpperCase()
                + ((Tag.Key == tag) ? "_KEY" : "");
    }
}
