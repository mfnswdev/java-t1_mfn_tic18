package transporte_Viario;

import java.util.List;
import java.util.Scanner;

@SuppressWarnings("rawtypes")
public class class_Trajeto {
	  @SuppressWarnings("rawtypes")
	  private List<class_Trajeto> trajetos;
	  private List<class_Trecho> trechos;
	  

	  @SuppressWarnings({ "rawtypes" })
	public class_Trajeto(List<class_Trecho> nomeTrajeto) {
		  super();
		  this.trechos = nomeTrajeto;
	}


	  public class_Trajeto(String nomeTrajeto) {
		// TODO Auto-generated constructor stub
	}


	public void adicionarTrecho(class_Trecho<?> trecho) {
	        trechos.add(trecho);
	    }


	  @SuppressWarnings("rawtypes")
	public List<class_Trecho> getTrechos() {
		  return trechos;
	}


	  @SuppressWarnings("rawtypes")
	public void setTrechos(List<class_Trecho> trechos) {
		  this.trechos = trechos;
	}

	  @SuppressWarnings({ "resource", "unused" })
	public static class_Trajeto cadastrarTrajeto() {
		  	List<class_Trajeto> trajetos;
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Digite o nome do trajeto:");
	        String nomeTrajeto = scanner.nextLine();

	        class_Trajeto novoTrajeto = new class_Trajeto(nomeTrajeto);

	        while (true) {
	            System.out.println("Deseja cadastrar um novo trecho? (S/N)");
	            String opcao = scanner.nextLine();

	            if (opcao.equalsIgnoreCase("N")) {
	                break;
	            }

	            class_Trajeto.cadastrarTrajeto();
	        }

	        System.out.println("Trajeto cadastrado com sucesso!");

	        return novoTrajeto;
	    }
	   
}
