public abstract class AbstractVehicle implements Vehicle {
    protected String model;
    protected String engineType;
    protected int modelYear;

    public AbstractVehicle(String model, String engineType, int modelYear) {
        this.model = model;
        this.engineType = engineType;
        this.modelYear = modelYear;
    }

    @Override
    public void start() {
        System.out.println( model + " is starting...");
    }

    @Override
    public void stop() {
        System.out.println( model + " is stopping...");
    }

    public void getInfo() {
        System.out.println("Model: " + model);
        System.out.println("Engine Type: " + engineType);
        System.out.println("Model Year: " + modelYear);
    }

}
