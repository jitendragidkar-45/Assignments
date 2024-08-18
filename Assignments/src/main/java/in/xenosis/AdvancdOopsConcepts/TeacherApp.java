package in.xenosis.AdvancdOopsConcepts;

public class TeacherApp {
    public static void main(String[] args) {
        Teacher mathTeacher = new MathTeacher("Tamanna", 31, "Integration Calculus");
        Teacher historyTeacher = new HistoryTeacher("Katrina", 36, "World History");

        mathTeacher.displayInfo();
        mathTeacher.teach();

        System.out.println();

        historyTeacher.displayInfo();
        historyTeacher.teach();
    }
}
