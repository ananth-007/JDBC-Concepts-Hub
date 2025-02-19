package Select;

import java.sql.*;

public class jdbcSelectStudent {
    public static void main(String[] args) throws SQLException{
        String sql = "SELECT * FROM atria.student";

        String url = "jdbc:mysql://localhost:3306/atria";
        String username = "root";
        String password = "Ananth@123";
        Connection conn = DriverManager.getConnection(url,username,password);

        Statement st = conn.createStatement();
        ResultSet res = st.executeQuery(sql);
        String data = " ";
        while(res.next()){
            data = res.getInt(1) + ": " + res.getString(2);
            System.out.println(data);
        }
    }
}
