package Execicio_35;

import java.util.Scanner;

public class VerificarAprovacaoMedia {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite a nota da primeira prova: ");
		double nota1 = scanner.nextDouble();
		
		System.out.println("Digite a nota da segunda prova: ");
		double nota2 = scanner.nextDouble();
		
		double media = (nota1 + nota2) / 2;
		
		System.out.println("Média: " + media);
		
		if (media >= 6) {
			System.out.println("Aluno aprovado.");
		} else {
			System.out.println("Aluno reprovado.");
		}
		
		
		
		scanner.close();

	}

}
