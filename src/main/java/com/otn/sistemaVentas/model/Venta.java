package com.otn.sistemaVentas.model;

public class Venta {
    private int id;
    private String comprador;
    private double montoTotal;

    public Venta() {
    }

    public Venta(int id, String comprador, double montoTotal) {
        this.id = id;
        this.comprador = comprador;
        this.montoTotal = montoTotal;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getComprador() {
        return comprador;
    }

    public void setComprador(String comprador) {
        this.comprador = comprador;
    }

    public double getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(double montoTotal) {
        this.montoTotal = montoTotal;
    }
}

