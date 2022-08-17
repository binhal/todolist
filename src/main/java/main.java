import java.sql.*;

public class main {
    private static final String QUERY = "select * from department";

    public static void main(String[] args) throws SQLException {
//        Step 1: Establishing connection
        Connection connection = DriverManager
                .getConnection("jdbc:mysql://localhost:3306/test?enabledTLSProtocols=TLSv1.2", "root", "350003");
//        Step 2: create a statement with connection object
        Statement st = connection.createStatement();
//        Step 3: use a query to get data from database
        ResultSet rs = st.executeQuery(QUERY);
//        Step 4: process the resultset
        while (rs.next()) {
            int dept_id = rs.getInt("dept_id");
            String dept_name = rs.getString("dept_name");
            String dept_no =rs.getString("dept_no");
            String location = rs.getString("location");
            System.out.println(dept_id + ", " + dept_name + ", " + dept_no + "," + location);
        }


        System.out.println("Connected!");
    }
}
