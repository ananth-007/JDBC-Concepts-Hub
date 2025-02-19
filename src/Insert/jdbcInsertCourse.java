package Insert;

import java.sql.*;

public class jdbcInsertCourse {
    public static void main(String[] args) throws SQLException {
        String sql = "insert into atria.course(c_id,c_name,s_id) values (107,'CV',5);";

        String url = "jdbc:mysql://localhost:3306/atria";
        String user = "root";
        String password = "Ananth@123";

        Connection conn = DriverManager.getConnection(url, user, password);
        Statement st = conn.createStatement();
        int count = st.executeUpdate(sql);
        System.out.println(count);
    }
}
