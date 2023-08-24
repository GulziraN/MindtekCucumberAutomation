package practiceJDBC;

import utilities.JDBCUtils;

import java.sql.*;
import java.util.List;
import java.util.Map;

public class Project {

    public static void main(String[] args) throws SQLException {

        Connection connection = DriverManager.getConnection(
                "jdbc:postgresql://3.137.169.132:5432/elardb",
                "impleyer",
                "ciforest");

        Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        ResultSet resultSet = statement.executeQuery("select * from core_company where company_name = 'Withards'");
        while (resultSet.next()) {
            //  System.out.println(resultSet.getString(1));
            //  System.out.println(resultSet.getString("first_name"));
            System.out.println(resultSet.getString(2));

        }
    }
}