package in.xenosis.IntermediateAssignment;

public class Person {
    String name;
    Integer age;
    String address;

    public Person(String name, Integer age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }
    public void display(){
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
        System.out.println("Address : "+address);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}
