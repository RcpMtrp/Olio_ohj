public class CoffeeMakerDriver {
    public static void main(String[] args) {
        CoffeeMaker coffeeMaker = new CoffeeMaker();

        coffeeMaker.switchOn();
        System.out.println("Coffee maker is on");
        coffeeMaker.setCoffeeType("espresso");
        System.out.println("Coffee type is "  + coffeeMaker.getCoffeeType());
        coffeeMaker.setCoffeeMl(50);
        System.out.println("Coffee amount is " + coffeeMaker.getCoffeeMl() + " ml");
        coffeeMaker.switchOff();
        System.out.println("Coffee maker is off");
    }
}
