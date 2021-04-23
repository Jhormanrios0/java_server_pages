/**
Alejandro Rafael Reyes Arboleda
Jhorman David Rodriguez Rios
     */
package com.mycompany.contador;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "contador", urlPatterns = {"/contador"})
public class contador extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {           
            Integer sesion = 0;
            HttpSession contSesion = request.getSession();
            PrintWriter salida = response.getWriter();           
            sesion = (Integer)contSesion.getAttribute("contSesion");
            if(sesion == null){
            sesion = 0;            
            }                  
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet count</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<p>El numero total de visitas es: "+ sesion);
            out.println("</body>");
            out.println("</html>");            
            sesion++;
            contSesion.setAttribute("contSesion", sesion);
        }
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
    @Override
    public String getServletInfo() {
        return "Short description";
    }
}
    

  
    
