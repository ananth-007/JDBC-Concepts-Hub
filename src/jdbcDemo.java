import java.sql.*;

public class jdbcDemo {
    public static void main(String[] args) throws SQLException {
        String sql = "SELECT student.s_name FROM atria.student where s_id = 3";

        String url = "jdbc:mysql://localhost:3306/atria";
        String username = "root";
        String password = "Ananth@123";
        Connection conn = DriverManager.getConnection(url,username,password);

        Statement st = conn.createStatement();
        ResultSet res = st.executeQuery(sql);
        res.next();
        String name = res.getString(1);
        System.out.println(name);
    }
}
