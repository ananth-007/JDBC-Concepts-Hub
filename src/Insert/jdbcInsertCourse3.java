package Insert;

import java.sql.*;

public class jdbcInsertCourse3 {
    public static void main(String[] args) throws SQLException {
        int id = 109;
        String name = "BCA";
        int sid = 7;

        String sql = "insert into atria.course values (?,?,?)";

        String url = "jdbc:mysql://localhost:3306/atria";
        String user = "root";
        String password = "Ananth@123";

        Connection conn = DriverManager.getConnection(url, user, password);
        PreparedStatement st = conn.prepareStatement(sql);
        st.setInt(1,id);
        st.setString(2,name);
        st.setInt(3,sid);
        int count = st.executeUpdate();
        System.out.println(count+" row inserted");

    }
}
