package Execicio_74;

import java.util.Scanner;

public class FraseReversa {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite uma frase:");
		String frase = input.nextLine();
		
		String fraseReversa = "";
		
		for (int i = frase.length() - 1; i >= 0; i--) {
			fraseReversa += frase.charAt(i);
		}
		
		System.out.println("Frase de trás para frente: " + fraseReversa);
		
		
		input.close();

	}

}
