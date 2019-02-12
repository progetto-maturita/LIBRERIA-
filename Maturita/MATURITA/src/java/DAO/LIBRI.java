package DAO;

public class LIBRI 
{
	//VARIABILI
	private String CODICE_ISBN;
	private String GENERE_LIBRO;
	private String AUTORE_LIBRO;
	private String CASA_LIBRO;
	private String TITOLO_LIBRO;
	
	
	//IMPLEMENTAZIONE
	public LIBRI() 
	{
		super();
		// TODO Auto-generated constructor stub
	}

	public String getCODICE_ISBN() 
	{
		return CODICE_ISBN;
	}

	public void setCODICE_ISBN(String cODICE_ISBN) 
	{
		CODICE_ISBN = cODICE_ISBN;
	}

	public String getGENERE_LIBRO() 
	{
		return GENERE_LIBRO;
	}

	public void setGENERE_LIBRO(String gENERE_LIBRO) 
	{
		GENERE_LIBRO = gENERE_LIBRO;
	}

	public String getAUTORE_LIBRO() 
	{
		return AUTORE_LIBRO;
	}

	public void setAUTORE_LIBRO(String aUTORE_LIBRO) 
	{
		AUTORE_LIBRO = aUTORE_LIBRO;
	}

	public String getCASA_LIBRO() 
	{
		return CASA_LIBRO;
	}

	public void setCASA_LIBRO(String cASA_LIBRO) 
	{
		CASA_LIBRO = cASA_LIBRO;
	}

	public String getTITOLO_LIBRO()
	{
		return TITOLO_LIBRO;
	}

	public void setTITOLO_LIBRO(String tITOLO_LIBRO) 
	{
		TITOLO_LIBRO = tITOLO_LIBRO;
	}

	@Override
	public String toString() {
		return "LIBRI [CODICE_ISBN=" + CODICE_ISBN + ", GENERE_LIBRO=" + GENERE_LIBRO + 
				", AUTORE_LIBRO=" + AUTORE_LIBRO + ", CASA_LIBRO=" + CASA_LIBRO + 
				", TITOLO_LIBRO=" + TITOLO_LIBRO + "]";
	}
	
	
}
