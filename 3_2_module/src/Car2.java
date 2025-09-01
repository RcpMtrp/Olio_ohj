public class Car2 extends AbstractVehicle {

    public Car2(String model, String engineType, int modelYear){
        super(model, engineType, modelYear);
    }

    public void drifting(){
        System.out.println(model + " is drifting");
    }
}
