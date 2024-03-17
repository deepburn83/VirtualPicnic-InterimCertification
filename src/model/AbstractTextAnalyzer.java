package model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public abstract class AbstractTextAnalyzer implements TextAnalyzer {
    protected void processFile(String filePath, AnalyzerFunction function) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String line;
        while ((line = reader.readLine()) != null) {
            function.apply(line);
        }
        reader.close();
    }

    protected interface AnalyzerFunction {
        void apply(String line);
    }
}