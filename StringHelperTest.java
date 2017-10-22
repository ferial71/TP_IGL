import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class StringHelperTest {


	@Test
	public void testJoindre() {
		String[] tab = {"une chaine ","de caracteres"};
		String res="",att="une chaine ,de caracteres";
		res=StringHelper.Joindre(tab);
		if(res.compareTo(att)!=0) fail("jointure de 2 chaines non r�ussi");
	}
	
	
	@Test
	public void testEliminer() {
		String res="",att="feriel � un et nouveau pull ",chaine="feriel � un et nouveau pull ";
		res=StringHelper.Eliminer(chaine);
		if(res.compareTo(chaine)!=0) fail("Elimination non reussi");
	}
	
	@Test
	public void testMaj() {
		String res="",att="Selected block references a local type declared ",chaine="selected block references a local type declared ";
		res=StringHelper.Maj(chaine);
	Assert.assertEquals(att, res);	
	}

	@Test
	public void testOccurence() {
		String chaine="la commande init ",mot="init";
		int res,att=1;
		res=StringHelper.Occurence(chaine, mot);
		if(res==att) fail("jointure de 2 chaines r�ussi");
	}
	
	@Test
	public void testRemplacer() {
		String res="",att="erialf",chaine="ferial";
		res=StringHelper.Remplacer(chaine);
		if(res.compareTo(att)!=0) fail("jointure de 2 chaines non r�ussi");
	}

}
