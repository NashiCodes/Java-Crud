package com.crud.javacrud.db;

import java.sql.*;

public class MySqlConnection {
    private static  String url;
    private static final String user = "root";
    private static final String password = "root";

    public static Connection createConnection(){
        url = "jdbc:mysql://localhost:3306/java_crud?useSSL=false&serverTimezone=UTC";
        Connection connection = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(url, user, password);
        }catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }
        return connection;
    }
}