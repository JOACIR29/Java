package Execicio_41;

import java.util.Scanner;

public class VerificarVotacao {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o ano de nascimento: ");
		int anoNascimento = scanner.nextInt();
		
		int anoAtual = java.time.Year.now().getValue();
		int idade = anoAtual - anoNascimento;
		
		if (idade >= 16) {
			System.out.println("A pessoa está apta a votar.");
		} else {
			System.out.println("A pessoa não está apta a votar.");
		}
		
		
		scanner.close();
	}

}
