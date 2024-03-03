package Execicio_88;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ExibirOrdemInversa {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Pedimos ao esuário para digitar o tamanho do vetor:
		System.out.print("Digite o tamanho do vetor: ");
		int tamanho = input.nextInt();
		
		//Criamos um ArryList chamado vetor para armazenar os elementos do vetor:
		ArrayList<Integer> vetor = new ArrayList<Integer>();
		
		//Solicitamos ao usuário que digite os elementos do vetor usando um loop for:
		System.out.println("Digite os elementos do vetor:");
		for (int i = 0; i < tamanho; i++) {
			vetor.add(input.nextInt());
		}
		
		//Utilizamos o método reverse da classe Collections para inverter o vetor:
		Collections.reverse(vetor);
		
		System.out.println("Elementos do vetor em ordem inversa:");
		//Por fim, percorremos o vetor invertido e exibimos seus elementos na ordem inversa:
		for (int elemento : vetor) {
			System.out.print(elemento + " ");
		}
		
		input.close();

	}

}
