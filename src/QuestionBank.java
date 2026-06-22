import java.util.ArrayList;

public class QuestionBank {
    private ArrayList<Question> questions;

    public QuestionBank() {
        questions = new ArrayList<Question>();
        addDefaultQuestions();
    }

    private void addDefaultQuestions() {

        // JAVA QUESTIONS
        questions.add(new Question(
                "Java",
                "Which concept is used to hide data in a class?",
                "Inheritance", "Encapsulation", "Polymorphism", "Abstraction",
                'B'
        ));

        questions.add(new Question(
                "Java",
                "Which keyword is used to create an object in Java?",
                "class", "this", "new", "static",
                'C'
        ));

        questions.add(new Question(
                "Java",
                "Which keyword is used for inheritance?",
                "extends", "implements", "import", "package",
                'A'
        ));

        questions.add(new Question(
                "Java",
                "JVM stands for?",
                "Java Variable Method",
                "Java Virtual Machine",
                "Java Verified Method",
                "Java Visual Machine",
                'B'
        ));

        questions.add(new Question(
                "Java",
                "Which collection stores unique elements?",
                "ArrayList",
                "LinkedList",
                "HashSet",
                "Vector",
                'C'
        ));

        // DBMS QUESTIONS
        questions.add(new Question(
                "DBMS",
                "Which SQL command is used to view records from a table?",
                "INSERT", "SELECT", "UPDATE", "DELETE",
                'B'
        ));

        questions.add(new Question(
                "DBMS",
                "Which key uniquely identifies each row in a table?",
                "Foreign Key", "Primary Key", "Candidate Key", "Super Key",
                'B'
        ));

        questions.add(new Question(
                "DBMS",
                "What does DBMS stand for?",
                "Database Management System",
                "Data Backup Management System",
                "Database Mapping System",
                "Data Business Management System",
                'A'
        ));

        questions.add(new Question(
                "DBMS",
                "Which SQL command is used to add new records?",
                "INSERT",
                "SELECT",
                "UPDATE",
                "DELETE",
                'A'
        ));

        questions.add(new Question(
                "DBMS",
                "Which normal form removes partial dependency?",
                "1NF",
                "2NF",
                "3NF",
                "BCNF",
                'B'
        ));

        // OOP QUESTIONS
        questions.add(new Question(
                "OOP",
                "Creating many forms of one method is called:",
                "Inheritance", "Polymorphism", "Constructor", "Package",
                'B'
        ));

        questions.add(new Question(
                "OOP",
                "Wrapping data and methods together is called:",
                "Abstraction",
                "Inheritance",
                "Encapsulation",
                "Polymorphism",
                'C'
        ));

        questions.add(new Question(
                "OOP",
                "Which OOP concept allows code reuse?",
                "Inheritance",
                "Encapsulation",
                "Abstraction",
                "Polymorphism",
                'A'
        ));

        questions.add(new Question(
                "OOP",
                "Hiding implementation details is called:",
                "Inheritance",
                "Polymorphism",
                "Abstraction",
                "Constructor",
                'C'
        ));

        questions.add(new Question(
                "OOP",
                "Which is NOT an OOP principle?",
                "Encapsulation",
                "Inheritance",
                "Compilation",
                "Polymorphism",
                'C'
        ));
    }

    public ArrayList<Question> getQuestionsByTopic(String topic) {
        ArrayList<Question> topicQuestions = new ArrayList<Question>();

        for (Question question : questions) {
            if (question.getTopic().equalsIgnoreCase(topic)) {
                topicQuestions.add(question);
            }
        }

        return topicQuestions;
    }

    public void displayAvailableTopics() {
        System.out.println("\nAvailable Topics");
        System.out.println("1. Java");
        System.out.println("2. DBMS");
        System.out.println("3. OOP");
        System.out.println("Enter topic name exactly as: Java, DBMS, or OOP");
    }
}