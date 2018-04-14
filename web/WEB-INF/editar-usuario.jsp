<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>EDITAR Tarefa</title>
    </head>
    <body>
        <h1>EDITAR Tarefa</h1>
        <form method="post">
            
            <label>Concluída? <input name="concluida" type="checkbox" <%=request.getAttribute("concluida")%>/></label><br>
            <label>Titulo: <input name="titulo" value="<%=request.getAttribute("titulo")%>" /></label><br>
            <label>Descrição: <textarea name="descricao" rows="4"><%=request.getAttribute("descricao")%></textarea></label><br>
            <input type="hidden" value="<%=request.getAttribute("id")%>">
            <input type="submit"/><br>
            <input type="reset"/><br>
        </form>
    </body>
</html>
