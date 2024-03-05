package Execicio_96;

import java.util.Scanner;

public class SomaMatrizes {

	public static void main(String[] args) {
		int[][]matriz1 = new int[2][2];
		int[][]matriz2 = new int[2][2];
		int[][]resultado = new int[2][2];
		
		Scanner scanner = new Scanner(System.in);
		
		// Lendo a primeira matriz
		System.out.println("Digite os valores da primeira matriz:");
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				matriz1[i][j] = scanner.nextInt();
			}
		}
		
		//Lendo a segunda matriz
		System.out.println("Digite os valores da segunda matriz:");
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				matriz2[i][j] = scanner.nextInt();
			}
		}
		
		// Calculando a soma das matrizes
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				resultado[i][j] = matriz1[i][j] + matriz2[i][j];
			}
		}
		
		// Exibindo a matriz resultado
		System.out.println("A matriz soma é:");
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print(resultado[i][j] + " ");
			}
			System.out.println();
		}
		
		scanner.close();

	}

}
