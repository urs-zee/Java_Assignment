import java.sql.*;

public class Q3_DbRead {
    public static void main(String[] args) throws Exception {
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery("SELECT * FROM test")) {

            while (rs.next()) {
                System.out.println(rs.getString("emp_name") + " " + rs.getInt("emp_age"));
            }
        }
    }
}
