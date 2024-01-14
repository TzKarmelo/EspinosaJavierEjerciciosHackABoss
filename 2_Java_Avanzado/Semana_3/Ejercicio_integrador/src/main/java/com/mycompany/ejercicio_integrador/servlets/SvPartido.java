
package com.mycompany.ejercicio_integrador.servlets;

import com.mycompany.ejercicio_integrador.logica.Equipo;
import com.mycompany.ejercicio_integrador.logica.Partido;
import com.mycompany.ejercicio_integrador.persistencia.ControladoraEquipo;
import com.mycompany.ejercicio_integrador.persistencia.ControladoraPartido;
import java.io.IOException;
import java.time.LocalDate;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "SvPartido", urlPatterns = {"/SvPartido"})
public class SvPartido extends HttpServlet {
    
    private ControladoraPartido controladoraPartido = new ControladoraPartido();
    private ControladoraEquipo controladoraEquipo = new ControladoraEquipo();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        List<Partido> partidos = controladoraPartido.traerPartidos();
        request.setAttribute("partidos", partidos);
        request.getRequestDispatcher("index.jsp").forward(request, response);
        
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
        int idEquipoLocal = Integer.parseInt(request.getParameter("equipoLocal"));
        int idEquipoVisitante = Integer.parseInt(request.getParameter("equipoVisitante"));
        LocalDate fechaPartido = LocalDate.parse(request.getParameter("fecha"));
        int puntuacionLocal = Integer.parseInt(request.getParameter("puntuacionEquipoLocal"));
        int puntuacionVisitante = Integer.parseInt(request.getParameter("puntuacionEquipoVisitante"));
        
        Equipo equipoLocal = controladoraEquipo.traerEquipoPorId(idEquipoLocal);
        Equipo equipoVisitante = controladoraEquipo.traerEquipoPorId(idEquipoVisitante);
        
        Partido partido = new Partido(fechaPartido, puntuacionLocal, puntuacionVisitante, equipoLocal, equipoVisitante);

        controladoraPartido.crearPartido(partido);
        
        response.sendRedirect("index.jsp");
        
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
