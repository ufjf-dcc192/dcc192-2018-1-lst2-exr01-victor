<%@page import="br.ufjf.dcc192.Figurinha"%>
<%@page import="java.util.List"%>
<%@page import="br.ufjf.dcc192.ListaDeUsuarios"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lista de Figurinhas</title>
    </head>
    <body>
        <h1>Lista de Figurinhas</h1>
        <table border="1">
            <tbody>
            <%
            for(Figurinha figurinha : (List<Figurinha>)request.getAttribute("figurinhas")){
            %>
            <tr>
                <td><%=figurinha.getId()%></td>
                <td><%=figurinha.getNome()%></td>
                <td><a href="procura-figurinha.html?id=<%=figurinha.getId()%>">Procuro</a></td>
                <td><a href="oferta-figurinha.html?id=<%=figurinha.getId()%>">Oferto</a></td>
            </tr>
            <%
            }
            %>
            </tbody>
        </table>
    </body>
</html>
