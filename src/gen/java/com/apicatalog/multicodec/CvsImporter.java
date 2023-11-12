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

public class CvsImporter {

    public static void main(final String[] args) throws IOException {

        try (final Stream<String> stream = Files.lines(Paths.get("table.csv"))) {

            StringWriter sw = new StringWriter();
            PrintWriter writer = new PrintWriter(sw);

            writer.println("package com.apicatalog.multicodec;");
            writer.println();
            writer.println("import java.util.LinkedHashMap;");
            writer.println("import java.util.Map;");
            writer.println();
            writer.println("import com.apicatalog.multicodec.Multicodec.Tag;");
            writer.println();
            writer.print("/** Multicodec Registry - generated: ");
            writer.print(new Date().toString());
            writer.println(" */");
            writer.println("public class MulticodecRegistry {");
            writer.println();

            Collection<CodecDef> defs = stream.map(CodecDef::from)
                    .filter(def -> def != null)
                    .sorted((d1, d2) -> d1.name.compareTo(d2.name))
                    .collect(Collectors.toList());

            defs.forEach(def -> {
                def.writeCode(writer);
                writer.println();
            });
                        
            writer.println("    public static Map<Long, Multicodec> CODECS = new LinkedHashMap<>();");
            writer.println();            
            writer.println("    static {");

            defs.forEach(def -> {
                writer.print("      CODECS.put(");
                writer.print(def.getJavaName());
                writer.print(".code(), ");
                writer.print(def.getJavaName());
                writer.println(");");
            });
            
            writer.println("    }");
            writer.println("}");

            Files.write(Paths.get("src/main/java/" + MulticodecRegistry.class.getCanonicalName().replaceAll("\\.", "/") + ".java"), sw.toString().getBytes());
        }
    }
}
