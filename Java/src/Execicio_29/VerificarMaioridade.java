package Execicio_29;

import java.util.Scanner;

public class VerificarMaioridade {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite a sua idade: ");
		int idade = scanner.nextInt();
		
		if (idade >= 18) {
			System.out.println("Voçê é maior de idade.");
		} else { 
			System.out.println("Voçê é menor de idade.");
		}
		
		
		scanner.close();

	}

}
