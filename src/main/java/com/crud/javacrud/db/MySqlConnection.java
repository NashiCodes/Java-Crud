package com.crud.javacrud.db;

import java.sql.*;

public class MySqlConnection {
    private static final String url = "jdbc:mysql://localhost:3306/java_crud";
    private static final String user = "root";
    private static final String password = "root";

    public static Connection getConnection(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loaded!");
        } catch (ClassNotFoundException e) {
            System.out.println("No driver found! " + e.getMessage());
        }

        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to database!");
            return connection;
        } catch (SQLException e) {
            System.out.println("Connection failed!" + e.getMessage());
            return null;
        }
    }
}