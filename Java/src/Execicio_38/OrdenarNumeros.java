package Execicio_38;

import java.util.Scanner;

public class OrdenarNumeros {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o primeiro número: ");
		int numero1 = scanner.nextInt();
		
		System.out.print("Digite o segundo número: ");
		int numero2 = scanner.nextInt();
		
		System.out.println("Digite o terceiro número: ");
		int numero3 = scanner.nextInt();
		
		if (numero1 <= numero2 && numero1 <= numero3) {
			System.out.print(numero1 + " ");
			if (numero2 <= numero3) {
				System.out.print(numero2 + " " + numero3);
			} else {
				System.out.print(numero3 + " " + numero2);
			}
		} else if (numero2 <=numero1 && numero2 <= numero3) {
			System.out.print(numero2 + " ");
			if (numero1 <= numero3) {
				System.out.print(numero1 + " " + numero3);
			} else { 
				System.out.print(numero3 + " " + numero1);
			}
		} else {
			System.out.print(numero3 + " ");
			if (numero1 <= numero2) {
				System.out.print(numero1 + " " + numero2);
			} else {
				System.out.print(numero2 + " " + numero1);
			}
		}
		
		
		scanner.close();

	}

}
