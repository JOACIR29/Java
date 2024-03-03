package Execicio_83;

import java.util.Scanner;

public class MaiorElementoVetor {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite a quatidade de elementos: ");
		int quantidade = input.nextInt();
		
		int[] vetor = new int[quantidade];
		
		System.out.println("Digite os elementos do vetor:");
		
		for (int i = 0; i < quantidade; i++) {
			System.out.print("Elemento " + (i + 1) + ": ");
			vetor[i] = input.nextInt();
		}
		
		int maior = vetor[0];
		
		for (int i = 1; i < quantidade; i++) {
			if (vetor[i] > maior) {
				maior = vetor[i];
			}
		}
		
		System.out.println("O maior elemento de vetor é: " + maior);
		
		
		input.close();
	}

}
