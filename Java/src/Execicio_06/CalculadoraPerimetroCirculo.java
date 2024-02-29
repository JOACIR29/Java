package Execicio_06;

import java.util.Scanner;

public class CalculadoraPerimetroCirculo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o raio do círculo: ");
		double raio = scanner.nextDouble();
		
		double perimetro = 2 * Math.PI * raio;
		
		System.out.println("o perímetro do círculo é: " + perimetro);
		
		
		scanner.close();
	}

}
