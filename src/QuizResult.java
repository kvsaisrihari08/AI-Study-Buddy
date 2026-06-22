public class QuizResult {
    private String topic;
    private int totalQuestions;
    private int correctAnswers;

    public QuizResult(String topic, int totalQuestions, int correctAnswers) {
        this.topic = topic;
        this.totalQuestions = totalQuestions;
        this.correctAnswers = correctAnswers;
    }

    public String getTopic() {
        return topic;
    }

    public int getTotalQuestions() {
        return totalQuestions;
    }

    public int getCorrectAnswers() {
        return correctAnswers;
    }

    public double getPercentage() {
        if (totalQuestions == 0) {
            return 0;
        }
        return (correctAnswers * 100.0) / totalQuestions;
    }

    public void displayResult() {
        System.out.println("\nQuiz Result");
        System.out.println("Topic: " + topic);
        System.out.println("Score: " + correctAnswers + "/" + totalQuestions);
        System.out.printf("Percentage: %.2f%%\n", getPercentage());
    }
}

