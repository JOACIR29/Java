package Execicio_97;

import java.util.Scanner;

public class MaiorValorMatriz {

	public static void main(String[] args) {
		int[][] matriz = new int[5][5];
		int maiorValor = Integer.MIN_VALUE;
		int linhaMaiorValor = 0;
		int colunaMaiorValor = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		// Preenchendo a matriz
		System.out.println("Digite os valores da matriz:");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				matriz[i][j] = scanner.nextInt();
				
				// Verificando se o valor é maior que o maiorValor atual
				if (matriz[i][j] > maiorValor) {
					maiorValor = matriz[i][j];
					linhaMaiorValor = i;
					colunaMaiorValor = j;
					
				}
			}
		}
		
		// Exibindo o maior valor e a posição
		System.out.println("O maior valor da matriz é:" + maiorValor);
		System.out.println("Ele está na posição: [" + linhaMaiorValor + "][" + colunaMaiorValor + "]");
		
		
		scanner.close();

	}

}
