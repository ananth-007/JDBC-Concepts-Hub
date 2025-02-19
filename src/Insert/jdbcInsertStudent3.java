package Insert;

import java.sql.*;

public class jdbcInsertStudent3 {
    public static void main(String[] args) throws SQLException{
        int id = 7;
        String name = "Puneeth";

        String sql = "insert into atria.student values (?,?)";

        String url = "jdbc:mysql://localhost:3306/atria";
        String user = "root";
        String password = "Ananth@123";

        Connection conn = DriverManager.getConnection(url, user, password);
        PreparedStatement st = conn.prepareStatement(sql);
        st.setInt(1,id);
        st.setString(2,name);
        int count = st.executeUpdate();
        System.out.println(count+" row inserted");
    }
}
