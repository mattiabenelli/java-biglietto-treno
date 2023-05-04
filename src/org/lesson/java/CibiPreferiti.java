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
		
	}
}
