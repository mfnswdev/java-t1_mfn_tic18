package exerciciosDeDados;

public class dadosTrocaVariavel {
	public static void main(String[] args) {
		int a, b, temp;
		a = 3;
		b = 5;
		temp = b;
		b = a;
		a = temp;
		System.out.println("Com a troca, os valores ficam: " + a + " " + b);
		
		a = a ^ b;
		b = b ^ a;
		a = a ^ b;
		System.out.println("Com a segunda troca, os valores ficam: " + a + " " + b);

	}
}
