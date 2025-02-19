package Insert;

import java.sql.*;

public class jdbcInsertStudent2 {
    public static void main(String[] args) throws SQLException{
        int id = 6;
        String name = "Sudeep";
        String sql = "insert into atria.student values ("+ id + "," + name + ");";

        String url = "jdbc:mysql://localhost:3306/atria";
        String username = "root";
        String password = "Ananth@123";
        Connection conn = DriverManager.getConnection(url,username,password);

        Statement st = conn.createStatement();
        int count = st.executeUpdate(sql);
        System.out.println(count+" row inserted");
    }
}
