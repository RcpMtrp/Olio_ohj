import java.util.Scanner;

public class MaximumSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of integers");
        int size = scanner.nextInt();

        int[] numbers = new int[size];

        System.out.println("Enter the integers");

        for (int i = 0; i < size; i++ ) {
        numbers[i] = scanner.nextInt();}

        int maxSum = numbers[0];
        int startIndex = 0;
        int endIndex = 0;

        for (int i = 0; i < size; i++ ) {
            int currentSum = 0;
            for  (int j = i; j < size; j++ ) {
                currentSum += numbers[j];
                if(i == 0 && j == 0){
                    maxSum = currentSum;
                    System.out.println(currentSum);
                    startIndex = i;
                    System.out.println(startIndex);
                    endIndex = j;
                    System.out.println(endIndex);
                } else if (currentSum > maxSum) {
                    maxSum = currentSum;
                    startIndex = i;
                    System.out.println(startIndex);
                    endIndex = j;
                    System.out.println(endIndex);
                }
            }
        }
        System.out.println("Maximum sum is " + maxSum);
        System.out.println("Integers: " + startIndex  + "-" + endIndex);

    }




}
