package transporte_Viario;

import java.util.List;
import java.util.Scanner;

public class class_Motorista {
		private String nome;
		private static int cnh;
		
		public class_Motorista(String nome, int cnh) {
			super();
			this.nome = nome;
			class_Motorista.cnh = cnh;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public int getCnh() {
			return cnh;
		}

		public void setCnh(int cnh) {
			this.cnh = cnh;
		}
		
		 @SuppressWarnings({ "null", "resource" })
		public static void cadastrarMotorista() {
			 	List<class_Motorista> motoristas = null;
		        Scanner scanner = new Scanner(System.in);

		        System.out.println("Cadastro de Motorista");
		        System.out.print("Nome: ");
		        String nome = scanner.nextLine();

		        class_Motorista novoMotorista = new class_Motorista(nome, cnh);
		        
		        motoristas.add(novoMotorista);

		        System.out.println("Motorista cadastrado com sucesso!");
		    }	

}
