package Execicio_57;

public class NumerosParesImpares {

	public static void main(String[] args) {
		System.out.println("Números Pares:");
		int i = 1;
		while (i <= 100) {
			if (i <= 50 && i % 2 == 0) {
				System.out.println(i);
			} else if (i >= 51 && i % 2 != 0) {
				System.out.println(i);
			}
			i++;
		}

	}

}
