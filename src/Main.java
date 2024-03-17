import controller.TextAnalyzerController;
import view.TextAnalyzerView;

public class Main {
    public static void main(String[] args) {
        String filePath = "input.txt";
        TextAnalyzerView view = new TextAnalyzerView();
        TextAnalyzerController controller = new TextAnalyzerController(view);
        controller.analyzeText(filePath);
    }
}