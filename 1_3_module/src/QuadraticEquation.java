import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter x2 value: ");
        double x2 = scanner.nextDouble();

        System.out.println("Enter x value: ");
        double x = scanner.nextDouble();

        System.out.println("Enter number value: ");
        double number = scanner.nextDouble();

        double discriminant = x * x - 4 * x2 * number;
        System.out.println(discriminant);
        double squaredDiscriminant = Math.sqrt(discriminant);
        System.out.println(squaredDiscriminant);

        if (discriminant < 0) {
            System.out.println("No real roots");
        } else {
            double firstRoot = (-x + squaredDiscriminant) / (2 * x2);
            double secondRoot = (-x - squaredDiscriminant) / (2 * x2);

            System.out.println("The first root is " + firstRoot);
            System.out.println("The second root is " + secondRoot);
        }


    }
}
