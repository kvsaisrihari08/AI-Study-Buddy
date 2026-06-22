import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class OracleStudyBuddyDAO {
    public void saveStudent(Student student) {
        String sql = "INSERT INTO students (student_id, name, goal, daily_study_hours) VALUES (?, ?, ?, ?)";

        try (Connection connection = DBConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {

            statement.setInt(1, student.getId());
            statement.setString(2, student.getName());
            statement.setString(3, student.getGoal());
            statement.setInt(4, student.getDailyStudyHours());
            statement.executeUpdate();

            System.out.println("Student saved in Oracle database.");
        } catch (SQLException exception) {
            System.out.println("Database save failed: " + exception.getMessage());
        }
    }

    public void saveQuizResult(int studentId, QuizResult result) {
    String sql = "INSERT INTO quiz_results "
            + "(result_id, student_id, topic, total_questions, correct_answers, percentage) "
            + "VALUES (quiz_results_seq.NEXTVAL, ?, ?, ?, ?, ?)";

    try (Connection connection = DBConnection.getConnection();
         PreparedStatement statement = connection.prepareStatement(sql)) {

        statement.setInt(1, studentId);
        statement.setString(2, result.getTopic());
        statement.setInt(3, result.getTotalQuestions());
        statement.setInt(4, result.getCorrectAnswers());
        statement.setDouble(5, result.getPercentage());

        statement.executeUpdate();

        System.out.println("Quiz result saved in Oracle database.");
    } catch (SQLException exception) {
        System.out.println("Database save failed: " + exception.getMessage());
    }
}
}

