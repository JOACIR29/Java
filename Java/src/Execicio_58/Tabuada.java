package Execicio_58;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um Número: ");
		int numero = scanner.nextInt();
		
		System.out.println("Tabuada do " + numero + ":");
		for (int i = 1; i <= 10; i++) {
			int resultado = numero * i;
			System.out.println(numero + " x" + i + " = " + resultado);
		}
		
		scanner.close();

	}

}
