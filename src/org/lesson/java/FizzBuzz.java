package org.lesson.java;

import java.util.Scanner;

public class FizzBuzz {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		int MaxNumber;
		
		System.out.println("Inserisci il numero massimo dell'elenco: ");
		MaxNumber = in.nextInt();
		System.out.println(" -------------------------- ");
		
		for(int i = 1; i <= MaxNumber; i++) {
			
			if(i %3 == 0 && i%5 != 0) {
				System.out.println("Fizz");
			}
			else if(i %3 != 0 && i %5 == 0) {
				System.out.println("Buzz");
			}
			else if(i %3 == 0 && i %5 == 0) {
				System.out.println("FizzBuzz");
			}
			else {
				System.out.println(i);
			}
		}
	}
}
