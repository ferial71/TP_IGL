
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
	 * la méthode Joindre joindre un tableau de chaînes 
	 * de caractères avec un caractère de séparation
	 * 
	 * @param Tableau un tableau de chaine de caractaire 
	 * @return la méthode va nous donne une chaine de caractaire séparé par ,
	 * 
	 */
	public static String Joindre (String[] Tableau){
		String s=Tableau[0]; 
		for (int i=1;i<Tableau.length;i++){
			s=s+","+Tableau[i];
		}
		
		return s;
	}
	
	
	/**
	 * 
	 * la méthode Eliminer elimine les mots vides d’une chaîne (ou,et,à,non)
	 * 
	 * @param Chaine une chaine de caractaire
	 * @return une chaine de caractaire dont les mot vide n'existe plus,
	 */
	public static String Eliminer (String Chaine){
		String s="";
		int nbc = Chaine.length();
		for (int i = 0; i<nbc-3 ; i++){
				if (Chaine.charAt(i) == ' ') {
					switch (Chaine.charAt(i+1)){
						case 'o' : if (Chaine.charAt(i+2)=='u') break;
						case 'e' : if (Chaine.charAt(i+2)=='t') break;
						case 'à' : break;
						case 'n' : if ((Chaine.charAt(i+2)=='o')&&(Chaine.charAt(i+3)=='n')) break;
						default : s=s+" ";	
					}
				}
				else s=s+Character.toString(Chaine.charAt(i));
		}
		return s;
	}
	
	/**
	 * la méthoe Maj mette en majuscule la première lettre de chaque phrase
	 * 
	 * @param Chaine une phrase ou paraghraphe
	 * @return la phrase avec tout les premiers caractaire des mots sont en majuscule
	 */
	public static String Maj(String Chaine){
		
		String s1="",temp=""+Chaine.charAt(0),res="";
		res=temp.toUpperCase();
		for(int i =1;i<Chaine.length();i++){
			temp=""+Chaine.charAt(i);
			res=res+temp.toLowerCase();
		}
		return res;

	}
	
	
	/**
	 * la méthode Occurence calcule le nombre d’occurrences d’un mot dans un texte
	 * 
	 * @param Chaine un text 
	 * @param mot un mot (chaine de caractaire)
	 */
	public static int Occurence( String Chaine,String mot){
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
	 * la méthode Remplacer remplace chaque lettre par la lettre suivante
	 * @param Chaine la chaine qu'on va modifier
	 * @return la chaine midifier 
	 */
	public static String Remplacer( String Chaine){
		String res="";
		char temp ;
		
		for (int i=1; i < Chaine.length();i++){
			temp=Chaine.charAt(i);
			res=res+temp;
			
		}
		
		return res;
		
	}

}

