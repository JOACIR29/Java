package Execicio_65;

import java.util.Scanner;

public class NumerosPrimos {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Digite um número inteiro: ");
		int numero = input.nextInt();
		System.out.println("Números primos menores que " + numero + ":");
		
		for (int i = 2; i < numero; i++) {
			if (isPrimo(i)) {
				System.out.print(i + " ");
			}
		}
		input.close();
	}
	
	public static boolean isPrimo(int num) {
		if (num <= 1) {
			return false;
		}
		
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				return false;
			}
		}
		
		return true;
	}

}
