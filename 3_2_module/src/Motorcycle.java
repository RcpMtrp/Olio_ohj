public class Motorcycle implements Vehicle {
    public void start() {
        System.out.println("Motorcycle is starting...");
    }

    public void stop() {
        System.out.println("Motorcycle is stopping...");
    }

    public void getInfo() {
        System.out.println("Motorcycle Information: ");
        System.out.println("Type: Motorcycle");
        System.out.println("Fuel: Gasoline");
        System.out.println("Colour: Black");
    }
}
