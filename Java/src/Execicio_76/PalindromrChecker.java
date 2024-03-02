package Execicio_76;

import java.util.Scanner;

public class PalindromrChecker {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 
		
		System.out.print("Digite uma sequêcia de caracteres: ");
		String sequecia = scanner.nextLine();
		
		int i = 0;
		int j = sequecia.length() - 1;
		boolean ePalindromo = true;
		
		while (i < j) {
			if (sequecia.charAt(i) != sequecia.charAt(j)) {
				ePalindromo = false;
				break;
			}
			
			i++;
			j--;
		}
		
		if (ePalindromo) {
			System.out.println("A sequêcia é um palíndromo.");
		} else {
			System.out.println("A sequêcia não é um palíndromo.");
		}
		

		scanner.close();

	}

}
