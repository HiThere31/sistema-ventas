package com.otn.sistemaVentas.model;

import java.time.LocalDate;
import java.util.Date;

public class modelEmpleado extends modelPersona {

    private String id;
    private String email;
    private String telefono;
    private String direccion;
    private boolean isActivo;
    private LocalDate fechaRegistro;
    private boolean isAdmin;

    public modelEmpleado() {
    }

    public modelEmpleado(String id, String email, String telefono, String direccion, boolean isActivo, LocalDate fechaRegistro, boolean isAdmin) {
        this.id = id;
        this.email = email;
        this.telefono = telefono;
        this.direccion = direccion;
        this.isActivo = isActivo;
        this.fechaRegistro = fechaRegistro;
        this.isAdmin = isAdmin;
    }

    public modelEmpleado(String nombre, String apellido, LocalDate fechaNacimiento, int edad, String sexo, String numeroIdentificacion,
                         String id, String email, String telefono, String direccion, boolean isActivo, LocalDate fechaRegistro, boolean isAdmin) {
        super(nombre, apellido, fechaNacimiento, edad, sexo, numeroIdentificacion);
        this.id = id;
        this.email = email;
        this.telefono = telefono;
        this.direccion = direccion;
        this.isActivo = isActivo;
        this.fechaRegistro = fechaRegistro;
        this.isAdmin = isAdmin;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public boolean isActivo() {
        return isActivo;
    }

    public void setActivo(boolean activo) {
        isActivo = activo;
    }

    public LocalDate getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(LocalDate fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }
}
