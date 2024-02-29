package Execicio_37;

import java.util.Scanner;

public class VerificarSoma {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o primeiro número");
		int numero1 = scanner.nextInt();
		
		System.out.print("Digite o segumdo número: ");
		int numero2 = scanner.nextInt();
		
		System.out.print("Digite o terceiro número: ");
		int numero3 = scanner.nextInt();
		
		int soma = numero1 + numero2 + numero3;
		
		if (soma > 0) {
			System.out.println("A soma é positiva.");
		} else if (soma < 0) {
			System.out.println("A soma é negativa.");
		} else {
			System.out.println("A soma é igual a zero.");
		}
		
		scanner.close();

	}

}
