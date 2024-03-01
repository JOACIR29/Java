package Execicio_67;

import java.util.Scanner;

public class QuadradosPerfeitos {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite a quantidade de quadrados perfeitos desejada: ");
		int quantidade = input.nextInt();
		
		System.out.println("os primeiros " + quantidade + " quadrados perfeitos são:");
		
		int numero = 1;
		int contador = 0;
		
		while (contador < quantidade) {
			int raiz = (int) Math.sqrt(numero);
			
			if (raiz * raiz == numero) {
				System.out.print(numero + " ");
				contador++;
			}
			
			numero++;
		}
		
		
		input.close();

	}

}
