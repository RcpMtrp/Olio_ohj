import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        System.out.println("Weight in grams?");
        int weightInGrams = scanner.nextInt();

        int grams = 1;
        double luoti = grams * 13.28;
        double naula = 32 * luoti;
        double leiviskä = 20 * naula;
        //System.out.println(leiviskä);

        int leiviskäCount = (int)(weightInGrams / leiviskä);
        //System.out.println(leiviskäCount);
        double remainingLeiviskä = weightInGrams - (leiviskäCount * leiviskä);
        //System.out.println(remainingLeiviskä);
        int naulaCount = (int)(remainingLeiviskä / naula);
        //System.out.println(naulaCount);
        double remainingNaula = remainingLeiviskä - (naulaCount * naula);
        //System.out.println(remainingNaula);
        double luotiCount = (remainingNaula / luoti);
        //System.out.println(luotiCount);
        //System.out.printf(weightInGrams, " grams is " leiviskäCount, " leiviskä, ", naulaCount, );
        System.out.printf(" %d grams is %d leiviskä, %d naula, and %.2f luoti", weightInGrams, leiviskäCount, naulaCount,luotiCount);





    }
}
