package exerciciosDeDados;

public class exercicioString {
	private
	String nome;
	String sobrenome;
	
	public static  String cocatenaString(String nome, String sobrenome) {
		return (nome + " " + sobrenome);
	}
	
	public static void main(String[] args) {
		String nome;
		String sobrenome;
		nome = "Matheus";
		sobrenome = "Fonseca";
		
		System.out.println(cocatenaString(nome, sobrenome));
		
	}
}