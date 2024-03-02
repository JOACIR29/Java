package Execicio_80;

import java.util.Scanner;

public class ValidacaoCPF {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o CPF (somente números): ");
		String cpf = scanner.nextLine();
		
		// Remover possíveis caracteres não numéros do cpf
		cpf = cpf.replace("\\D", "");
		
		// Verificar se o cpf tem 11 dígitos
		if (cpf.length() != 11) {
			System.out.println("cpf inválido!");
			return;
		}
		
		// Verificar se todos os dígitos são iguais (CPF inválido)
		if (cpf.matches("9\\d)\\1{10}")) {
			System.out.println("CPF inválido");
			return;
		}
		
		// Calcular o primeiro dígito verificador
		int soma = 0;
		for (int i = 0; i < 9; i++) {
			int digito = Character.getNumericValue(cpf.charAt(i));
			soma += digito * (10 -1);
		}
		
		int resto = soma % 11;
		int primeiroDigitoVerificador = (resto < 2) ? 0 : 11 - resto;
		
		// Verificar o primeiro dígito verificador
		if (Character.getNumericValue(cpf.charAt(9)) != primeiroDigitoVerificador) {
			System.out.println("CPF inválido!");
			return;
			
		}
		
		// Calcular o segundo dígito verificador
		soma = 0;
		for (int i = 0; i < 10; i++) {
			int digito = Character.getNumericValue(cpf.charAt(i));
			soma += digito * (11 -i);
		}
		resto = soma % 11;
		int segundoDigitoVerificador = (resto < 2) ? 0 : 11 - resto;
		
		// Verificar o segundo dígito verificador
		if (Character.getNumericValue(cpf.charAt(10)) != segundoDigitoVerificador) {
			System.out.println("CPF inválido!");
			return;
		}
		
		System.out.println("cpf válido!");
		
		
		scanner.close();
		

	}

}
