
package com.mycompany.ejercicio_integrador.servlets;

import com.mycompany.ejercicio_integrador.logica.Equipo;
import com.mycompany.ejercicio_integrador.persistencia.ControladoraEquipo;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "SvEquipo", urlPatterns = {"/SvEquipo"})
public class SvEquipo extends HttpServlet {
    
    private ControladoraEquipo control = new ControladoraEquipo();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String nombreEquipo=request.getParameter("nombre");
        Equipo equipo = new Equipo();
        equipo.setNombre(nombreEquipo);
        
        control.crearEquipo(equipo);
        response.sendRedirect("index.jsp");
        
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
