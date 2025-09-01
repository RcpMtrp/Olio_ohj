public class Bus2 extends AbstractVehicle {

    public Bus2(String model, String engineType, int modelYear){
        super(model, engineType, modelYear);
    }

    public void leavingStation(){
        System.out.println(model + " is leaving station");
    }
}
