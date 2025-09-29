package com.mycompany.directorio.model;

public abstract class Empresa {
    private String nombre;
    private String sector;
    private String telefono;
    private String email;
    private String ciudad;

    public Empresa(String nombre, String sector, String telefono, String email, String ciudad) {
        this.nombre = nombre;
        this.sector = sector;
        this.telefono = telefono;
        this.email = email;
        this.ciudad = ciudad;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getSector() {
        return sector;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getEmail() {
        return email;
    }

    public String getCiudad() {
        return ciudad;
    }

    public abstract String getTipo();

    public String mostrarInfo() {
        return "Nombre: " + nombre + ", Sector: " + sector + ", Teléfono: " + telefono + ", Email: " + email + ", Ciudad: " + ciudad;
    }
}