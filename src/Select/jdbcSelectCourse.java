package Select;

import java.sql.*;

public class jdbcSelectCourse {
    public static void main(String[] args) throws SQLException {
        String sql = "SELECT * FROM atria.course";

        String url = "jdbc:mysql://localhost:3306/atria";
        String user = "root";
        String password = "Ananth@123";

        Connection conn = DriverManager.getConnection(url, user, password);
        Statement st = conn.createStatement();
        ResultSet res = st.executeQuery(sql);
        String data = " ";
        while(res.next()){
            data = res.getInt(1)+": "+res.getString(2);
            System.out.println(data);
        }


    }
}
