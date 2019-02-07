package DAO;

import java.beans.Statement;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Random;

public class Model 
{
    private final String connectionUrl;
    
    
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
    
    /**
     * Metodo che inserisce un nuovo utente nel database
     * @param username dell'utente
     * @param password dell'utente
     * @param nome dell'utente registrato
     * @param cognome dell'utente registrato
     * @param email dell'utente registrato
     * @param data di nascita dell'utente registrato
     * @param cf dell'utente registrato
     * @param numeroTel dell'utente registrato
     * @param mansione dell'utente registrato
     * @return true se linserimento va a buon fine, false altrimenti
     */
    public boolean registrazioneUtente(String username, String password, String nome, String cognome, String email, String data, String cf, String numeroTel, String mansione )
    {
        CallableStatement sp = null;
        Connection conn = null;
    
    	try
        {
            conn = DriverManager.getConnection(connectionUrl);
            sp = conn.prepareCall("{call INSERISCI_NUOVO_UTENTE(?,?,?,?,?,?,?,?)}");
            sp.setString(1, nome);
            sp.setString(2, cognome);
            sp.setString(3, username);
            sp.setString(4, email);
            sp.setString(5, data);
            sp.setString(6, cf);
            sp.setString(7, numeroTel);
            sp.setString(8, password);
            sp.executeUpdate();
            System.out.println("REGISTRAZIONE COMPLETATA");
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
                sp.close();
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
