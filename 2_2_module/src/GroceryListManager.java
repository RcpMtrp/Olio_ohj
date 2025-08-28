import java.util.ArrayList;
import java.util.Scanner;

public class GroceryListManager {
    private ArrayList<String> groceryList = new ArrayList<>();



    // Add methods here
    public void addItem(String item){
        groceryList.add(item);
        //groceryList.add(cost);
        }


    public void removeItem(String item){
        groceryList.remove(item);

    }
    public void displayList(){
        System.out.println("Grocery List:");
        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println((i+1) + ". " + groceryList.get(i));
        }

    }
    public boolean checkItem(String item){
        return groceryList.contains(item);

    }


    //public double calculateTotalCost(){}

    public static void main(String[] args) {
        GroceryListManager groceryManager = new GroceryListManager();
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
        groceryManager.addItem("Apples");
        groceryManager.addItem("Milk");
        groceryManager.addItem("Bread");

        groceryManager.displayList();

        String itemCheck = "Milk";
        System.out.println("Is " + itemCheck + " in the grocery list? " + groceryManager.checkItem(itemCheck));

        System.out.println("Removing " + itemCheck + " from the list.... ");
        groceryManager.removeItem(itemCheck);

        System.out.println("Updated Grocery List: ");
        groceryManager.displayList();


    }

}