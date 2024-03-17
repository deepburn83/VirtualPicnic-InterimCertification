package model;

import java.io.IOException;

public class WordCounter extends AbstractTextAnalyzer {
    private int wordCount = 0;

    @Override
    public void analyze(String filePath) throws IOException {
        processFile(filePath, line -> {
            String[] words = line.split("\\s+");
            wordCount += words.length;
        });
    }

    public int getWordCount() {
        return wordCount;
    }
}