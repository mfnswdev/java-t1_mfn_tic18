package transporte_Viario;

import java.util.List;
import java.util.Scanner;

public class class_Passageiro {
		private String nome;
		private int idade;
		private static double cpf;
		private static int numBilhete;
		
		public class_Passageiro(String nome, int idade, double cpf, int numBilhete) {
			super();
			this.nome = nome;
			this.idade = idade;
			this.cpf = cpf;
			this.numBilhete = numBilhete;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public int getIdade() {
			return idade;
		}

		public void setIdade(int idade) {
			this.idade = idade;
		}

		public double getCpf() {
			return cpf;
		}

		public void setCpf(double cpf) {
			this.cpf = cpf;
		}

		public int getNumBilhete() {
			return numBilhete;
		}

		public void setNumBilhete(int numBilhete) {
			this.numBilhete = numBilhete;
		}
		
		 @SuppressWarnings({ "null", "resource" })
		public static void cadastrarNovoPassageiro() {
			    List<class_Passageiro> passageiros = null;
		        Scanner scanner = new Scanner(System.in);

		        System.out.println("Digite o nome do passageiro:");
		        String nome = scanner.nextLine();

		        System.out.println("Digite a idade do passageiro:");
		        int idade = scanner.nextInt();


		        class_Passageiro novoPassageiro = new class_Passageiro(nome, idade, cpf, numBilhete);

		        passageiros.add(novoPassageiro);
		        
		        System.out.println("Passageiro cadastrado com sucesso!");
		    }

}
