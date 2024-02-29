package Execicio_39;

import java.util.Scanner;

public class VerificarMaioresIdade {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite a idade da primeira pessoa: ");
		int idade1 = scanner.nextInt();
		
		System.out.print("Digite a idade da segunda pessoa: ");
		int idade2 = scanner.nextInt();
		
		System.out.print("Digite a idade da terceira pessoa: ");
		int idade3 = scanner.nextInt();
		
		int contadorMaioresIdade = 0;
		
		if (idade1 >= 18) {
			contadorMaioresIdade++;
		}
		
		if (idade2 >= 18) {
			contadorMaioresIdade++;
		}
		
		if (idade2 >= 18) {
			contadorMaioresIdade++;
		}
		
		if (idade3 >= 18) {
			contadorMaioresIdade++;
		}
		
		System.out.println("Quantidade de pessoas maiores de idade: " + contadorMaioresIdade);
		
		scanner.close();
	}

}
