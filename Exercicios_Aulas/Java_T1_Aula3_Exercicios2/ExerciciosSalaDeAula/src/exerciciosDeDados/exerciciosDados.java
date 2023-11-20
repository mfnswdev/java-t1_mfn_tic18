package exerciciosDeDados;

import java.util.Scanner;

public class exerciciosDados {
	private
	int a;
	int b;
	
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	
	public static int somaInt (int a, int b) {
		return a + b;
	}
	
	public static void main(String[] args) {
		int a;
		int b;
		Scanner scanner = new Scanner(System.in);
		exerciciosDados somaDeInteiros = new exerciciosDados();
		
		
		System.out.print("Digite o valor int de 'a': ");
        a = scanner.nextInt();

        System.out.print("Digite o valor int de 'b': ");
        b = scanner.nextInt();
        
        System.out.println("A soma é igual à " + exerciciosDados.somaInt(a, b));
	}
}
