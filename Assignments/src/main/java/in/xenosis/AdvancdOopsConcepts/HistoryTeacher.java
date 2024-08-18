package in.xenosis.AdvancdOopsConcepts;

public class HistoryTeacher extends Teacher{
    private String specialization;

    public HistoryTeacher(String name, int age, String specialization) {
        super(name, age);
        this.specialization = specialization;
    }

    @Override
    public void teach() {
        System.out.println("Teaching History. Specialization: " + specialization);
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Specialization: " + specialization);
    }
}
