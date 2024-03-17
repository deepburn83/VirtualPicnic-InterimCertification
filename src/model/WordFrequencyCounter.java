package model;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class WordFrequencyCounter extends AbstractTextAnalyzer {
    private Map<String, Integer> wordFrequency = new HashMap<>();

    @Override
    public void analyze(String filePath) throws IOException {
        processFile(filePath, line -> {
            String[] words = line.split("\\s+");
            for (String word : words) {
                wordFrequency.put(word, wordFrequency.getOrDefault(word, 0) + 1);
            }
        });
    }

    public Map<String, Integer> getWordFrequency() {
        return wordFrequency;
    }
}