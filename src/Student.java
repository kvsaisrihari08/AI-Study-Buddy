public class Student {
    private int id;
    private String name;
    private String goal;
    private int dailyStudyHours;

    public Student(int id, String name, String goal, int dailyStudyHours) {
        this.id = id;
        this.name = name;
        this.goal = goal;
        this.dailyStudyHours = dailyStudyHours;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getGoal() {
        return goal;
    }

    public int getDailyStudyHours() {
        return dailyStudyHours;
    }

    public void displayStudentDetails() {
        System.out.println("\nStudent Profile");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Goal: " + goal);
        System.out.println("Daily Study Hours: " + dailyStudyHours);
    }
}

