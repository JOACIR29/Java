package Execicio_36;

import java.util.Scanner;

public class VerificarDivisibilidade {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o primeiro número: ");
		int numero1 = scanner.nextInt();
		
		System.out.print("Digite o segundo número: ");
		int numero2 = scanner.nextInt();
		
		System.out.print("Digite o terceiro número: ");
		int numero3 = scanner.nextInt();
		
		int soma = numero1 + numero2 + numero3;
		
		if (soma % 5 == 0) {
			System.out.println("A soma é divisível por 5.");
		} else {
			System.out.println("A soma não é divisível por 5.");
		}
		
		
		scanner.close();
	}

}
