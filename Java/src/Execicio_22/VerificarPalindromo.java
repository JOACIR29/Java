package Execicio_22;

import java.util.Scanner;

public class VerificarPalindromo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite uma palavra: ");
		String palavra = scanner.nextLine();
		// Removemos os espaços em branco e convertemos para letras minúsculas
		String palavraFormatada = palavra.replaceAll("\\s+", "").toLowerCase();
		boolean palindromo = true;
		// Percorremos a palavra verificando se os caracteres coincidem
		for (int i = 0; i < palavraFormatada.length() / 2; i++) {
			char a = palavraFormatada.charAt(i);
			char b = palavraFormatada.charAt(palavraFormatada.length() - i -1);
			if (a != b) {
				palindromo = false;
				break;
			}
		}
		if (palindromo) {
			System.out.println("A palavra é um palíndromo.");
		} else {
			System.out.println("A palavra não é um palíndromo.");
		}
		
		scanner.close();

	}

}
