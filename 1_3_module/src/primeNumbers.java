import java.util.Scanner;

public class primeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a value: ");
        double value1 = scanner.nextDouble();
        if (value1 > 1 && value1 % value1 == 0) {
            System.out.println("it is a prime number");
        } else {
            System.out.println("it is not a prime number");
        }
    }
}
