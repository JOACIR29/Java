package Execicio_40;

import java.util.Scanner;

public class VerificarTriangulo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o primeiro lado do triângulo: ");
		double lado1 = scanner.nextDouble();
		
		System.out.print("Digite o segundo lado triângulo: ");
		double lado2 = scanner.nextDouble();
		
		System.out.print("Digite o terceiro lado do triângulo: ");
		double lado3 = scanner.nextDouble();
		
		boolean podeFormarTriangulo = (lado1 + lado2 > lado3)
				&& (lado1 + lado3 > lado2)
				&& (lado2 + lado3 > lado1);
		
		if (podeFormarTriangulo) {
			System.out.println("Os números podem ser os lados de um triângulo.");
		} else {
			System.out.println("os números não podem ser os lados de um triângulo.");
		}
		
		scanner.close();
	}

}
