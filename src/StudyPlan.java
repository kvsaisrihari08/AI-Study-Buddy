public class StudyPlan {

    public void generatePlan(Student student) {

        System.out.println("\nPersonalized Study Schedule");

        int hours = student.getDailyStudyHours();

        double learnTime = hours * 0.40;
        double practiceTime = hours * 0.30;
        double quizTime = hours * 0.15;
        double revisionTime = hours * 0.15;

        System.out.printf("Learn New Topics : %.1f hours\n", learnTime);
        System.out.printf("Practice Problems: %.1f hours\n", practiceTime);
        System.out.printf("Take Quiz        : %.1f hours\n", quizTime);
        System.out.printf("Revision         : %.1f hours\n", revisionTime);

        System.out.println("\nGoal Focus: " + student.getGoal());

        if(hours >= 6) {
            System.out.println("Recommendation: Excellent study commitment. Include mock tests.");
        }
        else if(hours >= 4) {
            System.out.println("Recommendation: Good schedule. Maintain consistency.");
        }
        else if(hours >= 2) {
            System.out.println("Recommendation: Increase practice time for better results.");
        }
        else {
            System.out.println("Recommendation: Try to dedicate more study time daily.");
        }
    }
}