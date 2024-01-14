<%-- 
    Document   : index
    Created on : 14 ene 2024, 12:12:27
    Author     : Javier
--%>

<%@page import="com.mycompany.ejercicio_integrador.logica.Partido"%>
<%@page import="com.mycompany.ejercicio_integrador.logica.Equipo"%>
<%@page import="java.util.List"%>
<%@page import="com.mycompany.ejercicio_integrador.persistencia.ControladoraEquipo"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css">
        <style>
            body {
                background-color: #343a40;
                display: flex;
                align-items: center;
                justify-content: center;
                height: 100vh;
                margin: 0;
            }
            .half-width {
                width: 25%; 
                margin: 20px; 
                box-sizing: border-box;
            }
            .clear {
                clear: both; 
            }
            .container {
                background-color: #ffffff;
                border-radius: 10px;
                padding: 20px;
                margin-bottom: 20px;
                border: 4px solid #000; 
            }
            h1, h2 {
                color: #343a40;
            }
            .form-group {
                margin-bottom: 15px;
            }
            label {
                color: #007bff;
            }
            input[type="text"], input[type="date"], input[type="number"] {
                width: 100%;
                padding: 8px;
                margin: 4px 0;
                display: inline-block;
                border: 1px solid #ced4da;
                border-radius: 4px;
                box-sizing: border-box;
                text-align: center; 
            }
            select {
                width: 100%;
                padding: 8px;
                margin: 4px 0;
                display: inline-block;
                border: 1px solid #ced4da;
                border-radius: 4px;
                box-sizing: border-box;
                text-align-last: center; 
            }
            button {
                background-color: #28a745;
                color: #ffffff;
                border: none;
                padding: 10px 20px;
                border-radius: 5px;
                cursor: pointer;
            }
            table {
                background-color: #ffffff;
                border-radius: 10px;
                box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
            }
            th, td {
                text-align: center;
            }
        </style>
        <title>Partidos</title>
    </head>
    <body>
        <div class="container mb-3">

            <form action="SvEquipo" method="POST" class="text-center">
                <div class="form-group">
                    <h1>Registrar Equipo</h1><br><br>
                    <label class="form-label" for="nombre" class="form-label">Nombre del Equipo: </label>
                    <input type="text" name="nombre"> 
                    <button class="btn btn-primary" type="submit">Registrar Equipo</button>
                </div><br>                
            </form>
        </div>

        <div class="container mb-3 clear">

            <form action="SvPartido" method="POST" class="text-center">
                <h1>Registrar Partido</h1><br><br>
                <label class="form-label" for="equipoLocal">Local:</label>
                <select name="equipoLocal" id="equipoLocal">
                    <%
                        ControladoraEquipo controladoraEquipo = new ControladoraEquipo();
                        List<Equipo> equipos = controladoraEquipo.traerEquipos();

                        for (Equipo equipo : equipos) {
                    %>
                    <option value="<%=equipo.getId()%>"><%=equipo.getNombre()%></option>
                    <%
                        }
                    %>
                </select>
                <br>

                <label class="form-label" for="equipoVisitante">Equipo Visitante:</label>
                <select name="equipoVisitante" id="equipoVisitante">
                    <%
                        for (Equipo equipo : equipos) {
                    %>
                    <option value="<%=equipo.getId()%>"><%=equipo.getNombre()%></option>
                    <%
                        }
                    %>
                </select>
                <br>

                <label class="form-label" for="fecha">Fecha del partido:</label>
                <input type="date" name="fecha" required>
                <br>

                <label class="form-label" for="puntuacionEquipoLocal">Puntuación Local:</label>
                <input type="number" name="puntuacionEquipoLocal" required>
                <br>

                <label class="form-label" for="puntuacionEquipoVisitante">Puntuación Visitante:</label>
                <input type="number" name="puntuacionEquipoVisitante" required>
                <br>

                <button class="btn btn-success" type="submit">Registrar partido</button>
            </form>
        </div>

        <br>   
        <div class="container mb-3">

            <form action ="SvPartido" method="GET" class="text-center">
                <h1>Resultados</h1><br><br>
                <button class="btn btn-primary" type="submit">Mostrar Resultados</button>            
            </form><br><br>
            <% if (request.getAttribute("partidos") != null) { %>
            <table class="table mx-auto">
                <thead>
                    <tr>
                        <th class="table-primary" scope="col">Fecha</th>
                        <th class="table-secondary" scope="col">Local</th>
                        <th class="table-primary"scope="col">Visitante</th>
                        <th class="table-secondary" scope="col">Puntuación Local</th>
                        <th class="table-primary"scope="col">Puntuación Visitante</th>
                    </tr>
                </thead>  
                <tbody>
                    <% for (Partido partido : (List<Partido>) request.getAttribute("partidos")) {%>
                    <tr>
                        <td class="table-success" scope="row"><%= partido.getFecha()%></td>
                        <td class="table-danger" scope="row"><%= partido.getLocal().getNombre()%></td>
                        <td class="table-success" scope="row"><%= partido.getVisitante().getNombre()%></td>
                        <td class="table-danger" scope="row"><%= partido.getPuntuacionLocal()%></td>
                        <td class="table-success" scope="row"><%= partido.getPuntuacionVisitante()%></td>
                    </tr>
                    <% }%>
                </tbody>
            </table>
            <% }%>
        </div>
    </body>
</html>
