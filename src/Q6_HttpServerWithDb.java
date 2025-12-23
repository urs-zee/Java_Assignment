import com.sun.net.httpserver.*;
import java.io.*;
import java.net.*;
import java.sql.*;

public class Q6_HttpServerWithDb {
    public static void main(String[] args) throws Exception {
        HttpServer server = HttpServer.create(new InetSocketAddress(8080), 0);

        server.createContext("/emp", exchange -> {
            String data = "";
            try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
                 Statement st = con.createStatement();
                 ResultSet rs = st.executeQuery("SELECT * FROM test")) {
                
                while (rs.next()) {
                    data += rs.getString("emp_name") + " " + rs.getInt("emp_age") + "\n";
                }
            } catch (SQLException e) {
                data = "Error: " + e.getMessage();
            }

            exchange.sendResponseHeaders(200, data.length());
            try (OutputStream os = exchange.getResponseBody()) {
                os.write(data.getBytes());
            }
        });

        server.start();
        System.out.println("Server started at http://localhost:8080/emp");
    }
}
