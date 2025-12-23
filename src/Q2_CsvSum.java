import java.io.*;

public class Q2_CsvSum {
    public static void main(String[] args) throws Exception {
        try (BufferedReader br = new BufferedReader(new FileReader("input.csv"));
             BufferedWriter bw = new BufferedWriter(new FileWriter("../output/output.csv"));
) {

            String line;
            while ((line = br.readLine()) != null) {
                String[] a = line.split(",");
                int sum = Integer.parseInt(a[0]) + Integer.parseInt(a[1]) + Integer.parseInt(a[2]);
                bw.write(line + "," + sum);
                bw.newLine();
            }
        }
    }
}
