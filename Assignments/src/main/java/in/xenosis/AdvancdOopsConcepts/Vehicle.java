package in.xenosis.AdvancdOopsConcepts;

public class Vehicle {
   private String make;
   private String model;
   private int year;
   private int engineType;

   public void functionOn(){
       System.out.println("It works on : "+engineType);
   }
   public void makeAndModel(){
       System.out.println("make And Model : "+make+"..."+model);
   }
   public void display(){
       System.out.println("Make: " + this.make);
       System.out.println("Model: " + this.model);
       System.out.println("Year: " + this.year);
       System.out.println("Engine Type: " + this.engineType);
   }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getEngineType() {
        return engineType;
    }

    public void setEngineType(int engineType) {
        this.engineType = engineType;
    }

    public Vehicle(String make, String model, int year, int engineType) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.engineType = engineType;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", engineType=" + engineType +
                '}';
    }
}
