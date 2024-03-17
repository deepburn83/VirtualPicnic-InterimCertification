package model;

import java.io.IOException;

public class LongestWordFinder extends AbstractTextAnalyzer {
    private String longestWord = "";

    @Override
    public void analyze(String filePath) throws IOException {
        processFile(filePath, line -> {
            String[] words = line.split("\\s+");
            for (String word : words) {
                if (word.length() > longestWord.length()) {
                    longestWord = word;
                }
            }
        });
    }

    public String getLongestWord() {
        return longestWord;
    }
}