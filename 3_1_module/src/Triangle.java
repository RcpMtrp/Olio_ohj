public class Triangle extends Shape {
    private double width;
    private double height;
    public Triangle(double width, double height, String colour) {
        super(colour);
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return 0.5 * width * height;
    }
}
