package org.example.db;
import java.sql.Connection;
import java.sql.DriverManager;
public class DBConnection {
    private static final String URL =
            "jdbc:mysql://localhost:3306/railway";
    private static final String USER = "root";
    private static final String PASSWORD = "abhihaina";

    public static Connection getConnection() {

        Connection con = null;

        try {
            // Register JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Create connection
            con = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("✅ Database connected successfully");

        } catch (Exception e) {
            e.printStackTrace();
        }

        return con;
    }
}
