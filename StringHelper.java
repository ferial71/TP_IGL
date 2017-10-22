
/**
 * 
 * this is a simple application to modify a String
 * DATE: 22/10/2017 01:36 am 
 * @author ferial
 * @version 1.2
 *
 */

public class StringHelper {
	
	/**
	 * la m�thode Joindre joindre un tableau de cha�nes 
	 * de caract�res avec un caract�re de s�paration
	 * 
	 * @param Tableau un tableau de chaine de caractaire 
	 * @return la m�thode va nous donne une chaine de caractaire s�par� par ,
	 * 
	 */
	public String Joindre (String[] Tableau){
		String s=Tableau[0]; 
		for (int i=1;i<Tableau.length;i++){
			s=s+","+Tableau[i];
		}
		int a;
		return s;
	}
	
	
	/**
	 * 
	 * la m�thode Eliminer elimine les mots vides d�une cha�ne (ou,et,�,non)
	 * 
	 * @param Chaine une chaine de caractaire
	 * @return une chaine de caractaire dont les mot vide n'existe plus,
	 */
	public String Eliminer (String Chaine){
		String s="";
		int nbc = Chaine.length();
		for (int i = 1; i<nbc ; i++){
				if (Chaine.charAt(i) == ' ') {
					switch (Chaine.charAt(i+1)){
						case 'o' : if (Chaine.charAt(i+2)=='u') break;
						case 'e' : if (Chaine.charAt(i+2)=='t') break;
						case '�' : break;
						case 'n' : if ((Chaine.charAt(i+2)=='o')&&(Chaine.charAt(i+3)=='n')) break;
						default : s=s+' ';	
					}
				}
				else s=s+Chaine.charAt(i);
		}
		return s;
	}
	
	/**
	 * la m�thoe Maj mette en majuscule la premi�re lettre de chaque phrase
	 * 
	 * @param Chaine une phrase ou paraghraphe
	 * @return la phrase avec tout les premiers caractaire des mots sont en majuscule
	 */
	public String Maj(String Chaine){
		String s=Chaine;
		String s1="";
		
		
                s.toUpperCase();
		
		if (!Chaine.equals("")){
			s1=s1 + s.charAt(0);
			for ( int i=2;i<Chaine.length();i++){
				
				if (s.charAt(i-1)==',' || s.charAt(i-1)==';' || s.charAt(i-1)=='.') {
                                    s.toUpperCase();
                                    s1=s1+s.charAt(i);
                                    
                                }
				else s.toLowerCase();
                                s1=s1+s.charAt(i);
			}
		}
		return s;

	}
	
	
	/**
	 * la m�thode Occurence calcule le nombre d�occurrences d�un mot dans un texte
	 * 
	 * @param Chaine un text 
	 * @param mot un mot (chaine de caractaire)
	 */
	public int Occurence( String Chaine,String mot){
		int nbOccurence =0;	
		try{
			boolean exist = true;
			if (Chaine.length()!=0){
				if ( Chaine.contains(mot) ) {
					for (int i=1; i<Chaine.length();i++){
						if (Chaine.charAt(i)== mot.charAt(0)){
							for(int j=1;j<mot.length();j++){
								if (Chaine.charAt(i+1)!= mot.charAt(j)) exist=false;
							}
							if (exist) nbOccurence++;
						}
					}
				}
					
			}else {
				throw new Exception();
						
			}
			
			
		}
		catch (Exception ex){
			System.err.println(ex.getMessage());
			nbOccurence =-1;
		}
		return nbOccurence;
	}
	
	/**
	 * la m�thode Remplacer remplace chaque lettre par la lettre suivante
	 * @param Chaine la chaine qu'on va modifier
	 * @return la chaine midifier 
	 */
	public String Remplacer( String Chaine){
		String s=Chaine ;
		
		
		for (int i=1; i<s.length()-1;i++){
			s.replace(s.charAt(i),s.charAt(i+1));
		}
		s.replace(s.charAt(s.length()), Chaine.charAt(0));
		return s;
		
	}

}

