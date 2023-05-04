package org.lesson.java;

import java.util.Scanner;

public class CheckGuest {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		String[] GuestList = {"Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic"};
		
		System.out.println("Inserire il proprio nome: ");
		String person = in.nextLine();
		
		for (int i = 0; i < GuestList.length; i++) {
			
			String guest = GuestList[i];
			if(person.equals(guest)) {
				
				System.out.println("ok puoi entrare");
				return;
			}
 			
		}
		System.out.println("no, uh");
		in.close();
	}
}
