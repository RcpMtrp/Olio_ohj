import java.util.Scanner;

public class TriangleHypotenusa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give the length of the triangles first leg:");
        int first = Integer.parseInt(scanner.nextLine());

        System.out.println("Give the length of the triangles second leg:");
        int second = Integer.parseInt(scanner.nextLine());

        double firstN = Math.pow(first, 2);
        double secondN = Math.pow(second, 2);
        double doubled = firstN + secondN;
        double hypotenuse = Math.sqrt(doubled);
        System.out.println("The hypotenuse is " + hypotenuse);

    }
}
