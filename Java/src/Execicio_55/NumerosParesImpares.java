package Execicio_55;

public class NumerosParesImpares {

	public static void main(String[] args) {
		System.out.println("Números Pares:");
		int i = 1;
		while (i <= 50) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
			i++;
		}
		
		System.out.println("\nNúmeros Ínpares:");
		i = 51;
		while (i <= 100) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
			i++;
		}

	}

}
