	package transporte_Viario;

import java.util.List;
import java.util.Scanner;

public class class_PontoParada {
	private String nome;

	public class_PontoParada(String nome) {
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
	public static void cadastrarNovoPontoParada() {
    	List<class_PontoParada> pontosParada = null;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do ponto de parada:");
        String nome = scanner.nextLine();


        class_PontoParada novoPontoParada = new class_PontoParada(nome);

        pontosParada.add(novoPontoParada);

        System.out.println("Ponto de parada cadastrado com sucesso!");
    }
	

}
