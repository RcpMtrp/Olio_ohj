import java.util.Scanner;

public class SumOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");
        int first = Integer.parseInt(scanner.nextLine());

        System.out.println("Give the second number:");
        int second = Integer.parseInt(scanner.nextLine());

        System.out.println("Give the third number:");
        int third = Integer.parseInt(scanner.nextLine());

// creating the integers for sum and product and float for the average due to decimals.
        int sum = first + second + third;
        int product = first  * second * third;
        double average = (double)(first+second+third)/3;

//using printf with integers and 7 decimal results
        System.out.printf("The sum of the numbers is %d, the product is %d, the average is %.7f\n"
                ,sum,product,average);
    }
}