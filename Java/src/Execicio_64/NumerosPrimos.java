package Execicio_64;

import java.util.Scanner;

public class NumerosPrimos {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite um número inteiro: ");
		int numero = input.nextInt();
		
		
		System.out.println("Números primos menores que " + numero + ":");
		
		for (int i = 2; i < numero; i++) {
			boolean isPrimo = true;
			
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					isPrimo = false;
					break;
				}
			}
			
			if (isPrimo) {
				System.out.print(i + " ");
			}
		}
		
		
		
		input.close();

	}

}
