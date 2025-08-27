public class CoffeeMaker {
    private boolean isOn;
    private int coffeeMl;
    private String coffeeType;

    public CoffeeMaker(){
        isOn = false;
        coffeeMl = 0;
        coffeeType = "";
    }
    public void switchOn(){
        isOn = true;
    }
    public void switchOff(){
        isOn = false;

    }
    public void setCoffeeMl(int ml){
        if (isOn && ml >= 10 && ml <= 80){
            coffeeMl = ml;
        }

    }
    public void setCoffeeType(String type){
        if (isOn && type.equals("normal") || type.equals("espresso")){
            coffeeType = type;
        }
    }
    public int getCoffeeMl(){
        return coffeeMl;
    }
    public String getCoffeeType(){
        return coffeeType;
    }

}
