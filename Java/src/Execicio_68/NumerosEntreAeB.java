package Execicio_68;

import java.util.Scanner;

public class NumerosEntreAeB {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite o valor de A: ");
		int a = input.nextInt();
		
		System.out.print("Digite o valor de B: ");
		int b = input.nextInt();
		
		System.out.println("Os números entre " + a + " e " + b + " são:");
		
		if (a < b) {
			for (int i = a + 1; i < b; i++) {
				System.out.print(i + " ");
			}
		} else {
			for (int i = b + 1; i < a; i++) {
				System.out.print(i + " ");
			}
		}
		
		input.close();

	}

}
