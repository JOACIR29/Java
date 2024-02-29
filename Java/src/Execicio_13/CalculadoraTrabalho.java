package Execicio_13;

import java.util.Scanner;

public class CalculadoraTrabalho {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite a força aplicada: ");
		double forca = scanner.nextDouble();
		
		System.out.println("Digite a distância percorrida: ");
		double distancia = scanner.nextDouble();

		double trabalho = forca * distancia;
		
		System.out.println("O trabalho realizado é: " + trabalho);
		
		scanner.close();
	}

}
