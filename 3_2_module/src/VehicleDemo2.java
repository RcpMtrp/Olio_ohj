public class VehicleDemo2 {
    public static void main(String[] args) {
        System.out.println("Vehicle Demonstration");

        Car2 car2 = new Car2("Volvo S60", "Diesel", 2015);
        Bus2 bus2 = new Bus2("Mercedes bus", "Diesel", 2010);
        Motorcycle2 motorcycle2 = new Motorcycle2("KTM exc", "4-stroke", 2009);

        car2.start();
        car2.drifting();
        car2.stop();
        car2.getInfo();

        motorcycle2.start();
        motorcycle2.revvingEngine();
        motorcycle2.stop();
        motorcycle2.getInfo();


        bus2.start();
        bus2.leavingStation();
        bus2.stop();
        bus2.getInfo();


    }
}
