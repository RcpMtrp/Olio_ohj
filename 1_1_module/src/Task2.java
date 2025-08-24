public class Task2 {
    public static void main(String[] args) {
        int rows = 4;
        for(int i = 1; i <= rows; i++){
            for(int j = 1; j <= rows - i; j++){
                System.out.print(" ");
            }
            for(int l = 1; l <= (2 * i -1); l++){
                System.out.print("*");
            }
            System.out.println();}



    }
}