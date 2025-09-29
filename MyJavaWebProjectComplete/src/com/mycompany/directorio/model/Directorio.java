package com.mycompany.directorio.model;

import java.util.ArrayList;
import java.util.List;

public class Directorio {
    private static Directorio instancia;
    private List<Empresa> empresas;

    private Directorio() {
        empresas = new ArrayList<>();
    }

    public static synchronized Directorio getInstancia() {
        if (instancia == null) {
            instancia = new Directorio();
        }
        return instancia;
    }

    public void agregarEmpresa(Empresa e) {
        empresas.add(e);
    }

    public List<Empresa> listarEmpresas() {
        return new ArrayList<>(empresas); // Devuelve una copia para evitar modificaciones externas
    }

    public void clear() {
        empresas.clear();
    }
}