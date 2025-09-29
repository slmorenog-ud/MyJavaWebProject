package controller;

import model.*;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/agregar")
public class AgregarEmpresaServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 1. Recoger los valores de los campos del formulario
        String nombre = request.getParameter("empresa");
        String sector = request.getParameter("sector");
        String telefono = request.getParameter("telefono");
        String email = request.getParameter("email");
        String tipo = request.getParameter("tipo");
        String ciudad = request.getParameter("ciudad");

        // 2. Crear el objeto de la nueva empresa según el tipo
        Empresa nuevaEmpresa = null;
        switch (tipo) {
            case "Cliente":
                nuevaEmpresa = new Cliente(nombre, sector, telefono, email, ciudad);
                break;
            case "Proveedor":
                nuevaEmpresa = new Proveedor(nombre, sector, telefono, email, ciudad);
                break;
            case "Ambos":
                nuevaEmpresa = new Ambos(nombre, sector, telefono, email, ciudad);
                break;
            default:
                // Manejar un tipo no válido si es necesario
                break;
        }

        // 3. Añadir la nueva empresa al directorio
        if (nuevaEmpresa != null) {
            Directorio.getInstancia().agregarEmpresa(nuevaEmpresa);
        }

        // 4. Redirigir al usuario a la página del directorio
        response.sendRedirect(request.getContextPath() + "/directorio");
    }
}