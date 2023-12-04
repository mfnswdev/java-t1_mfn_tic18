package transporte_Viario;

import java.util.List;
import java.util.Scanner;

public class class_Cobrador {
		private String nome;

		public class_Cobrador(String nome) {
			super();
			this.nome = nome;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}
		
		@SuppressWarnings({ "null", "resource" })
		public static void cadastrarNovoCobrador() {
		    List<class_Cobrador> cobradores = null;
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Digite o nome do cobrador:");
	        String nome = scanner.nextLine();

	     

	        class_Cobrador novoCobrador = new class_Cobrador(nome);

	        cobradores.add(novoCobrador);

	        System.out.println("Cobrador cadastrado com sucesso!");
	    }

		
}
