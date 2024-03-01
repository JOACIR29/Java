package Execicio_69;

import java.util.Scanner;

public class SomaNumerosPositivos {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int numero;
		int soma = 0;
		
		do {
			System.out.print("Digite um número (negativo para sair): ");
			numero = input.nextInt();
			
			if (numero > 0) {
				soma += numero;
			}
		} while (numero >=0);
		
		System.out.println("A soma dos números positivos é: " + soma);
		
		
		
		input.close();

	}

}
