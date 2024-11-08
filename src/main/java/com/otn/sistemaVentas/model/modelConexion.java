package com.otn.sistemaVentas.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class modelConexion {
    private static final String URL = "jdbc:mysql://127.0.0.1:3306/OTN";
    private static final String USER = "root";
    private static final String PASSWORD = "WilsonGordo31";

    public static Connection getConnection(){
        Connection connection = null;

        try {
            connection = DriverManager.getConnection(URL,USER, PASSWORD);
        }catch (SQLException e){
            System.err.println("Error al conectar: " + e.getMessage());
        }

        return connection;
    }
}
