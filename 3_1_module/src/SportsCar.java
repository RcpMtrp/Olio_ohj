public class SportsCar extends Car {
    public SportsCar(String typeName) {
        super(typeName);
    }
    public SportsCar( String typename, double speed, double gasolineLevel) {
        super(typename, speed, gasolineLevel);
    }


    public void accelerate() {
        if (getGasolineLevel () > 0) {
            setSpeed(getSpeed() + 15);
            setGasolineLevel(Math.max(0, getGasolineLevel() - 3));
        }else {
            setSpeed(0);
        }
    }
    void decelerate(int amount) {
        if (getGasolineLevel() > 0 && amount > 0) {
            setSpeed(Math.max(0, getSpeed() - amount * 1.8));
        } else {
            setSpeed(0);
        }
    }



}
