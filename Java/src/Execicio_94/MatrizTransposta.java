package Execicio_94;

import java.util.Random;

public class MatrizTransposta {

	public static void main(String[] args) {
		int[][] matriz = new int[4][4];
		
		// Preenchendo a matriz com valores aleatórios
		Random random = new Random();
		for (int i = 0; i < matriz.length; i++) {
		    for (int j = 0; j < matriz[0].length; j++) {
		        matriz[i][j] = random.nextInt(10); // Generates a random number between 0 and 9
		    }
		}

		System.out.println("Matriz original:");
		for (int i = 0; i < 4; i++) {
		    for (int j = 0; j < 4; j++) {
		        System.out.print(matriz[i][j] + " ");
		    }
		    System.out.println();
		}

		// Calculando e exibindo a matriz transposta
		int[][] matrizTransposta = new int[4][4];
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				matrizTransposta[j][i] = matriz[i][j];
			}
		}
		
		System.out.println("Matriz transposta:");
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(matrizTransposta[i][j] + " ");
			}
			System.out.println();
		}
	}

}
