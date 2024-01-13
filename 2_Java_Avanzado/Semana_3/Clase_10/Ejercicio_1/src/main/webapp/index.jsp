<%-- 
    Document   : index
    Created on : 11 ene 2024, 23:03:17
    Author     : Javier
--%>

<%@page import="java.util.Map"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.mycompany.ejercicio_1.logica.Votos"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
        <title>Votaciones</title>
    </head>
    <body>
        <div class="container mt-4">
            <h1>Votaciones</h1>
            <form action="SvVotos" method="POST">
                <div class="form-group">
                    <input type="radio" name="partido" value="Partido A"> Partido A
                </div>
                <div class="form-group">
                    <input type="radio" name="partido" value="Partido B"> Partido B
                </div>
                <div class="form-group">
                    <input type="radio" name="partido" value="Partido C"> Partido C
                </div>
                <button class="btn btn-primary" type="submit">Votar</button>
            </form><br>
            <form action="SvVotos" method="GET">
                <button class="btn btn-success" type="submit">Mostrar Resultados</button>
            </form><br>
        </div>

        <div class="container mt-2">
            <% if (request.getAttribute("resultados") != null) {
                    Map<String, Long> resultados = (Map<String, Long>) request.getAttribute("resultados");
            %>
            <table class="table table-striped table-bordered border-primary">
                <tr>
                    <th scope="col">Nombre Partido</th>
                    <th scope="col">Cantidad Votos</th>
                </tr>
                <% for (Map.Entry<String, Long> entry : resultados.entrySet()) {%>
                <tr>
                    <td scope="row"><%= entry.getKey()%></td>
                    <td scope="row"><%= entry.getValue()%></td>

                </tr>
                <% } %>
            </table>
        <% }%>
        </div>
    </body>
</html>
