package com.mycompany.directorio.model;

public class Proveedor extends Empresa {
    public Proveedor(String nombre, String sector, String telefono, String email, String ciudad) {
        super(nombre, sector, telefono, email, ciudad);
    }

    @Override
    public String getTipo() {
        return "Proveedor";
    }

    @Override
    public String mostrarInfo() {
        return super.mostrarInfo() + ", Tipo: Proveedor";
    }
}