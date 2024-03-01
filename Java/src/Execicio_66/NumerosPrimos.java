package Execicio_66;

import java.util.Scanner;

public class NumerosPrimos {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite a quantidae de números primos desejada: ");
		int quantidade = input.nextInt();
		
		System.out.println("Os primeiros " + quantidade + " números primo são:");
		
		int numero = 2;
		int contador = 0;
		
		while (contador < quantidade) {
			boolean isPrimo = true;
			
			for (int i = 2; i <= Math.sqrt(numero); i++) {
				if (numero % 1 == 0) {
					isPrimo = false;
					break;
				}
			}
			
			if (isPrimo) {
				System.out.print(numero + " ");
				contador++;
			}
			
			numero++;
		}
		
		input.close();

	}

}
