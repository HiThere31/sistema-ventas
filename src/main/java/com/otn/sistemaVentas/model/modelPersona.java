package com.otn.sistemaVentas.model;

import java.time.LocalDate;
import java.util.Objects;

public class modelPersona {
    private String nombre;
    private String apellido;
    private LocalDate fechaNacimiento;
    private int edad;
    private String sexo;
    private String numeroIdentificacion;

    public modelPersona() {
    }

    public modelPersona(String nombre, String apellido, LocalDate fechaNacimiento, int edad, String sexo, String numeroIdentificacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.edad = edad;
        this.sexo = sexo;
        this.numeroIdentificacion = numeroIdentificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    public void setNumeroIdentificacion(String numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        modelPersona that = (modelPersona) o;
        return edad == that.edad && Objects.equals(nombre, that.nombre) && Objects.equals(apellido, that.apellido) && Objects.equals(fechaNacimiento, that.fechaNacimiento) && Objects.equals(sexo, that.sexo) && Objects.equals(numeroIdentificacion, that.numeroIdentificacion);
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(nombre);
        result = 31 * result + Objects.hashCode(apellido);
        result = 31 * result + Objects.hashCode(fechaNacimiento);
        result = 31 * result + edad;
        result = 31 * result + Objects.hashCode(sexo);
        result = 31 * result + Objects.hashCode(numeroIdentificacion);
        return result;
    }

    @Override
    public String toString() {
        return "modelPersona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", edad=" + edad +
                ", sexo='" + sexo + '\'' +
                ", numeroIdentificacion='" + numeroIdentificacion + '\'' +
                '}';
    }
}
