package Execicio_71;

import java.util.Scanner;

public class MediaNumeros {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int soma = 0;
		int contador = 0;
		
		System.out.println("Digite números (digite 0 para sair):");
		
		while (true) {
		int numero = input.nextInt();
		
		if (numero == 0) {
			break;
		}
		
		soma += numero;
		contador++;
		}
		
		if (contador != 0) {
			double media = (double) soma / contador;
			System.out.println("A média dos números digitados é: " + media);
		} else {
			System.out.println("Nenhum número foi digitado.");
		}

		input.close();
	}

}
