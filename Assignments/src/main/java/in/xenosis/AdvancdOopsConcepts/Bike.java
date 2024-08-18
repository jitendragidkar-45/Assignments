package in.xenosis.AdvancdOopsConcepts;

public class Bike extends Vehicle {
    public Bike(String make, String model, int year, int engineType) {
        super(make, model, year, engineType);
    }

    @Override
    public void functionOn() {
        System.out.println("Its a bike works on : "+getEngineType()+"Stroke");
    }

    @Override
    public void makeAndModel() {
        System.out.println("make And modeL of bikey : "+getMake()+"..."+getModel());
    }
}
