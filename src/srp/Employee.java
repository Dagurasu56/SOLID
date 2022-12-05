package SOLID.src.srp;

import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.Connection;

public class Employee {
    private String employeeId;
    private String employeeName;
    private String employeeAddress;
    private String contactNumber;
    private String employeeType;

    public void save() {
        String objectStr = MyUtils.serializeIntoAsString(this);
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

    public void calculateTax() {
        if (this.getEmployeeType().equals("fulltime")) {

        }

        if (this.getEmployeeType().equals("contract")) {

        }
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeAdddress() {
        return employeeAddress;
    }

    public void setEmployeeAddress(String employeeAddress) {
        this.employeeAddress = employeeAddress;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getEmployeeType() {
        return employeeType;
    }

    public void setEmployeeType(String employeeType) {
        this.employeeType = employeeType;
    }

}