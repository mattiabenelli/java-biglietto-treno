package org.lesson.java;

public class CibiPreferiti {
	
	public static void main(String[] args) {
		
		int lngClassfica;
		String PrimoClassifica;
		String UltimoClassifica;
		
		String[] CibiPreferiti = {"pizza", "pasta", "carne", "pesce", "carbonara"};
		
		lngClassfica = CibiPreferiti.length;
		PrimoClassifica = CibiPreferiti[0];
		UltimoClassifica = CibiPreferiti[lngClassfica - 1];
		
		
		System.out.println("La tua classifica è lunga: " + lngClassfica);
		System.out.println("Il tuo preferito è: " + PrimoClassifica);
		System.out.println("Il tuo meno preferito è: " + UltimoClassifica);
		
		if(CibiPreferiti.length %2 == 0) {
			String x = CibiPreferiti[(CibiPreferiti.length/2) - 1];
//	        System.out.println(x);
	        String y = CibiPreferiti[CibiPreferiti.length/2];
//	        System.out.println(y);
	        
	        System.out.println("Gli elementi di mezzo sono: " + x + "," + y);
		}
		else {
			String z = CibiPreferiti[CibiPreferiti.length/2];
	        System.out.println(z);
	        
	        System.out.println("L'elemento di mezzo è: " + z);
		}
		
		
	}
}
