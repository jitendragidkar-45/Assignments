package in.xenosis.IntermediateAssignment;

public class PersonApp {
    public static void main(String[] args) {
        Person person=new Person("Ghamesh Rahangdale",30,"Nagpur");
        Person person2=new Person("Swapnil Patle",28,"Nagpur");
        person.display();
        System.out.println("----------------------------------------");
        person2.display();
        System.out.println("----------------------------------------");
    }
}
