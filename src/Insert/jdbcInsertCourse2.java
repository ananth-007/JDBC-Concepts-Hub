package Insert;

import java.sql.*;

public class jdbcInsertCourse2 {
    public static void main(String[] args) throws SQLException {
        int c_id = 108;
        String c_name = "ME";
        int s_id = 4;

        String sql = "insert into atria.course values ("+c_id+",'"+c_name+"',"+s_id+")";

        String url = "jdbc:mysql://localhost:3306/atria";
        String username = "root";
        String password = "Ananth@123";
        Connection conn = DriverManager.getConnection(url,username,password);

        Statement st = conn.createStatement();
        int count = st.executeUpdate(sql);
        System.out.println(count+" row inserted");
    }
}
