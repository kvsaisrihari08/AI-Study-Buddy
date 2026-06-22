import java.util.ArrayList;

public class ProgressTracker {
    private ArrayList<QuizResult> results;

    public ProgressTracker() {
        results = new ArrayList<QuizResult>();
    }

    public void addResult(QuizResult result) {
        results.add(result);
    }

    public void showProgress() {
        if (results.isEmpty()) {
            System.out.println("\nNo quiz attempted yet.");
            return;
        }

        System.out.println("\nProgress Report");
        double totalPercentage = 0;

        for (QuizResult result : results) {
            result.displayResult();
            totalPercentage = totalPercentage + result.getPercentage();
        }

        double average = totalPercentage / results.size();
        System.out.printf("\nAverage Performance: %.2f%%\n", average);
        showFeedback(average);
    }

    private void showFeedback(double average) {
        System.out.println("\nMotivational Feedback");

        if (average >= 80) {
            System.out.println("Excellent work! Keep practicing to stay strong.");
        } else if (average >= 50) {
            System.out.println("Good effort! Revise weak topics and try again.");
        } else {
            System.out.println("Do not worry. Start with basics and improve step by step.");
        }
    }
}

