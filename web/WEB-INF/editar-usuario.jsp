<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>EDITAR Usuário</title>
    </head>
    <body>
        <h1>EDITAR Usuário</h1>
        <form method="post">
            <label>Nome: <input type="text" name="nome_usuario" value="<%=request.getAttribute("nome")%>" /></label><br>
            <input type="hidden" value="<%=request.getAttribute("id")%>" />
            <input type="submit"/><br>
            <input type="reset"/><br>
        </form>
    </body>
</html>
