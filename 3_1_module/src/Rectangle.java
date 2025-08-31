public class Rectangle extends Shape{
    private double height;
    private double width;

    public Rectangle(double height, double width, String colour) {
        super(colour);
        this.height = height;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return height * width;
    }
}
