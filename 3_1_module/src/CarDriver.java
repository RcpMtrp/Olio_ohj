public class CarDriver {
    public static void main(String[] args) {
        Car myCar;
        Car myCar2;
        Car mySportsCar;

        myCar = new Car("Toyota Corolla");
        myCar2 = new Car("Bmw M3");
        mySportsCar = new SportsCar("Mclaren F1");
        myCar.fillTank();
        myCar2.fillTank();
        mySportsCar.fillTank();

        for (int i = 0; i < 6; i++) {
            myCar.accelerate();
            myCar2.accelerate();
            mySportsCar.accelerate();
            System.out.println(myCar.getTypeName() + ": speed is " + myCar.getSpeed() + " km/h");
            System.out.println(myCar2.getTypeName() + ": speed is " + myCar2.getSpeed() + " km/h");
            System.out.println(mySportsCar.getTypeName() + ": speed is " + mySportsCar.getSpeed() + " km/h");

        }

        while (myCar.getSpeed() > 0) {
            myCar.decelerate(15);
            myCar2.decelerate(15);
            mySportsCar.decelerate(15);
            System.out.println(myCar.getTypeName() + ": speed is " + myCar.getSpeed() + " km/h");
            System.out.println(myCar2.getTypeName() + ": speed is " + myCar2.getSpeed() + " km/h");
            System.out.println(mySportsCar.getTypeName() + ": speed is " + mySportsCar.getSpeed() + " km/h");
        }

    }
}