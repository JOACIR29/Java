package Execicio_98;

import java.util.Scanner;

public class MediaPosicoesPares {

	public static void main(String[] args) {
		int[][] matriz = new int[3][3];
		int soma = 0;
		int quantidade = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		// preenchendo a matriz
		System.out.println("Digite os valores da matriz:");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				matriz[i][j] = scanner.nextInt();
				
				// Verificando se a posição é par
				if ((i + j) % 2 == 0) {
					soma += matriz[i][j];
					quantidade++;
				}
			}
		}
		
		// Calculondo a média
		double media = (double) soma / quantidade;
		
		// Exibindo a média
		System.out.println("A média dos valores presentes nas posições pares é: " + media);
		
		scanner.close();

	}

}
