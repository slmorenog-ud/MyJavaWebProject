<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
<head>
  <meta charset="UTF-8">
  <title>Directorio Empresarial - Añadir Empresa</title>
  <link rel="stylesheet" href="estilos-formulario.css">
  <link rel="preconnect" href="https://fonts.googleapis.com">
  <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
  <link href="https://fonts.googleapis.com/css2?family=Inter:wght@400;500;600;700&display=swap" rel="stylesheet">
</head>
<body>

  <div class="form-container">
    <div class="form-header">
      <h1>Directorio Empresarial</h1>
      <p>Añadir una nueva empresa</p>
    </div>

    <form id="directorio-form" action="agregar" method="post">

      <div class="form-group">
        <label for="empresa">Nombre de la Empresa:</label>
        <input type="text" id="empresa" name="empresa" placeholder="Ej: Tu empresa S.A." required>
      </div>

      <div class="form-group">
        <label for="sector">Sector:</label>
        <div class="custom-select">
          <select id="sector" name="sector" required>
            <option value="">Seleccione un sector</option>
            <option value="Agricultura">Agricultura</option>
            <option value="Manufactura">Manufactura</option>
            <option value="Tecnología">Tecnología</option>
            <option value="Servicios">Servicios</option>
            <option value="Comercio">Comercio</option>
            <option value="Construcción">Construcción</option>
            <option value="Salud">Salud</option>
            <option value="Educación">Educación</option>
            <option value="Otro">Otro</option>
          </select>
          <span class="custom-arrow"></span>
        </div>
      </div>

      <div class="form-group">
        <label for="telefono">Teléfono:</label>
        <input type="tel" id="telefono" name="telefono" placeholder="Ej: +1-234-567-8901" required>
      </div>

      <div class="form-group">
        <label for="email">Correo Electrónico:</label>
        <input type="email" id="email" name="email" placeholder="Ej: contacto@empresa.com" required>
      </div>

      <div class="form-group">
        <label for="tipo">Tipo:</label>
        <div class="custom-select">
          <select id="tipo" name="tipo" required>
            <option value="">Seleccione un tipo</option>
            <option value="Cliente">Cliente</option>
            <option value="Proveedor">Proveedor</option>
            <option value="Ambos">Ambos</option>
          </select>
          <span class="custom-arrow"></span>
        </div>
      </div>

      <div class="form-group">
        <label for="ciudad">Ciudad:</label>
        <input type="text" id="ciudad" name="ciudad" placeholder="Ej: Bogotá D.C." required>
      </div>

      <div class="form-buttons">
        <button type="submit">Guardar Empresa</button>
        <a href="directorio" class="view-button">Ver Directorio</a>
      </div>
    </form>
  </div>

</body>
</html>