package com.avn.tns.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtil {

    private static final String DRIVER = "org.postgresql.Driver";
    private static final String URL = "jdbc:postgresql://localhost:5432/AVN";
    private static final String USERNAME = "postgres";
    private static final String PASSWORD = "1234";

    public static Connection getConnection() {
        Connection con = null;
        try {
            Class.forName(DRIVER);
            System.out.println("Driver loaded successfully");

            con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            System.out.println("Connection established");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }
}
