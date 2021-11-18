package org.generation.italy.cicli;

import java.util.Random;
import java.util.Scanner;

public class StampaNumeriDispari {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); //importate risorse
		Random gen = new Random();
		
		int n;
		int odd = 0;
		int even = 0;
		int sum = 0;
		
		System.out.print("Quanti elementi vuoi in questo array? "); //chiesta ed assegnata lunghezza array
		n = scanner.nextInt();
		
		int[] numbers = new int[n]; //definito array
		
		System.out.print("\nQuesti sono i numeri dispari: ");
		
		for(int i = 0; i < n; i++) {  //condizioni per popolare array
			
			numbers[i] = gen.nextInt(100);
			
			if(numbers[i] % 2 != 0) {		//stampa dei numeri dispari. elemento array modulo 2 diverso da 0
				System.out.print(numbers[i] + " ");
				odd++;						//alla variabile odd aggiunge i valori che rispettano la condizione if
				
			} else
				even++;						//alla variabile else aggiunge i valori che rispettano la condizione else
			
			if(numbers[i] < 50 && numbers[i] > 10)
				sum += numbers[i];			//alla variabile sum aggiunge i valori che rispettano la condizione if
		}
		
		System.out.println(" ");
		
		System.out.println("\nTotale numeri dispari: " + odd);
		
		System.out.println("\nTotale numeri pari: " + even);
		
		System.out.println("\nSomma dei numeri tra 10 e 50: " + sum);
		
		System.out.println("\nFine del programma");
		
		scanner.close();
	}
}	


