package in.xenosis.AdvancdOopsConcepts;

public class ShapeApp {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(18, 45);
        Shape triangle = new Triangle(45, 18);

        System.out.println("Rectangle Area: " + rectangle.calculateArea());
        System.out.println("Triangle Area: " + triangle.calculateArea());
    }
}
