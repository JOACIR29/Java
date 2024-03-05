package Execicio_99;

import java.util.Random;

public class SomaLinhaColunas {

	public static void main(String[] args) {
		int[][] matriz = new int[4][4];
		Random random = new Random();
		
		
		// Preenchendo a matriz com números aleatórios
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				matriz[i][j] = random.nextInt(100);
			}
		}
		
		// exibindo a matriz
		System.out.println("Matriz:");
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
		
		// Calculando a soma das linhas
		System.out.println("Soma das linhas:");
		for (int i = 0; i < 4; i++) {
			int somaLinha = 0;
			for (int j = 0; j < 4; j++) { 
				somaLinha += matriz[i][j];
			}
			System.out.println("Linha " + (i + 1) + ": " + somaLinha);
		}
		
		// Calculando a soma das colunas
		System.out.println("Soma das colunas:");
		for (int j = 0; j < 4; j++) {
			int somaColuna = 0;
			for (int i = 0; i < 4; i++) {
				somaColuna += matriz[i][j];
			}
			System.out.println("Coluna " + (j + 1) + ": " + somaColuna);
		}

	}

}
