package com.example.restcrudexample.connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SingletonConnection {
    private  static final Connection connection;
    private  static final  String username="root";
    private  static final String password   = "";
    static {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            connection= DriverManager.getConnection("jdbc:mysql://localhost" +
                    ":3306/test",username,password);
            System.out.println("connected");



        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    public  static  Connection getConnection(){
        return  connection;
    }
}
