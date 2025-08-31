public class Circle extends Shape {
    private double radius;
    public Circle(double radius, String colour) {
        super(colour);
        this.radius = radius;
    }
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }


}
