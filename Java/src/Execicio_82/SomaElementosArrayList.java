package Execicio_82;

import java.util.ArrayList;
import java.util.Scanner;

public class SomaElementosArrayList {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite a quatidade de elementos: ");
		int quantidade = input.nextInt();
		
		ArrayList<Integer> lista = new ArrayList<>();

		System.out.println("Digiteos elementos da lista:");
		for (int i = 0; i < quantidade; i++) {
			lista.add(input.nextInt());
		}
		
		int soma = 0; 
		for (int numero : lista) {
			soma += numero;
		}
		
		System.out.println("A soma dos elementos é: + soma");
		
		input.close();
	}

}
