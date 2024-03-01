package Execicio_63;

import java.util.Scanner;

public class CalculoPotencia {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite o número base: ");
		double base = input.nextDouble();
		
		System.out.print("Digite o exponte: ");
		int expoente = input.nextInt();
		
		double resultado = Math.pow(base, expoente);
		
		System.out.println(base + " elevado a " + expoente + " é: " + resultado);
		
		
		input.close();

	}

}
