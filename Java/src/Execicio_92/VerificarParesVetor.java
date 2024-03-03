package Execicio_92;

import java.util.Scanner;

public class VerificarParesVetor {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite o tamanho do vetor: ");
		int tamanho = input.nextInt();
		
		int[] vetor = new int[tamanho];
		
		System.out.println("Digite os elementos do vetor:");
		for (int i = 0; i < tamanho; i++) {
			vetor[i] = input.nextInt();
		}
		
		boolean todosPares = true;
		
		for (int i = 0; i < tamanho; i++) {
			if (vetor[i] % 2 != 0) {
				todosPares = false;
				break;
			}
		}
		
		if (todosPares) {
			System.out.println("Todos os elementos são pares.");
		} else {
			System.out.println("Existem elementos ímpares no vetor.");
		}
		
		
		input.close();
	}

}
