package Execicio_44;

import java.util.Scanner;

public class VerificarDiaSemana {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o nome de um dia semana: ");
		String diaSemana = scanner.nextLine();
		
		if (diaSemana.equalsIgnoreCase("segunda") ||
			diaSemana.equalsIgnoreCase("terça") ||
			diaSemana.equalsIgnoreCase("quata") ||
			diaSemana.equalsIgnoreCase("quinta") ||
			diaSemana.equalsIgnoreCase("sexta")) {
			
			System.out.println(diaSemana + " é um dia útil.");
		} else if (diaSemana.equalsIgnoreCase("sábado") ||
				diaSemana.equalsIgnoreCase("domingo")) {
			
			System.out.println(diaSemana + " é um dia de fim de semana.");
		} else {
			System.out.println("Dia inválido.");
		}
		
		
		scanner.close();

	}

}
