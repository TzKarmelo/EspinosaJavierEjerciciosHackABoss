package com.mycompany.ejercicio_1.servlets;

import com.mycompany.ejercicio_1.logica.Controladora;
import com.mycompany.ejercicio_1.logica.Votos;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "SvVotos", urlPatterns = {"/SvVotos"})
public class SvVotos extends HttpServlet {

    private List<Votos> votosPartido = new ArrayList<>();
    private Controladora control = new Controladora();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        List<Votos> votosPartidos = control.traerVotos();

        Map<String, Long> cuentaVotosOrdenados = votosPartidos.stream()
            .collect(Collectors.groupingBy(Votos::getPartido, TreeMap::new, Collectors.counting()));
        

        request.setAttribute("resultados", cuentaVotosOrdenados);

        request.getRequestDispatcher("index.jsp").forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        Votos voto = new Votos();

        String partidoSeleccionado = request.getParameter("partido");

        voto.setPartido(partidoSeleccionado);

        control.crearVoto(voto);
        response.sendRedirect("index.jsp");

    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
