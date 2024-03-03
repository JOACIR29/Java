package Execicio_89;

import java.util.Scanner;

public class SegundoMaiorElemento {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite o tamanho do vetor: ");
		int tamanho = input.nextInt();

		int[] vetor = new int[tamanho];
		
		System.out.println("Digite os elementos do vetor:");
		for (int i = 0; i < tamanho; i++) {
			vetor[i] = input.nextInt();
		}
		
		int maior = Integer.MIN_VALUE;
		int segundoMaior = Integer.MIN_VALUE;
		
		for (int i = 0; i < tamanho; i++) {
			if (vetor[i] > maior) {
				segundoMaior = maior;
				maior = vetor[i];
			} else if (vetor[i] > segundoMaior && vetor[i] != maior) {
				segundoMaior = vetor[i];
			}
		}
		
		if (segundoMaior != Integer.MIN_VALUE) {
			System.out.println("O segundo maior elemento é: " + segundoMaior);
		} else {
			System.out.println("Não foi encontrada um segundo maior elemento no vetor.");
		}
		
		input.close();
	}

}
