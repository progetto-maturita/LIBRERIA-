package DAO;

public class UTENTI 
{
	//VARIABILI
	
		private String MATRICOLA;
		private String NOME;
		private String COGNOME;
		private String EMAIL;
		private String USERNAME;
		private String PASSWORD;
		private String DATA_NASCITA;
		private String NUMERO_TEL;
		private String CF;
		
		
		
		//IMPLEMENTAZIONI METODI
		
		public UTENTI() 
		{
			super();
			// TODO Auto-generated constructor stub
		}

		public String getMATRICOLA() 
		{
			return MATRICOLA;
		}

		public void setMATRICOLA(String mATRICOLA) 
		{
			
			MATRICOLA = mATRICOLA;
		}

		public String getNOME() 
		{
			return NOME;
		}

		public void setNOME(String nOME) 
		{
			NOME = nOME;
		}

		public String getCOGNOME()
		{
			return COGNOME;
		}

		public void setCOGNOME(String cOGNOME) 
		{
			COGNOME = cOGNOME;
		}

		public String getEMAIL() 
		{
			return EMAIL;
		}

		public void setEMAIL(String eMAIL) 
		{
			EMAIL = eMAIL;
		}

		public String getUSERNAME() 
		{
			return USERNAME;
		}

		public void setUSERNAME(String uSERNAME) 
		{
			USERNAME = uSERNAME;
		}

		public String getPASSWORD() 
		{
			return PASSWORD;
		}

		public void setPASSWORD(String pASSWORD) 
		{
			PASSWORD = pASSWORD;
		}

		public String getDATA_NASCITA() 
		{
			return DATA_NASCITA;
		}

		public void setDATA_NASCITA(String dATA_NASCITA) 
		{
			DATA_NASCITA = dATA_NASCITA;
		}

		public String getNUMERO_TEL() 
		{
			return NUMERO_TEL;
		}

		public void setNUMERO_TEL(String nUMERO_TEL)
		{
			NUMERO_TEL = nUMERO_TEL;
		}

		public String getCF() 
		{
			return CF;
		}

		public void setCF(String cF) 
		{
			CF = cF;
		}

		@Override
		public String toString() {
			return "LIBRI [MATRICOLA=" + MATRICOLA +
					", NOME=" + NOME + ", COGNOME=" + COGNOME +
					", EMAIL=" + EMAIL + ", USERNAME=" + USERNAME 
					+ ", PASSWORD=" + PASSWORD + ", DATA_NASCITA=" + DATA_NASCITA
					+ ", NUMERO_TEL=" + NUMERO_TEL + ", CF=" + CF + "]";
		}
		
}
