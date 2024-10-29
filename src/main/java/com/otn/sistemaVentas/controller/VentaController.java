package com.otn.sistemaVentas.controller;

import com.otn.sistemaVentas.model.Venta;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class VentaController {
    @FXML
    private TextField compradorField;
    @FXML
    private TextField montoField;

    @FXML
    public void registrarVenta() {
        String comprador = compradorField.getText();
        double monto = Double.parseDouble(montoField.getText());
        Venta nuevaVenta = new Venta(1, comprador, monto);
        System.out.println("Venta registrada: " + nuevaVenta.getComprador());
    }
}
