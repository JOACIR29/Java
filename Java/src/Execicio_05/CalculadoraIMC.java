package Execicio_05;

import java.util.Scanner;

public class CalculadoraIMC {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o peso em quilogramas: ");
		double peso = scanner.nextDouble();
		
		System.out.println("Digite a altura em metros: ");
		double altura = scanner.nextDouble();
		
		double imc = peso / (altura * altura);
		
		System.out.println("O IMC é: " + imc);
		
		
		
		scanner.close();
	}

}
