package com.apicatalog.multicodec;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collection;
import java.util.Date;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CodecTag {

    public static void generate(String tag, String className) throws IOException {

        try (final Stream<String[]> stream = Files.lines(Paths.get("table.csv"))
                .map(line -> line.trim().split(","))) {

            StringWriter sw = new StringWriter();
            PrintWriter writer = new PrintWriter(sw);

            writer.println("package com.apicatalog.multicodec.codec;");
            writer.println();
            writer.println("import java.util.TreeMap;");
            writer.println("import java.util.Map;");
            writer.println();
            writer.println("import com.apicatalog.multicodec.Multicodec;");
            writer.println("import com.apicatalog.multicodec.Multicodec.Tag;");
            writer.println();
            writer.print("/** Multicodec Registry - generated: ");
            writer.print(new Date().toString());
            writer.println(" */");
            writer.print("public class ");
            writer.print(className);
            writer.println(" {");
            writer.println();
            writer.print("    protected ");
            writer.print(className);
            writer.println("() { /* protected */ }");
            writer.println();
            

            Collection<CodecDef> defs = stream
                    .filter(columns -> tag.equals(columns[1].trim()))
                    .map(CodecDef::from)
                    .filter(def -> def != null)
                    .sorted((d1, d2) -> d1.name.compareTo(d2.name))
                    .collect(Collectors.toList());

            defs.forEach(def -> {
                def.writeCode(writer);
                writer.println();
            });
                        
            writer.println("    public static final Map<Long, Multicodec> ALL = new TreeMap<>();");
            writer.println();            
            writer.println("    static {");

            defs.forEach(def -> {
                writer.print("      ALL.put(");
                writer.print(def.getJavaName());
                writer.print(".code(), ");
                writer.print(def.getJavaName());
                writer.println(");");
            });
            
            writer.println("    }");
            writer.println("}");

            Files.write(Paths.get("src/main/java/com/apicatalog/multicodec/codec/" + className + ".java"), sw.toString().getBytes());
        }
    }
}
