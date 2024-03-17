package view;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class TextAnalyzerView {
    public void displayWordCount(int wordCount) {
        System.out.println("Количество слов в файле: " + wordCount);
    }

    public void displayLongestWord(String longestWord) {
        System.out.println("Самое длинное слово в файле: " + longestWord);
    }

    public void displayWordFrequency(Map<String, Integer> wordFrequency) {
        System.out.println("Частота встречаемости каждого слова:");

        // Сортировка карты по значению (частоте)
        List<Map.Entry<String, Integer>> entries = new ArrayList<>(wordFrequency.entrySet());
        entries.sort(Map.Entry.comparingByValue());

        // Вывод отсортированной карты
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}