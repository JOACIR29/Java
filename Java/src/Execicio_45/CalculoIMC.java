package Execicio_45;

import java.util.Scanner;

public class CalculoIMC {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o peso (em kg): ");
		double peso = scanner.nextDouble();
		System.out.print("Digite a altura (em metros): ");
		double altura = scanner.nextDouble();
		double imc = peso / (altura * altura);
		String categoria;
		if (imc < 18.5) {
			categoria = "Abaixo do peso";
		} else if (imc < 25) {
			categoria = "Peso normal";
		} else if (imc < 30) {
			categoria = "Sobrepeso";
		} else if (imc < 35) {
			categoria = "Obesidade";
		} else {
			categoria = "Obesidade grave";
		}
		System.out.println("Seu IMC é: " + imc);
		System.out.println("Categoria: " + categoria);
		
		
		scanner.close();
	}

}
