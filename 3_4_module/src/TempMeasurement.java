import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class TempMeasurement {
    public static void main(String[] args) {
        String url = "https://users.metropolia.fi/~jarkkov/temploki.csv";
        String targetDate = "01.01.2023";
        int count = 0;
        double sum = 0;

        try {
            URL source = new URL(url);
            BufferedReader reader = new BufferedReader(new InputStreamReader(source.openStream()));
            String line = reader.readLine();
            if (line == null) return;
            line = line.replace("\uFEFF", "");
            String[] headers = line.split(";");
            int aikaIndex = -1;
            int ulkoTaloIndex = -1;
            for (int i = 0; i < headers.length; i++) {
                String header = headers[i].trim();
                if (header.equals("Aika")) aikaIndex = i;
                if (header.equals("UlkoTalo")) ulkoTaloIndex = i;
            }

            if (aikaIndex == -1 || ulkoTaloIndex == -1) {
                System.out.println("No columns found.");
                return;
            }

            while ((line = reader.readLine()) != null) {
                String[] fields = line.split(";");
                if (fields.length <= Math.max(aikaIndex, ulkoTaloIndex)) continue;
                String timestamp = fields[aikaIndex].trim();
                String datePart = timestamp.split(" ")[0].trim();
                if (datePart.equals(targetDate)) {
                    try {
                        String rawTemp = fields[ulkoTaloIndex].trim().replace(",", ".");
                        double temp = Double.parseDouble(rawTemp);
                        sum += temp;
                        count++;
                    } catch (Exception e) {
                    }
                }
            }
            reader.close();
            if (count > 0) {
                double average = sum / count;
                System.out.printf("Average temperature on %s: is %.2f°C%n", targetDate, average);
            } else {
                System.out.println("No data found.");
            }
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
