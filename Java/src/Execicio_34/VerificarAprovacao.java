package Execicio_34;

import java.util.Scanner;

public class VerificarAprovacao {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite a nota da primeira prova: ");
		double nota1 = scanner.nextDouble();
		
		System.out.print("Digite a nota da segunda prova: ");
		double nota2 = scanner.nextDouble();
		
		if (nota1 >= 6) {
			System.out.println("Aluno aprovado na primeira prova.");
		} else {
			System.out.println("Aluno reprovado na primeira prova.");
		}
		
		if (nota2 >= 6) {
			System.out.println("Aluno aprovado na segunda prova.");
		} else {
			System.out.println("Alno reprovadona segunda prova.");
		}
		
		scanner.close();
	}

}
