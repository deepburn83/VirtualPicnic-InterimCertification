package controller;

import model.LongestWordFinder;
import model.WordCounter;
import model.WordFrequencyCounter;
import view.TextAnalyzerView;

import java.io.IOException;

public class TextAnalyzerController {
    private WordCounter wordCounter;
    private LongestWordFinder longestWordFinder;
    private WordFrequencyCounter wordFrequencyCounter;
    private TextAnalyzerView view;

    public TextAnalyzerController(TextAnalyzerView view) {
        this.wordCounter = new WordCounter();
        this.longestWordFinder = new LongestWordFinder();
        this.wordFrequencyCounter = new WordFrequencyCounter();
        this.view = view;
    }

    public void analyzeText(String filePath) {
        try {
            wordCounter.analyze(filePath);
            longestWordFinder.analyze(filePath);
            wordFrequencyCounter.analyze(filePath);

            view.displayWordCount(wordCounter.getWordCount());
            view.displayLongestWord(longestWordFinder.getLongestWord());
            view.displayWordFrequency(wordFrequencyCounter.getWordFrequency());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}