import java.sql.SQLOutput;

public class ShapeCalculator {
    public static void main(String[] args) {
        System.out.println("Shape Calculator");

        Rectangle rectangle = new Rectangle(3.0, 8.0, "red");
        Triangle triangle = new Triangle(2.0, 5.0, "blue");
        Circle circle = new Circle (7.0, "green");

        Shape[] shapes = { rectangle, triangle, circle};

        System.out.println("Area of Circle with radius 7.0: " + circle.calculateArea() + " and the colour is: " + circle.getColour());
        System.out.println("Area of Rectangle with width 8.0 and height 3.0: " + rectangle.calculateArea() + " and the colour is: " + rectangle.getColour());
        System.out.println("Area of Triangle with base 2.0 and height 5.0: " + triangle.calculateArea()+ " and the colour is: " + triangle.getColour());



    }

}
