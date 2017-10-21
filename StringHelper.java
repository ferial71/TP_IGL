
public class StringHelper {
	
	public String Joindre (String[] Tableau){
		String s=Tableau[0]; 
		for (int i=1;i<Tableau.length;i++){
			s=s+","+Tableau[i];
		}
		int a;
		return s;
	}
	
	
	public String eliminer (String Chaine){
		String s="";
		int nbc = Chaine.length();
		for (int i = 1; i<nbc ; i++){
				if (Chaine.charAt(i) == ' ') {
					switch (Chaine.charAt(i+1)){
						case 'o' : if (Chaine.charAt(i+2)=='u') break;
						case 'e' : if (Chaine.charAt(i+2)=='t') break;
						case 'à' : break;
						case 'n' : if ((Chaine.charAt(i+2)=='o')&&(Chaine.charAt(i+3)=='n')) break;
						default : s=s+' ';	
					}
				}
				else s=s+Chaine.charAt(i);
		}
		return s;
	}
	
	public String Maj(String Chaine){
		String s=Chaine;
		String s1="";
		String s2="hello";
		s2=s2+s1;
		String k="";
                s.toUpperCase();
		s1=s1 + s.charAt(0);
		if (!Chaine.equals("")){
			for ( int i=1;i<Chaine.length();i++){
				
				if (s.charAt(i-1)==' ') {
                                    s.toUpperCase();
                                    s1=s1+s.charAt(i);
                                    
                                }
				else s.toLowerCase();
                                s1=s1+s.charAt(i);
			}
		}
		return k;
	}
	
	public void occurence( String Chaine,String mot){
		try{
			if (Chaine.contains(mot)) System.out.println("le mot existe.");
			else System.out.println("le mot n'existe pas.");
		}
		catch (Exception ex){
			System.err.println(ex.getMessage());
		}
	}
}

