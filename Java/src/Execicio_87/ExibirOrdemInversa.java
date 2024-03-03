package Execicio_87;

import java.util.Scanner;

public class ExibirOrdemInversa {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite o tamanho do vetor: ");
		int tamanho = input.nextInt();
		
		int[] vetor = new int[tamanho];
		
		System.out.println("Digite os elementos do vetor:");
		for (int i = 0; i < tamanho; i++) {
			vetor[i] = input.nextInt();
		}
		
		System.out.println("Elementos do vetor em ordem inversa:");
		for (int i = tamanho - 1; i >= 0; i--) {
			System.out.print(vetor[i] + " ");
		}
		
		input.close();

	}

}
