package Execicio_79;

import java.util.Scanner;

public class MDCProgram {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite o primeiro número: ");
		int numero1 = input.nextInt();
		
		System.out.print("Digite o segundo número: ");
		int numero2 = input.nextInt();
		
		int mdc = 1;
		int menorNumero = Math.min(numero1, numero2);
		
		for (int i = 1; i <= menorNumero; i++) {
			if (numero1 % i == 0 && numero2 % i == 0) {
				mdc = i;
			}
		}
		
		System.out.println("R: " + mdc);

	}

}
