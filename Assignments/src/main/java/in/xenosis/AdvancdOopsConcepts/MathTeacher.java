package in.xenosis.AdvancdOopsConcepts;

public class MathTeacher extends Teacher{
    private String subject;

    public MathTeacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    @Override
    public void teach() {
        System.out.println("Teaching Math. Subject: " + subject);
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Subject: " + subject);
    }
}
