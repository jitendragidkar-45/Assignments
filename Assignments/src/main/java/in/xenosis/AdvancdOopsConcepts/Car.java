package in.xenosis.AdvancdOopsConcepts;

public class Car extends Vehicle{

    public Car(String make, String model, int year, int engineType) {
        super(make, model, year, engineType);
    }

    @Override
    public void functionOn() {
        System.out.println("Its a car works on : "+getEngineType()+"Stroke");
    }

    @Override
    public void makeAndModel() {
        System.out.println("make And modeL of carry : "+getMake()+"..."+getModel());
    }
}
