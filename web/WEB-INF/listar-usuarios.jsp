<%@page import="br.ufjf.dcc192.Figurinha"%>
<%@page import="java.util.List"%>
<%@page import="br.ufjf.dcc192.ListaDeUsuarios"%>
<%@page import="br.ufjf.dcc192.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lista de Usuários</title>
    </head>
    <body>
        <h1>Lista de Usuários</h1>
        <%
            for (Usuario usuario : (List<Usuario>) request.getAttribute("usuarios")) {
        %>
        <ul>
            <li><%=usuario.getId()%></li>
            <li><%=usuario.getNome()%></li>
            <ul>
                <%
                    for (Figurinha figurinha : usuario.getFigurinhas()) {
                %>
                <li><%=figurinha.getId() + " - " + figurinha.getNome()%>
                    <a href="editar-figurinha.html?id=<%=figurinha.getId()%>">Editar</a>
                    <a href="remover-figurinha.html?id=<%=figurinha.getId()%>">Remover</a>
                </li>
                <%
                    }
                %>
            </ul>
            <a href="editar.html?id=<%=usuario.getId()%>">Editar</a>
            <a href="remover.html?id=<%=usuario.getId()%>">Remover</a>
        </ul>
        <%
            }
        %>
    </body>
</html>
