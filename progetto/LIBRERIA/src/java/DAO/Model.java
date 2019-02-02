package DAO;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Model 
{
	private final String connectionUrl;
    //private final static String connectionUrl = "jdbc:sqlserver://DESKTOP-O9J7C1E\\HASSAN;" +
                //"databaseName=LIBRERIA;integratedSecurity=true;";
    
    public Model(String connectionUrl)
    {
    	this.connectionUrl = connectionUrl;
        registerDriver();
    }
    
    /**
     * metodo per registrare il Driver JDBC da usare durante le operazioni
     * di interazione con il DB.
     */
    public static void registerDriver() 
    {
        try 
        {
            DriverManager.registerDriver(new com.microsoft.sqlserver.jdbc.SQLServerDriver());
            System.out.print("Connessione OK");
        } catch (SQLException e) 
        {
            System.out.println(e.getMessage());
        }
    }
    
    /**
     * Metodo che esegue il link per i dipendenti
     * @param username username del dipendente
     * @param password password del dipendete
     * @return vero se esiste una corrispondenza nel DB
     */
    public boolean loginDipendenti(String username, String password)
    {
    	Connection conn = null;
    	PreparedStatement st = null;
    	ResultSet rs = null;
    	
    	try
    	{
    		conn = DriverManager.getConnection(connectionUrl);
    		st = conn.prepareStatement("SELECT * FROM DIPENDETI WHERE USERNAME = ? AND PASSWORD_DIP = ?");
    		st.setString(1,username);
    		st.setString(2, password);
    		rs = st.executeQuery();
    		while(rs.next())
    			return true;
    	}
    	catch(SQLException ex)
    	{
    		ex.getMessage();
    		ex.printStackTrace();
    	}
    	finally
    	{
    		try 
    		{
				conn.close();
				st.close();
			} 
    		catch (SQLException ex) 
    		{
				ex.getMessage();
				ex.printStackTrace();
			}
    	}
    	return false;
    }
    
}
