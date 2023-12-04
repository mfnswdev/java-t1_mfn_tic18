package transporte_Viario;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class app_Main {

	    @SuppressWarnings("unused")
		public static void main(String[] args) {
	    	   List<class_Veiculo> listaVeiculos = new ArrayList<>();
	           List<class_Motorista> listaMotoristas = new ArrayList<>();
	           List<class_Cobrador> listaCobradores = new ArrayList<>();
	           List<class_Passageiro> listaPassageiros = new ArrayList<>();
	           List<class_PontoParada> listaPontosParada = new ArrayList<>();
	           List<class_Trajeto> listaTrajetos = new ArrayList<>();
	           List<class_Jornada> listaJornadas = new ArrayList<>();

	        Scanner scanner = new Scanner(System.in);
	        int opcao;

	        do {
	            System.out.println("\n=== Menu do Sistema ===");
	            System.out.println("1. Cadastro de Veículos");
	            System.out.println("2. Cadastro de Motoristas");
	            System.out.println("3. Cadastro de Cobradores");
	            System.out.println("4. Cadastro de Passageiros");
	            System.out.println("5. Cadastro de Pontos de Parada");
	            System.out.println("6. Cadastro de Trajetos");
	            System.out.println("7. Registro de Jornadas");
	            System.out.println("8. Registro de Início de Trajeto");
	            System.out.println("9. Registro de Passageiro Embarcado");
	            System.out.println("10. Registro de Checkpoint (Fim de Trajeto)");
	            System.out.println("0. Sair");

	            System.out.print("Escolha uma opção: ");
	            opcao = scanner.nextInt();
	            scanner.nextLine(); 

	            switch (opcao) {
	                case 1:
	                    class_Veiculo.cadastrarNovoVeiculo(listaVeiculos);
	                    break;
	                case 2:
	                    class_Motorista.cadastrarMotorista();
	                    break;
	                case 3:
	                    class_Cobrador.cadastrarNovoCobrador();
	                    break;
	                case 4:
	                    class_Passageiro.cadastrarNovoPassageiro();
	                    break;
	                case 5:
	                    class_PontoParada.cadastrarNovoPontoParada();
	                    break;
	                case 6:
	                    class_Trajeto.cadastrarTrajeto();
	                    break;
	                case 7:
	                    class_Jornada.cadastrarJornada(listaMotoristas, listaCobradores, listaVeiculos);
	                    break;
	                case 8:
	                    class_Jornada.registrarInicioTrajeto();
	                    break;
	                case 9:
	                    class_Embarque.registrarEmbarqueComCartao(null, null, null);
	                    break;
	                case 10:
	                    class_Checkpoint.registrarCheckpoint();
	                    break;
	                case 0:
	                    System.out.println("Sistema encerrado.");
	                    break;
	                default:
	                    System.out.println("Opção inválida. Tente novamente.");
	                    break;
	            }

	        } while (opcao != 0);

	        scanner.close();
	    }
	}


