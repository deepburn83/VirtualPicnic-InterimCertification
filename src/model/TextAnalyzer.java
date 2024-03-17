package model;

import java.io.IOException;

public interface TextAnalyzer {
    void analyze(String filePath) throws IOException;
}