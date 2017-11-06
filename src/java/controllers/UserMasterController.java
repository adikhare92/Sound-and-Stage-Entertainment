/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import tp.UserMasterBean;

/**
 *
 * @author Dear Kallu
 */
@WebServlet(name = "UserMasterController", urlPatterns = {"/UserMasterController"})
public class UserMasterController extends HttpServlet {

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
            out.println("<title>Servlet UserMasterController</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet UserMasterController at " + request.getContextPath() + "</h1>");
            
            UserMasterBean umb = new UserMasterBean();
            String Username= request.getParameter("txtusername");
            String password= request.getParameter("txtpassword");
            int usertype= Integer.parseInt(request.getParameter("sname"));
            String name = request.getParameter("txtname");
            String phone = request.getParameter("txtphone");
            
            umb.setUsername(Username);
            umb.setPassword(password);
            umb.setUsertype(usertype);
            umb.setName(name);
            umb.setPhone(phone);
            String res=umb.insert();
            res+="<hr/>";
            res+=umb.getRecords();
            request.setAttribute("result", res);
            RequestDispatcher rd = request.getRequestDispatcher("admin/CreateUser2.jsp");
            rd.forward(request, response);
            
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
