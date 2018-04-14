<%@page import="br.ufjf.dcc192.Usuario"%>
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
                <tr>
                    <th>Id</th>
                    <th>Nome</th>
                    <th>Quem Possui</th>
                    <th>Quem Deseja</th>
                </tr>
                <%
                for(Figurinha figurinha : (List<Figurinha>)request.getAttribute("figurinhas")){
                %>
                <tr>
                    <td><%=figurinha.getId()%></td>
                    <td><%=figurinha.getNome()%></td>
                    <td>
                    <%
                    for(Usuario usuario : (List<Usuario>)request.getAttribute("usuarios")){
                        if(usuario.getFigurinhas().contains(figurinha)) {
                    %>
                        <p><%=usuario.getId()+" - "+usuario.getNome()%></p>
                    <%
                        }
                    }
                    %>
                    </td>
                    <td>
                    <%
                    for(Usuario usuario : (List<Usuario>)request.getAttribute("usuarios")){
                        if(!usuario.getFigurinhas().contains(figurinha)) {
                    %>
                        <p><%=usuario.getId()+" - "+usuario.getNome()%></p>
                    <%
                        }
                    }
                    %>
                    </td>
                </tr>
                <%
                }
                %>
            </tbody>
        </table>
    </body>
</html>
