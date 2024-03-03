package Execicio_91;

import java.util.Scanner;

public class MultiplicacaoVetores {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite o tamanho dos vetores: ");
		int tamanho = input.nextInt();
		
		int[] vetor1 = new int[tamanho];
		int[] vetor2 = new int[tamanho];
		int[] vetorResultado = new int[tamanho];
		
		System.out.println("Digite os elementos do primeiro vetor:");
		for (int i = 0; i < tamanho; i++) {
			vetor1[i] = input.nextInt();
		}
		
		System.out.println("Digite os elementos do segundo vetor:");
		for (int i = 0; i < tamanho; i++) {
			vetor2[i] = input.nextInt();
		}
		
		for (int i = 0; i < tamanho; i++) {
			vetorResultado[i] = vetor1[i] * vetor2[i];
		}
		
		System.out.println("Vetor Resulto:");
		for (int i = 0; i < tamanho; i++) {
			System.out.print(vetorResultado[i] + " ");
		}
		
		
		input.close();
	}

}
