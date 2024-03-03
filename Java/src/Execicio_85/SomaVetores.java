package Execicio_85;

import java.util.Scanner;

public class SomaVetores {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite o tamanho dos vetores: ");
		int tamanho = input.nextInt();
		
		int[] vetor1 = new int[tamanho];
		int[] vetor2 = new int[tamanho];
		int[] vetorSoma = new int[tamanho];
		
		System.out.println("Digite os elementos do primeiro vetor:");
		for (int i = 0; i < tamanho; i++) {
			vetor1[i] = input.nextInt();
		}
		
		System.out.println("Digite os elementos do segundo vetor:");
		for (int i = 0; i < tamanho; i++) {
			vetor2[i] = input.nextInt();
		}
		
		for (int i = 0; i < tamanho; i++) {
			vetorSoma[i] = vetor1[i] + vetor2[i];
		}
		
		System.out.println("A soma dos elementos correspondentes dos vetores é:");
		for (int i = 0; i < tamanho; i++) {
			System.out.print(vetorSoma[i] + " ");
		}
		
		
		input.close();

	}

}
