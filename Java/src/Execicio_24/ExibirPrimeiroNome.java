package Execicio_24;

import java.util.Scanner;

public class ExibirPrimeiroNome {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o nome completo: ");
		String nomeCompleto = scanner.nextLine();
		
		// Dividir o nome completo em separadas pelo espaço em branco
		String[] partesNome = nomeCompleto.split(" ");
		
		// Obter o primeiro nome
		String primeiroNome = partesNome[0];
		
		System.out.println("Primeiro nome: " + primeiroNome);
		
		scanner.close();

	}

}
