import java.util.Scanner;

public class CelsiusConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();

        double Celsius = (fahrenheit - 32) * 5 / 9;

        System.out.printf("The Fahrenheit in Celsius is: %.1f", Celsius);
    }
}
