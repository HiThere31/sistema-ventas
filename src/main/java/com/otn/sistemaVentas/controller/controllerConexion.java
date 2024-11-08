package com.otn.sistemaVentas.controller;

import java.sql.Connection;
import java.sql.SQLException;
import com.otn.sistemaVentas.model.modelConexion;
import com.otn.sistemaVentas.view.viewConsole;

public class controllerConexion {

    private viewConsole vista;

    public controllerConexion(viewConsole vista) {
        this.vista = vista;
    }

    public void abrirConexion() {
        Connection connection = modelConexion.getConnection();

        if (connection != null) {
            try {
                connection.close();
                vista.mostrarMensaje("Conexion establecida");
            } catch (SQLException e) {
                vista.mostrarError("Conexion presenta errores: " + e.getMessage());
            }
        } else {

        }
    }

}
