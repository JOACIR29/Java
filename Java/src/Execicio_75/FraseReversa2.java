package Execicio_75;

import java.util.Scanner;

public class FraseReversa2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite uma frase:");
		String frase = input.nextLine();
		
		String fraseReversa = new StringBuilder(frase).reverse().toString();
		
		System.out.println("Frase de trás para frente: " + fraseReversa);
		
		
		
		input.close();

	}

}
