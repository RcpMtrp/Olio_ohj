import java.util.Scanner;

public class BinaryConv {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a binary number with only 0's and 1's \n");
        String binaryValue = scanner.nextLine();

        int decimal = 0;
        for (int i = 0; i < binaryValue.length(); i++) {
            char bits = binaryValue.charAt(i);
            if (bits != '0' && bits != '1') {
                System.out.println("Wrong input, please enter only 0 and 1.");
                return;
            }
            decimal = decimal * 2 + (bits - '0');
        }
        System.out.println("Decimal equivalent: " + decimal);
    }
}
