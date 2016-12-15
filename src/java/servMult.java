/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Multiplicacion.*;
/**
 *
 * @author Rafael
 */

public class servMult extends HttpServlet {

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
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            
            
            Multiplicacion m;
            int num = Integer.parseInt(request.getParameter("numero"));
            String limit = "";
            if(limit!=""){
               int limite = Integer.parseInt(limit);
               m = new Multiplicacion(limite);
            }else{
               m = new Multiplicacion(); 
            }
            
            
            out.println("<title>Servlet servMult</title>");            
            out.print("<link rel='stylesheet' href='css/estilos.css'>");
            out.println("</head>");
            out.println("<body>");
            out.println("Esta es la tabla de multiplicar del <span class='rojito'>"
                    + num +"</span>número de filas: "+ m.getLimite() );
            
            out.println("Ingresa el resultado de las multiplicaciones y presiona <span class='rojito'> Ver resultado </span> para comprobar tus respuestas");
            
            //out.println("<h3>Sumatoria: <span class='rojito' id='suma'></span></h3>");
            out.println("<form action='servResult' method='post'>");
            out.println("<input type='hidden' name='numero' value="+num+">");
            out.println("<table border='1'>");
            for(int i=1; i<= m.getLimite(); i++) { 
                out.println("<tr><td>"+ num +"</td>");
                out.println("<td>x</td>");
                out.println("<td>" + i +"</td>");
                out.println("<td> = </td>");
                out.println("<td><input type='text' name='mult"+i+"'></td>");        
                //out.println("<td>"+ m.multiplica(num, i) +"</td>");        

                //m.sumatoria(m.multiplica(num, i));

                out.println("<tr>");
            } 
            out.println("</table>");
            out.println("<input type='submit' value='Ver resultado'>");
            out.println("</form>");
            out.println("<script>var suma = "+ m.getSuma() +";");
            out.println("document.getElementById('suma').innerHTML = suma;");
            out.println("</script>");
            out.println("</body>");
            out.println("</html>");
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
