package Execicio_62;

import java.util.Scanner;

public class CalculoPotencia {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o número base: ");
		int base = input.nextInt();
		
		System.out.println("Digite o expoente: ");
		int expoente = input.nextInt();
		
		int resultado = 1;
		
		for (int i = 1; i <= expoente; i++) {
			resultado *= base;
		}
		
		System.out.println(base + " elevado a " + expoente + " é: " + resultado);
		
		
		input.close();
				

	}

}
