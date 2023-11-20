package exerciciosDeDados;

import java.util.Scanner;

public class dadosParOuImpar {
	private
	int ValorDeEntrada;
	
	public static String verificaParidade(int ValorDeEntrada) {
		if (ValorDeEntrada % 2 == 0) {
			return "Par";
		} else {
			return "Ímpar";
		}
	}	

	public static void main(String[] args) {
		int ValorDeEntrada;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite o valor de entrada: ");
		ValorDeEntrada = scanner.nextInt();
		
		System.out.println("O valor de entrada é " + verificaParidade(ValorDeEntrada));
	}
}
