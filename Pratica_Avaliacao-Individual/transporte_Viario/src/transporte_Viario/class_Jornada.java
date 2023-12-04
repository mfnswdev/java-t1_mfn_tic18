package transporte_Viario;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.Scanner;


public class class_Jornada {
    private static class_Trajeto trajeto;
    private class_Motorista motorista;
    private class_Cobrador cobrador; 
    private class_Veiculo veiculo;
    private static Date dataInicio;
    
	public class_Jornada(class_Trajeto trajeto, class_Motorista motorista, class_Cobrador cobrador, class_Veiculo veiculo, Date dataInicio) {
		super();
		class_Jornada.trajeto = trajeto;
		this.motorista = motorista;
		this.cobrador = cobrador;
		this.veiculo = veiculo;
		this.dataInicio = dataInicio;
	}

	public class_Trajeto getTrajeto() {
		return trajeto;
	}

	public void setTrajeto(class_Trajeto trajeto) {
		class_Jornada.trajeto = trajeto;
	}

	public class_Motorista getMotorista() {
		return motorista;
	}

	public void setMotorista(class_Motorista motorista) {
		this.motorista = motorista;
	}

	public class_Cobrador getCobrador() {
		return cobrador;
	}

	public void setCobrador(class_Cobrador cobrador) {
		this.cobrador = cobrador;
	}

	public class_Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(class_Veiculo veiculo) {
		this.veiculo = veiculo;
	}

	public Date getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(Date dataInicio) {
		class_Jornada.dataInicio = dataInicio;
	}
   
	@SuppressWarnings("resource")
	public static class_Jornada cadastrarJornada(List<class_Motorista> motoristas, List<class_Cobrador> cobradores, List<class_Veiculo> veiculos) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Selecione o motorista para a jornada:");
        class_Motorista motoristaSelecionado = selecionarMotorista(motoristas);

        class_Cobrador cobradorSelecionado = null;
        if (!cobradores.isEmpty()) {
            System.out.println("Deseja associar um cobrador a esta jornada? (S/N)");
            String opcao = scanner.nextLine();

            if (opcao.equalsIgnoreCase("S")) {
                cobradorSelecionado = selecionarCobrador(cobradores);
            }
        }

        System.out.println("Selecione o veículo para a jornada:");
        class_Veiculo veiculoSelecionado = selecionarVeiculo(veiculos);

        class_Jornada novaJornada = new class_Jornada(trajeto, motoristaSelecionado, cobradorSelecionado, veiculoSelecionado, dataInicio);

        while (true) {
            System.out.println("Deseja associar um novo trajeto à jornada? (S/N)");
            String opcao = scanner.nextLine();

            if (opcao.equalsIgnoreCase("N")) {
                break;
            }

            novaJornada.associarTrajeto();
        }

        System.out.println("Jornada cadastrada com sucesso!");

        return novaJornada;
    }

    @SuppressWarnings("resource")
	private static class_Motorista selecionarMotorista(List<class_Motorista> motoristas) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha um motorista:");

        for (int i = 0; i < motoristas.size(); i++) {
            System.out.println((i + 1) + ". " + motoristas.get(i).getNome());
        }

        int escolha = scanner.nextInt();
        scanner.nextLine(); 

        return motoristas.get(escolha - 1);
    }

    private static class_Cobrador selecionarCobrador(List<class_Cobrador> cobradores) {
        @SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha um cobrador:");

        for (int i = 0; i < cobradores.size(); i++) {
            System.out.println((i + 1) + ". " + cobradores.get(i).getNome());
        }

        int escolha = scanner.nextInt();
        scanner.nextLine(); 

        return cobradores.get(escolha - 1);
    }

    @SuppressWarnings("resource")
	private static class_Veiculo selecionarVeiculo(List<class_Veiculo> veiculos) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha um veículo:");

        for (int i = 0; i < veiculos.size(); i++) {
            System.out.println((i + 1) + ". " + veiculos.get(i).getPlaca());
        }

        int escolha = scanner.nextInt();
        scanner.nextLine(); 

        return veiculos.get(escolha - 1);
    }

    @SuppressWarnings({ "null", "unused" })
	public void associarTrajeto() {
        @SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

        System.out.println("Selecione um trajeto para associar à jornada:");
        class_Motorista trajeto = selecionarTrajeto();

        List<class_Motorista> trajetos = null;
        trajetos.add(trajeto);

        System.out.println("Trajeto associado à jornada com sucesso!");
    }

    @SuppressWarnings("unused")
	private class_Motorista selecionarTrajeto() {
        @SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha um trajeto:");

        return null;
    }
    
    @SuppressWarnings("unused")
	public static void registrarInicioTrajeto() {
        Object inicioTrajeto = null;
		if (inicioTrajeto == null) {
            inicioTrajeto = LocalDateTime.now();
            System.out.println("Início do trajeto registrado: " + inicioTrajeto);
        } else {
            System.out.println("O trajeto já foi iniciado anteriormente.");
        }
    }
    
}

