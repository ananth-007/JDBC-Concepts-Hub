package Update;

import java.sql.*;

public class jdbcUpdateStudent {
    public static void main(String[] args) throws SQLException {
        String sql = "update atria.student set s_name='Dhanveer' where s_id = 7; ";

        String url = "jdbc:mysql://localhost:3306/atria";
        String user = "root";
        String password = "Ananth@123";

        Connection conn = DriverManager.getConnection(url, user, password);
        Statement st = conn.createStatement();
        int count = st.executeUpdate(sql);
        System.out.println(count+" row updated");
    }
}
