/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
RODOLFO RAFAEL DZUL CETINA
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Multiplicacion.*;
import java.util.ArrayList;
/**
 *
 * @author Rafael
 */

public class servResult extends HttpServlet {
    
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out2 = response.getWriter()) {
            System.out.println("ntra");
            /* TODO output your page here. You may use following sample code. */
            out2.println("<!DOCTYPE html>");
            out2.println("<html>");
            out2.println("<head>");
                        
            
            Multiplicacion m;
           
            int num = Integer.parseInt(request.getParameter("numero"));
            int r0 = 0;
            int r1 = Integer.parseInt(request.getParameter("mult1"));
            int r2 = Integer.parseInt(request.getParameter("mult2"));
            int r3 = Integer.parseInt(request.getParameter("mult3"));
            int r4 = Integer.parseInt(request.getParameter("mult4"));
            int r5 = Integer.parseInt(request.getParameter("mult5"));
            int r6 = Integer.parseInt(request.getParameter("mult6"));
            int r7 = Integer.parseInt(request.getParameter("mult7"));
            int r8 = Integer.parseInt(request.getParameter("mult8"));
            int r9 = Integer.parseInt(request.getParameter("mult9"));
            int r10 = Integer.parseInt(request.getParameter("mult10"));
            ArrayList resultados = new ArrayList();
            resultados.add(r0);
            resultados.add(r1);
            resultados.add(r2);
            resultados.add(r3);
            resultados.add(r4);
            resultados.add(r5);
            resultados.add(r6);
            resultados.add(r7);
            resultados.add(r8);
            resultados.add(r9);
            resultados.add(r10);
            
            String limit = "";
            if(limit!=""){
               int limite = Integer.parseInt(limit);
               m = new Multiplicacion(limite);
            }else{
               m = new Multiplicacion(); 
            }
            
            
            out2.println("<title>Servlet servResult</title>");            
            out2.print("<link rel='stylesheet' href='css/estilos.css'>");
            out2.println("</head>");
            out2.println("<body>");
            out2.println("Esta es la tabla de multiplicar del <span class='rojito'>"
                    + num +"</span>número de filas: "+ m.getLimite() );
            
            out2.println("<br>A continuación se muestran los resultados en la última columna");
            
            out2.println("<table border='1'>");
            for(int i=1; i<= m.getLimite(); i++) { 
                out2.println("<tr><td>"+ num +"</td>");
                out2.println("<td>x</td>");
                out2.println("<td>" + i +"</td>");
                out2.println("<td> = </td>");
                out2.println("<td>"+resultados.get(i)+"</td>");        
                out2.println("<td>"+ m.multiplica(num, i) +"</td>");
                if(Integer.parseInt(resultados.get(i).toString()) == m.multiplica(num, i)){
                    out2.println("<td>Correcto</td>");
                }else{
                    out2.println("<td><span class='rojito'>Incorrecto</span></td>");
                }
                out2.println("<tr>");
            } 
            out2.println("</table>");
            out2.println("<a href='index.html'>Regresar</a>");
            out2.println("</form>");
            out2.println("</body>");
            out2.println("</html>");
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
        
        try (PrintWriter out3 = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out3.println("hola");
            
        }
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
