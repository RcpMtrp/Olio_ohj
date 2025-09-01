public class Motorcycle2 extends AbstractVehicle {

    public Motorcycle2(String model, String engineType, int modelYear){
        super(model, engineType, modelYear);
    }

    public void revvingEngine(){
        System.out.println(model + " is revving");
    }
}
