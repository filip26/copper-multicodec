package com.apicatalog.multicodec;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Date;
import java.util.stream.Stream;

public class CvsImporter {

    public static void main(String[] args) throws IOException {

        try (Stream<String> stream = Files.lines(Paths.get("table.csv"))) {
            
            StringWriter sw = new StringWriter();
            PrintWriter writer = new PrintWriter(sw);

            writer.println("package com.apicatalog.multicodec;");
            writer.println();
            writer.println("import com.apicatalog.multicodec.Multicodec.Tag;");
            writer.println();
            writer.print("/** Multicodec Registry - generated: ");
            writer.print(new Date().toString());
            writer.println(" */");
            writer.println("public class MulticodecRegistry {");
            writer.println();
            
            stream.map(CodecDef::from)
                    .filter(def -> def != null)
                    .sorted((d1, d2) -> d1.name.compareTo(d2.name))
                    .forEach(def -> 
                    { def.writeCode(writer);
                        writer.println();
                        
                    });
            writer.println("}");
            System.out.println(sw.toString());
            
            Files.write(Paths.get("src/main/java/com/apicatalog/multicodec/MulticodecRegistry.java"), sw.toString().getBytes());
        }
    }

}
