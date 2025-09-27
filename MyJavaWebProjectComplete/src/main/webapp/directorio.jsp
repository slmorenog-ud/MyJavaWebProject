<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="es">
<head>
  <meta charset="UTF-8">
  <title>Directorio Empresarial - Contactos</title>
  <link rel="stylesheet" href="css/estilos-directorio.css">
  <link rel="preconnect" href="https://fonts.googleapis.com">
  <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
  <link href="https://fonts.googleapis.com/css2?family=Inter:wght@400;500;600;700&display=swap" rel="stylesheet">
</head>
<body>

  <div class="header-container">
    <h1>Directorio Empresarial</h1>
    <div class="nav-links">
      <a href="${pageContext.request.contextPath}/" class="nav-button">Añadir Nueva Empresa</a>
    </div>
  </div>

  <div id="directorio-container">
    <c:choose>
      <c:when test="${not empty empresas}">
        <table class="directorio-table">
          <thead>
            <tr>
              <th>Empresa</th>
              <th>Sector</th>
              <th>Teléfono</th>
              <th>Correo Electrónico</th>
              <th>Tipo</th>
              <th>Ciudad</th>
            </tr>
          </thead>
          <tbody>
            <c:forEach var="empresa" items="${empresas}">
              <tr>
                <td><c:out value="${empresa.nombre}" /></td>
                <td><c:out value="${empresa.sector}" /></td>
                <td><c:out value="${empresa.telefono}" /></td>
                <td><c:out value="${empresa.email}" /></td>
                <td><span class="badge ${empresa.tipo.toLowerCase()}"><c:out value="${empresa.tipo}" /></span></td>
                <td><c:out value="${empresa.ciudad}" /></td>
              </tr>
            </c:forEach>
          </tbody>
        </table>
      </c:when>
      <c:otherwise>
        <div id="no-data-message">
          <h3>No hay empresas en el directorio.</h3>
          <p>Ve a la página de formulario para añadir una.</p>
        </div>
      </c:otherwise>
    </c:choose>
  </div>

</body>
</html>