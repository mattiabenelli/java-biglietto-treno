package org.lesson.java;

import java.util.Scanner;

public class CalcolaBiglietto {
	
	public static void main(String[] args) {
		
		int km;
		int age;
		double sale;
		double price;
		double newPrice;
		Scanner in = new Scanner (System.in);
		
			System.out.println("Inserisci il numero di chilometri da percorrere: ");
			km = in.nextInt();
		
		System.out.println("Inserisci la tua età: ");
		age = in.nextInt();
		
		price = km * 0.21;
		
		System.out.println("età inserita: " + age);
		System.out.println("km da percorrere: " + km);
		System.out.println("prezzo non scontato: " + price + "$");
		
		if(age < 18) {
			sale = 10;
			newPrice = price - price*sale/100;
			System.out.println(sale);
			
			System.out.println("sconto per minorenni 10%: prezzo scontato " + newPrice + "$");
		}
		else if(age > 65) {
			sale = 40;
			newPrice = price - price*sale/100;
			System.out.println("sconto per over 65 40%: prezzo scontato " + newPrice + "$");
		}
	}
}
