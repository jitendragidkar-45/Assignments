package in.xenosis.AdvancdOopsConcepts;

public class VehicleApp {
    public static void main(String[] args) {

        Vehicle bike = new Bike("Yamaha", "YZF-R3", 2020, 2);
        Vehicle car = new Car("Toyota", "Corolla", 2019, 4);

        bike.functionOn();
        bike.makeAndModel();
        bike.display();

        System.out.println("_______________________________________");

        car.functionOn();
        car.makeAndModel();
        car.display();
    }
}
