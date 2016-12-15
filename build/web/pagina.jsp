<%-- 
    Document   : pagina
    Created on : 13/10/2016, 04:42:43 PM
    Author     : Rafael
--%>
<%@page import="Multiplicacion.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="css/estilos.css">
    </head>
    <%
    Multiplicacion m;
    int num = Integer.parseInt(request.getParameter("numero"));
    String limit = request.getParameter("limite");
    if(limit!=""){
       int limite = Integer.parseInt(limit);
       m = new Multiplicacion(limite);
    }else{
       m = new Multiplicacion(); 
    }
    %>
    <body>
        <h1>Hello World!</h1>
        <h3>
            Esta es la tabla de multiplicar del <span class="rojito"><%= num %></span>, 
            número de filas: <%=m.getLimite() %> 
        </h3>
            <h3>Sumatoria: <span class="rojito" id="suma"></span></h3>
        <table border="1">
            <% for(int i=1; i<= m.getLimite(); i++) { %>
                <tr><td><%=num %> </td>
                    <td>x</td>
                    <td><%=i %> </td>
                    <td> = </td>
                    <td><%=m.multiplica(num, i) %></td>        
                    
                    <% m.sumatoria(m.multiplica(num, i)); %>
                    
                <tr>
            <%  } %>
        </table>
        <script>
            
            var suma = <%= m.getSuma() %>;
            
            document.getElementById("suma").innerHTML = suma;
        </script>
    </body>
</html>
