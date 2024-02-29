package Execicio_42;

import java.util.Scanner;

public class VerificarVotacao {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite a  idade: ");
		int idade = scanner.nextInt();
		
		if (idade < 16) {
			System.out.println("A pessoa não está apta a votar.");
		} else if (idade >= 16 && idade <= 17 || idade >= 70) {
			System.out.println("A pessoa está apta a votar, porém não é obrigada.");
		} else {
			System.out.println("A pessoa é obrigada a votar.");
		}
		
		scanner.close();

	}

}
