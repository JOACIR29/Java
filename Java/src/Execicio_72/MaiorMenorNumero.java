package Execicio_72;

import java.util.Scanner;

public class MaiorMenorNumero {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int maior = Integer.MIN_VALUE;
		int menor = Integer.MAX_VALUE;
		
		
		System.out.println("Digite uma lista de números (digite 0 para sair):");
		
		while (true) {
			int numero = input.nextInt();
			
			if (numero == 0) {
				break;
			}
			
			if (numero > maior) {
				maior = numero;
			}
			
			if (numero < menor) {
				menor = numero;
			}
		}
		
		if (maior == Integer.MIN_VALUE && menor == Integer.MAX_VALUE) {
			System.out.println("Nenhum número foi digitado.");
		} else { 
			System.out.println("O maior número digitado foi: " + maior);
			System.out.println("O menor número digitado foi: " + menor);
		}
		
		
		input.close();

	}

}
