public class VehicleDemo {
    public static void main(String[] args) {
        System.out.println("Vehicle Demonstration");

        Vehicle car = new Car();
        car.start();
        car.stop();
        car.getInfo();

        Vehicle Motorcycle = new Motorcycle();
        Motorcycle.start();
        Motorcycle.stop();
        Motorcycle.getInfo();

        Vehicle Bus = new Bus();
        Bus.start();
        Bus.stop();
        Bus.getInfo();



    }
}
