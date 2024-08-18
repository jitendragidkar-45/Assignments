package in.xenosis.IntermediatePro;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class StudentManager {
    private List<Student> students;

    public StudentManager() {
        students = new ArrayList<>();
    }

    public void addStudent(String name, int id) {
        Student student = new Student(name, id);
        students.add(student);
        System.out.println("Student added: " + student);
    }

    public void removeStudent(int id) {
        Optional<Student> studentToRemove = students.stream()
                .filter(student -> student.getId() == id)
                .findFirst();

        studentToRemove.ifPresent(student -> {
            students.remove(student);
            System.out.println("Student removed: " + student);
        });

        if (!studentToRemove.isPresent()) {
            System.out.println("Student with ID " + id + " not found.");
        }
    }

    public void displayStudents() {
        if (students.isEmpty()) {
            System.out.println("No students to display.");
        } else {
            System.out.println("List of students:");
            students.forEach(System.out::println);
        }
    }
}
