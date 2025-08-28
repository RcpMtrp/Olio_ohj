import java.util.ArrayList;
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class GroceryListManager2 {
    private HashMap<String, Double> groceryList = new HashMap<>();



    // Add methods here
    public void addItem(String item, double cost){
        groceryList.put(item, cost);
        //groceryList.add(cost);
    }

    public double calculateTotalCost(){
        double total = 0;
        for (double cost : groceryList.values()) {
            total += cost;
        }
        return total;
    }

/*
    public void removeItem(String item){
        groceryList.remove(item);

    }*/
    public void displayList(){
        System.out.println("Grocery List:");
        int index = 1;
        for (Map.Entry<String, Double> entry : groceryList.entrySet()) {
            System.out.printf("%d. %s price is: %.2f €%n", index++, entry.getKey(), entry.getValue());
        }

    }
    /*public boolean checkItem(String item){
        return groceryList.contains(item);}*/


    //public double calculateTotalCost(){}

    public static void main(String[] args) {
        GroceryListManager2 groceryManager = new GroceryListManager2();
/*
        Scanner scanner=new Scanner(System.in);
        String GroceryListItem;
        System.out.println("Enter your grocery list items: (press Enter to finish the Grocery List)");

        while(true) {
            GroceryListItem = scanner.nextLine();
            if (GroceryListItem.equals("")) {
                break;
            }
            groceryManager.addItem(GroceryListItem);
        }
*/
        groceryManager.addItem("Apples", 3.54);
        groceryManager.addItem("Milk", 2.66);
        groceryManager.addItem("Bread", 1.99);

        groceryManager.displayList();
        System.out.printf("The total cost of the groceries: %.2f €%n", groceryManager.calculateTotalCost());

        //String itemCheck = "Milk";
        //System.out.println("Is " + itemCheck + " in the grocery list? " + groceryManager.checkItem(itemCheck));

        //System.out.println("Removing " + itemCheck + " from the list.... ");
        //groceryManager.removeItem(itemCheck);

        //System.out.println("Updated Grocery List: ");
        //groceryManager.displayList();


    }

}