package Delete;

import java.sql.*;

public class jdbcDeleteStudent {
    public static void main(String[] args) throws SQLException {
        String sql = "delete from atria.student where s_id=6";

        String url = "jdbc:mysql://localhost:3306/atria";
        String user = "root";
        String password = "Ananth@123";

        Connection conn = DriverManager.getConnection(url, user, password);
        Statement st = conn.createStatement();
        int count = st.executeUpdate(sql);
        System.out.println(count+" row deleted");
    }
}
