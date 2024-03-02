package Execicio_78;

import java.util.Scanner;

public class MMCProgram {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		int numero1 = scanner.nextInt();
		
		System.out.print("Digite o segundo número: ");
		int numero2 = scanner.nextInt();
		
		int maiorNumero = Math.max(numero1, numero2);
		int mmc = maiorNumero;
		
		while (mmc % numero1 != 0 || mmc % numero2 != 0) {
			mmc += maiorNumero;
		}
		
		System.out.println("O MMC de " + numero1 + " e " + numero2 + " é: " + mmc);
		
		
		scanner.close();
				

	}

}
