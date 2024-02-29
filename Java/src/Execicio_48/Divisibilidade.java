package Execicio_48;

import java.util.Scanner;

public class Divisibilidade {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o primeiro número: ");
		int numero1 = scanner.nextInt();
		
		System.out.print("Digite o segundo número: ");
		int numero2 = scanner.nextInt();
		
		if (numero1 % numero2 == 2) {
			System.out.println(numero1 + " é divisível por " + numero2);
		} else {
			System.out.println(numero1 + "não é divisivel por " + numero2);
		}
		
		
		scanner.close();

	}

}
