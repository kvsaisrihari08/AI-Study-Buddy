import java.util.ArrayList;
import java.util.Scanner;

public class StudyBuddyApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        QuestionBank questionBank = new QuestionBank();
        ProgressTracker progressTracker = new ProgressTracker();
        StudyPlan studyPlan = new StudyPlan();

        System.out.println("AI Study Buddy - Personalized Learning Assistant");

        System.out.print("Enter Student ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Learning Goal: ");
        String goal = scanner.nextLine();

        System.out.print("Enter Daily Study Hours: ");
        int hours = scanner.nextInt();
        scanner.nextLine();

        Student student = new Student(id, name, goal, hours);
        student.displayStudentDetails();

        OracleStudyBuddyDAO dao = new OracleStudyBuddyDAO();
        dao.saveStudent(student);

        boolean running = true;

        while (running) {
            System.out.println("\nMain Menu");
            System.out.println("1. Generate Study Plan");
            System.out.println("2. Take Topic-wise Quiz");
            System.out.println("3. View Progress Report");
            System.out.println("4. Exit");
            System.out.print("Choose option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    studyPlan.generatePlan(student);
                    break;
                case 2:
                    QuizResult result = takeQuiz(scanner, questionBank);
                    if (result != null) {
                        result.displayResult();
                        progressTracker.addResult(result);
                        dao.saveQuizResult(student.getId(), result);
                    }
                    break;
                case 3:
                    progressTracker.showProgress();
                    break;
                case 4:
                    running = false;
                    System.out.println("Thank you for using AI Study Buddy. Keep learning!");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }

        scanner.close();
    }

    private static QuizResult takeQuiz(Scanner scanner, QuestionBank questionBank) {
        questionBank.displayAvailableTopics();
        System.out.print("Choose Topic (1-3): ");
        int topicChoice = scanner.nextInt();
        scanner.nextLine();

        String topic = "";

        switch(topicChoice) {
            case 1:
                topic = "Java";
                break;
            case 2:
                topic = "DBMS";
                break;
            case 3:
                topic = "OOP";
                break;
            default:
                System.out.println("Invalid Topic");
                return null;
        }

        ArrayList<Question> questions = questionBank.getQuestionsByTopic(topic);

        if (questions.isEmpty()) {
            System.out.println("No questions found for this topic.");
            return null;
        }

        int correct = 0;

        for (Question question : questions) {
            question.displayQuestion();
            System.out.print("Enter answer (A/B/C/D): ");
            char answer = scanner.nextLine().charAt(0);

            if (question.checkAnswer(answer)) {
                System.out.println("Correct!");
                correct++;
            } else {
                System.out.println("Wrong! Correct answer is " + question.getCorrectAnswer());
            }
        }

        return new QuizResult(topic, questions.size(), correct);
    }
}

