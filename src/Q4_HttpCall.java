import java.io.*;
import java.net.*;

public class Q4_HttpCall {
    public static void main(String[] args) throws Exception {
        URL url = URI.create("http://127.0.0.1:8999/test?value=p").toURL();
        HttpURLConnection con = (HttpURLConnection) url.openConnection();

        try (BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        }
    }
}
