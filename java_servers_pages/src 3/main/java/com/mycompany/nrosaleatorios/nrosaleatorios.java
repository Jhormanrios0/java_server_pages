/**
Alejandro Rafael Reyes Arboleda
Jhorman David Rodriguez Rios
     */
package com.mycompany.NrosAleatorios;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Random;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "nrosaleatorios", urlPatterns = {"/nrosaleatorios"})
public class nrosaleatorios extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        ArrayList<Double> numeros = new ArrayList();
        Random r = new Random();
        
        double total = 0;
                
        for(int i =0;i<10;i++){
            numeros.add(r.nextDouble());
        }

        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Servlet SumaNumeros</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Numeros Aleatorios</h1>");
         for(int i =0;i<10;i++){
            out.println("<p>"+"Nro: "+(i+1)+" = "+numeros.get(i) +"</p>");
            out.println("<br>");
            total+= numeros.get(i);
        } 
        out.println("<br>");
        out.println("<h1>Suma del arraylist = "+ total +"</h1>"); 
        out.println("</body>");
        out.println("</html>");

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

}