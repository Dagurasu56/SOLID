package SOLID.src.srp;

import java.sql.Connection;
import java.sql.Statement;

public class EmployeeRepository {
    public void save(Employee employee) {
        String objectStr = MyUtils.serializeIntoAString(employee);
        Connection connection = null;
        Statement stmt = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            stmt = connection.createStatement();
            stmt.execute("INSERT INTO EMPLOYEES VALUES (" + objectStr + ")");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
