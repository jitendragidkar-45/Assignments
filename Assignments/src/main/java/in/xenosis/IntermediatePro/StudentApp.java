package in.xenosis.IntermediatePro;

public class StudentApp {
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();

        manager.addStudent("Golu", 1);
        manager.addStudent("Molu", 2);
        manager.addStudent("Aalu", 3);


        manager.displayStudents();

        manager.removeStudent(2);

        manager.displayStudents();

        manager.removeStudent(5);
    }
}
