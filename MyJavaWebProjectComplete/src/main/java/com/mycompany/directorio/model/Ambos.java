package com.mycompany.directorio.model;

public class Ambos extends Empresa {
    public Ambos(String nombre, String sector, String telefono, String email, String ciudad) {
        super(nombre, sector, telefono, email, ciudad);
    }

    @Override
    public String getTipo() {
        return "Ambos";
    }

    @Override
    public String mostrarInfo() {
        return super.mostrarInfo() + ", Tipo: Ambos";
    }
}