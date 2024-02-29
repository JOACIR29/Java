package Execicio_18;

import java.util.Scanner;

public class ExibirLetrasV2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite uma palavra: ");
		String palavra = scanner.nextLine();
		
		//Convertemos a palavra para um arry de caracteres
		char[] letras = palavra.toCharArray();
		
		// Percorremos o array e exibimos cada letra separadamente
		for (char letra : letras) {
			System.out.println(letra);
		}
		
		scanner.close();

	}

}
