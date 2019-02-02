/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import DAO.Model;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author hassa
 */
public class loginDipendente extends HttpServlet 
{
    private static final long serialVersionUID = 1L;
    Model model = null;
    HttpSession session;
   
    public void init(ServletConfig conf) throws ServletException
    {
        super.init(conf);
        
        ServletContext ctx = conf.getServletContext();
        String URL = ctx.getInitParameter("DB-URL");
        
        model = new Model(URL);
    }
    

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException 
    {
        String username = request.getParameter("username_txt");
        String password = request.getParameter("password_txt");

        if(model.loginDipendenti(username, password))
        {
                session = request.getSession();
                session.setAttribute("USERNAME", username);
                response.sendRedirect("Home.jsp");
                System.out.println(username);
                System.out.println(password);
                System.out.println("LOGIN OK");
        }
        else
        {
                System.out.println(username);
                System.out.println(password);
                System.out.println("LOGIN ERRORE");
                response.sendRedirect("ErrorLog.jsp");
        }
    }
}
