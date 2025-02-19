package Insert;

import java.sql.*;

public class jdbcInsertStudent {
    public static void main(String[] args) throws SQLException {
        String sql = "insert into atria.student(s_id, s_name) values (5,'Darshan');";

        String url = "jdbc:mysql://localhost:3306/atria";
        String user = "root";
        String password = "Ananth@123";

        Connection conn = DriverManager.getConnection(url, user, password);
        Statement st = conn.createStatement();
        int count = st.executeUpdate(sql);
        System.out.println(count);

    }
}
