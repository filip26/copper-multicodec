package com.apicatalog.multicodec;

import java.io.PrintWriter;

import com.apicatalog.multicodec.Multicodec.Tag;

public class CodecDef {

    String name; 
    Tag tag;
    byte[] code;
    String status;
    String description;
 
    public static final CodecDef from(String line) {
        
        final String[] columns = line.split(",");

        // import only keys
        if (!"key".equals(columns[1].trim())) {
            return null;
        }

        final CodecDef def = new CodecDef();
        def.name = columns[0].trim();
        def.tag = Tag.Key;
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
        writer.println(" */");
        
        writer.print("    ");
        writer.print("public static Multicodec ");
        writer.print(toName(name));
        writer.print("_KEY = new Multicodec(\"");
        writer.print(name);
        writer.print("\", Tag.Key, new byte[] {");
        writer.println("});");
    }
    
    static final String toName(String name) {
        return name.replaceAll("-", "_")
                .replace("priv", "PRIVATE")
                .replace("pub", "PUBLIC")
                .toUpperCase();
    }
}
