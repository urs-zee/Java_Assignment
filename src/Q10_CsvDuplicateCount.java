import java.io.*;
import java.util.*;

public class Q10_CsvDuplicateCount {
    public static void main(String[] args) throws Exception {
        HashMap<String, Integer> map = new HashMap<>();
        String line;

        try (BufferedReader br = new BufferedReader(new FileReader("data.csv"))) {
            while ((line = br.readLine()) != null) {
                String[] a = line.split(",");
                map.put(a[2], map.getOrDefault(a[2], 0) + 1);
            }
        }

        for (String k : map.keySet()) {
            System.out.println(k + " " + map.get(k));
        }
    }
}
