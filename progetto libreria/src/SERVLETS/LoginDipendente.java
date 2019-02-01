package SERVLETS;

import java.beans.Statement;
import java.io.IOException;
import java.sql.Connection;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import DAO.Model;

/**
 * Servlet implementation class LoginDipendente
 */
@WebServlet("/LoginDipendente")
public class LoginDipendente extends HttpServlet 
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
    

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doAction(request, response);
	}
	
	protected void doAction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String username = request.getParameter("username_txt");
		String password = request.getParameter("password_txt");
		HttpSession session;
		
		
		
		
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
