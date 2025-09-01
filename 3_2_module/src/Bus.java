public class Bus implements Vehicle {
    public void start() {
        System.out.println("bus is starting...");
    }

    public void stop() {
        System.out.println("Bus is stopping...");
    }

    public void getInfo() {
        System.out.println("Bus Information: ");
        System.out.println("Type: Bus");
        System.out.println("Fuel: Diesel");
        System.out.println("Capacity: 40 passengers");
    }
}
