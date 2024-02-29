package Execicio_60;


import java.util.Scanner;

public class SomaNumeros {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o número: ");
		int numero = scanner.nextInt();
		
		int soma = 0;
		for (int i = 0; i <= numero; i++) {
			soma += i;
		}
		
		System.out.println("A soma dos números de 1 a " + numero + " é: " + soma);
		
		
		scanner.close();
	}

}
