package org.generation.italy.cicli;

import java.util.Random;
import java.util.Scanner;

public class StampaNumeriDispari {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); //importate risorse
		Random gen = new Random();
		
		int n;						//chiesta ed assegnata lunghezza array
		System.out.print("Quanti elementi vuoi in questo array? ");
		n = scanner.nextInt();
		
		int[] numbers = new int[n]; //definito array
		
		System.out.println("Questi sono i numeri dispari: ");
		
		for(int i = 0; i < n; i++) {  //condizioni per popolare array
			
			numbers[i] = gen.nextInt(100);
			
			if(numbers[i] % 2 != 0) {		//stampa dei numeri dispari. elemento array modulo 2 diverso da 0
				System.out.println(numbers[i]);
			}  	
				
		}
		
		System.out.println("Fine del programma");
		scanner.close();
	}
}	


