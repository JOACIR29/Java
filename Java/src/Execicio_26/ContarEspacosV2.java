package Execicio_26;

import java.util.Scanner;

public class ContarEspacosV2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.print("Digite uma frase: ");
		String frase = scanner.nextLine();
		
		// Divide a frase em partes separadas npelos espaços em branco
		String[] partes = frase.split(" ");
		
		// Calcula a quatidade de espaços em branco
		int quantidadeEspacos = partes.length - 1;
		
		System.out.println("Quantidadede espaços em branco: " + quantidadeEspacos);
		
		scanner.close();
	}

}
