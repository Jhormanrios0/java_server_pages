/**
Alejandro Rafael Reyes Arboleda
Jhorman David Rodriguez Rios
     */
package com.mycompany.mavenproject1;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "Servlet1", urlPatterns = {"/Servlet1"})
public class Servlet1 extends HttpServlet {


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
Double hypo = (Double.valueOf(request.getParameter("hipotenusa1")) *
        Double.valueOf(request.getParameter("hipotenusa1")) 
        + Double.valueOf(request.getParameter("hipotenusa2")) 
        * Double.valueOf(request.getParameter("hipotenusa2")));
          Double raizCuadrada = Math.sqrt(hypo);
            out.println("<p>El cubo del numero es: " 
         + Double.valueOf(request.getParameter("al_cuadrado")) 
         * Double.valueOf(request.getParameter("al_cuadrado")) 
         * Double.valueOf(request.getParameter("al_cuadrado")));
            out.println("<p>La hipotenusa de los catetos es: " + raizCuadrada);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
