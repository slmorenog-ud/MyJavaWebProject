package com.mycompany.directorio.model;

public class Cliente extends Empresa {
    public Cliente(String nombre, String sector, String telefono, String email, String ciudad) {
        super(nombre, sector, telefono, email, ciudad);
    }

    @Override
    public String getTipo() {
        return "Cliente";
    }

    @Override
    public String mostrarInfo() {
        return super.mostrarInfo() + ", Tipo: Cliente";
    }
}