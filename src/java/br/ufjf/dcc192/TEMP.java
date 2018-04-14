package br.ufjf.dcc192;

import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ice
 */
@WebServlet(name = "TarefasServlet", urlPatterns = {"/listar.html", "/nova.html", "/editar.html", "/remover.html", "/mudar-estado.html"})
public class TEMP extends HttpServlet {

//    @Override
//    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        if ("/listar.html".equals(request.getServletPath())) {
//            listarTarefas(request, response);
//            return;
//        } else if ("/nova.html".equals(request.getServletPath())) {
//            criarTarefaForm(request, response);
//            return;
//        } else if ("/editar.html".equals(request.getServletPath())) {
//            editarTarefaForm(request, response);
//            return;
//        } else if ("/remover.html".equals(request.getServletPath())) {
//            removerTarefaForm(request, response);
//            return;
//        } else if ("/mudar-estado.html".equals(request.getServletPath())) {
//            mudarEstadoTarefa(request, response);
//            return;
//        }
//        response.sendError(404);
//    }
//
//    @Override
//    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        String titulo = request.getParameter("titulo");
//        String descricao = request.getParameter("descricao");
//            
//        if (request.getParameter("id") == null) {
//            ListaDeTarefas.criarNovaTarefa(titulo, descricao);
//            response.sendRedirect("listar.html");
//        } else {
//            
//            Integer id = Integer.parseInt(request.getParameter("id"));
//            boolean concluida = "on".equals(request.getParameter("concluida"));
//            Tarefa tarefa = ListaDeTarefas.getTarefaById(id);
//            tarefa.setConcluida(concluida);
//            tarefa.setTitulo(titulo);
//            tarefa.setDescricao(descricao);
//            response.sendRedirect("listar.html");
//        }
//    }
//
//    private void listarTarefas(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
//        List<Tarefa> tarefas = ListaDeTarefas.getInstance();
//        request.setAttribute("tarefas", tarefas);
//        RequestDispatcher despachante = request.getRequestDispatcher("/WEB-INF/tarefas-listar.jsp");
//        despachante.forward(request, response);
//    }
//
//    private void criarTarefaForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        RequestDispatcher despachante = request.getRequestDispatcher("/WEB-INF/tarefas-novo.jsp");
//        despachante.forward(request, response);
//    }
//    
//    private void editarTarefaForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        RequestDispatcher despachante = request.getRequestDispatcher("/WEB-INF/tarefas-editar.jsp");
//        List<Tarefa> tarefas = ListaDeTarefas.getInstance();
//        Integer id = Integer.parseInt(request.getParameter("id"));
//        Tarefa tarefa = ListaDeTarefas.getTarefaById(id);
//        
//        request.setAttribute("tarefas", tarefas);
//        request.setAttribute("id", id);
//        request.setAttribute("concluida", tarefa.getConcluida()?"checked":"");
//        request.setAttribute("titulo", tarefa.getTitulo());
//        request.setAttribute("descricao", tarefa.getDescricao());
//        
//        despachante.forward(request, response);
//    }
//    
//    private void removerTarefaForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        Integer id = Integer.parseInt(request.getParameter("id"));
//        ListaDeTarefas.removerTarefa(id);
//        response.sendRedirect("listar.html");
//    }
//    
//    private void mudarEstadoTarefa(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        Integer id = Integer.parseInt(request.getParameter("id"));
//        Tarefa tarefa = ListaDeTarefas.getTarefaById(id);
//        tarefa.setConcluida(!tarefa.getConcluida());
//        response.sendRedirect("listar.html");
//    }

}
