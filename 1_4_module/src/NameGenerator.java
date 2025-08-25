import java.util.Scanner;

public class NameGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] firstNames = {"aapo", "tarmo", "teuvo", "tomi", "pekka"};
        String[] lastNames = {"halonen", "koivu", "heinonen", "airaksinen", "haapa"};
        //System.out.print("First Name: " + firstName[0]);

        System.out.println("How many names would you like to generate");
        int numberOfNames = scanner.nextInt();

        for (int i = 0; i < numberOfNames; i++) {
            int randomFirst = (int) (Math.random() * firstNames.length);
            int randomLast = (int) (Math.random() * firstNames.length);
            System.out.println("Random generated name: " + firstNames[randomFirst] + " " + lastNames[randomLast]);
        }
    }
}
