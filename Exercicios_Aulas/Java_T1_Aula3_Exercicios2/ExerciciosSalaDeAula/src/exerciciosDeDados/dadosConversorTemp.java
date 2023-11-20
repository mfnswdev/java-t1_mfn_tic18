package exerciciosDeDados;

import java.util.Scanner;

public class dadosConversorTemp {
	private
	float temp;
	
	public static float CparaF(float temp) {
		return (temp * 9 / 5) + 32;
	}

	public static float FparaC(float temp) {
		return (temp - 32) * 5 / 9;
	}
	
	public static void main(String[] args) {
		float temp;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite o valor da Temperaturade entrada: ");
		temp = scanner.nextFloat();
		
		System.out.println("O valor de entrada convertido" + " de Celsius para Fahrenheit é " + CparaF(temp) + " e de Fahrenheit para Celsius é " + FparaC(temp));
	}
}
