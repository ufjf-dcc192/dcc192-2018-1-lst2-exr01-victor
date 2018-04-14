/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.dcc192;

import java.io.IOException;
import java.io.PrintWriter;
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
@WebServlet(name = "FigurinhasServlet", urlPatterns = {"/listar-figurinhas.html", "/criar-usuario.html", "/editar-usuario.html", "/listar-usuarios.html"})
public class FigurinhasServlet extends HttpServlet {

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
            out.println("<title>Servlet FigurinhasServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet FigurinhasServlet at " + request.getContextPath() + "</h1>");
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
        if ("/listar-figurinhas.html".equals(request.getServletPath())) {
            listarFigurinhas(request, response);
            return;
        } else if ("/criar-usuario.html".equals(request.getServletPath())) {
            criarUsuario(request, response);
            return;
        } else if ("/editar-usuario.html".equals(request.getServletPath())) {
            editarUsuario(request, response);
            return;
        } else if ("/listar-usuarios.html".equals(request.getServletPath())) {
            listarUsuario(request, response);
            return;
        }
        response.sendError(404);
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
    
    
    private void listarFigurinhas(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Figurinha> figurinhas = ListaDeUsuarios.getInstanceFigurinhas();
        List<Usuario> usuarios = ListaDeUsuarios.getInstance();
        request.setAttribute("usuarios", usuarios);
        request.setAttribute("figurinhas", figurinhas);
        RequestDispatcher despachante = request.getRequestDispatcher("/WEB-INF/listar-figurinhas.jsp");
        despachante.forward(request, response);
    
    }
    private void criarUsuario(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher despachante = request.getRequestDispatcher("/WEB-INF/criar-usuario.jsp");
        despachante.forward(request, response);
    }
    
    private void editarUsuario(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher despachante = request.getRequestDispatcher("/WEB-INF/editar-usuario.jsp");
        List<Usuario> usuarios = ListaDeUsuarios.getInstance();
        Integer id = Integer.parseInt(request.getParameter("id"));
        Usuario usuario = ListaDeUsuarios.getUsuarioById(id);
        
        request.setAttribute("usuarios", usuarios);
        request.setAttribute("id", id);
        
        despachante.forward(request, response);
    }
    private void listarUsuario(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Usuario> usuarios = ListaDeUsuarios.getInstance();
        request.setAttribute("usuarios", usuarios);
        RequestDispatcher despachante = request.getRequestDispatcher("/WEB-INF/listar-usuarios.jsp");
        despachante.forward(request, response);
    }

}
