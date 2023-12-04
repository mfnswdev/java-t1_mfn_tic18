package transporte_Viario;

import java.util.List;
import java.util.Scanner;

public class class_Trecho<PontoDeParada> {
	  private PontoDeParada origem;
	  private PontoDeParada destino;
	
	  public class_Trecho(PontoDeParada origem, PontoDeParada destino) {
		super();
		this.origem = origem;
		this.destino = destino;
	}

	  public PontoDeParada getOrigem() {
		  return origem;
	}

	  public void setOrigem(PontoDeParada origem) {
		  this.origem = origem;
	}

	  public PontoDeParada getDestino() {
		  return destino;
	}

	  public void setDestino(PontoDeParada destino) {
		  this.destino = destino;
	}
	  
	 
	  @SuppressWarnings({ "rawtypes", "unchecked", "resource", "null" })
	public void cadastrarTrecho() {
		  	List<class_Trecho> trechos = null;
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Digite o nome do ponto de partida:");
	        String origem = scanner.nextLine();

	        System.out.println("Digite o nome do ponto de chegada:");
	        String destino = scanner.nextLine();

	        class_Trecho novoTrecho = new class_Trecho(origem, destino);

	        trechos.add(novoTrecho);

	        System.out.println("Trecho cadastrado com sucesso!");
	    }
	  
	  
}
