package in.xenosis.AdvancdOopsConcepts;

public class Triangle extends Shape{
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return (1.0/2.0) * base * height;
    }
}
