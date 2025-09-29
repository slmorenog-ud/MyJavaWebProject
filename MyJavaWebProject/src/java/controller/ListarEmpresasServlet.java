package controller;
import model.Directorio;
import model.Empresa;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

@WebServlet("/directorio")
public class ListarEmpresasServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 1. Obtener la lista de empresas del directorio
        List<Empresa> empresas = Directorio.getInstancia().listarEmpresas();

        // 2. Añadir la lista de empresas como un atributo en el request
        request.setAttribute("empresas", empresas);

        // 3. Reenviar la solicitud al JSP para que muestre los datos
        request.getRequestDispatcher("/directorio.jsp").forward(request, response);
    }
}
