package Execicio_93;

import java.util.Scanner;

public class SomaDiagonalPrincipal {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int[][] matriz = new int[3][3];
		
		System.out.println("Digite os valores da matriz 3x3:");
		
		// Preenchendo a matriz com valores informados pelo usuário
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print("Digite o valor para a posição [" + i + "] [" + j + "]: ");
				matriz[i][j] = input.nextInt();
			}
		}
		
		// Calculando a soma dos valores da diagonal principal
		int somaDiagonal = 0;
		for (int i = 0; i < 3; i++) {
			somaDiagonal += matriz[i][i];
		}
		
		System.out.println("A soma dos valores da diagonal pricipal é " + somaDiagonal);
		
		
		
		input.close();
	}

}
