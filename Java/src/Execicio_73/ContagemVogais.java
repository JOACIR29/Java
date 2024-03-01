package Execicio_73;

import java.util.Scanner;

public class ContagemVogais {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Digite uma frase:");
		String frase = input.nextLine().toLowerCase();

		int contadorVogais = 0;

		for (int i = 0; i < frase.length(); i++) {
			char caractere = frase.charAt(i);

			if (caractere == 'a' || caractere == 'e' || caractere == 'i' || caractere == 'o' || caractere == 'u') {
				contadorVogais++;
			}
		}
		
		System.out.println("A frase possui " + contadorVogais + " vogais");

		input.close();
	}

}
