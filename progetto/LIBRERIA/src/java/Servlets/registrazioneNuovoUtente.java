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
public class registrazioneNuovoUtente extends HttpServlet 
{

    private static final long serialVersionUID = 1L;
    Model model = null;
   
    public void init(ServletConfig conf) throws ServletException
    {
        super.init(conf);
        
        ServletContext ctx = conf.getServletContext();
        String URL = ctx.getInitParameter("DB-URL");
        
        model = new Model(URL);
    }
      
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        String nome = request.getParameter("nome_txt");
        String cognome = request.getParameter("cognome_txt");
        String username = request.getParameter("username_txt");
        String email = request.getParameter("email_txt");
        String password = request.getParameter("password_txt");
        String data = request.getParameter("data_txt");
        String cf = request.getParameter("cf_txt");
        String numeroTel = request.getParameter("telefono_txt");
        String masione = request.getParameter("mansione");
        
        if(model.registrazioneUtente(username, password, nome, cognome, email, data, cf, numeroTel, masione))
        {
            System.out.println("Inserimento andato a buon fine!!");
            response.sendRedirect("Log-in.jsp");
        }
        else
            response.sendRedirect("Registrazione.jsp");
    }
}
