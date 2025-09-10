import java.io.FileWriter;
import java.io.IOException;

public class FibonacciCsv {
    public static void main(String[] args) {
        int count = 60;
        long[] fibo = new long[count];
        fibo[0] = 0;
        fibo[1] = 1;
        for (int i = 2; i < count; i++) {
            fibo[i] = fibo[i - 1] + fibo[i - 2];
        }
        try (FileWriter writer = new FileWriter("fibonacci.csv")) {
            for (int i = 0; i < count; i++) {
                writer.append(Long.toString(fibo[i]));
                writer.append("\n");
            }
            System.out.println("Fibonacci written");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
