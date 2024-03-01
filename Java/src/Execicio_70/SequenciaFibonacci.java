package Execicio_70;

import java.util.Scanner;

public class SequenciaFibonacci {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		int numero = input.nextInt();
		
		int primeiroTermo = 0;
		int segundoTermo = 1;
		
		System.out.println("Sequência de fibonacci até " + numero + ":");
		
		while (primeiroTermo <= numero) {
			System.out.print(primeiroTermo + " ");
			
			
			int proximoTermo = primeiroTermo + segundoTermo;
			primeiroTermo = segundoTermo;
			segundoTermo = proximoTermo;
		}
		
		
		
		input.close();

	}

}
