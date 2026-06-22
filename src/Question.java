public class Question {
    private String topic;
    private String questionText;
    private String optionA;
    private String optionB;
    private String optionC;
    private String optionD;
    private char correctAnswer;

    public Question(String topic, String questionText, String optionA, String optionB,
                    String optionC, String optionD, char correctAnswer) {
        this.topic = topic;
        this.questionText = questionText;
        this.optionA = optionA;
        this.optionB = optionB;
        this.optionC = optionC;
        this.optionD = optionD;
        this.correctAnswer = Character.toUpperCase(correctAnswer);
    }

    public String getTopic() {
        return topic;
    }

    public char getCorrectAnswer() {
        return correctAnswer;
    }

    public void displayQuestion() {
        System.out.println("\nTopic: " + topic);
        System.out.println(questionText);
        System.out.println("A. " + optionA);
        System.out.println("B. " + optionB);
        System.out.println("C. " + optionC);
        System.out.println("D. " + optionD);
    }

    public boolean checkAnswer(char userAnswer) {
        return Character.toUpperCase(userAnswer) == correctAnswer;
    }
}

