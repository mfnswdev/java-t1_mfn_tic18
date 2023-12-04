package transporte_Viario;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class class_Veiculo {
	    private String placa;
	    private int ano;
	    
		public class_Veiculo(String placa, int ano) {
			super();
			this.placa = placa;
			this.ano = ano;
		}

		public String getPlaca() {
			return placa;
		}

		public void setPlaca(String placa) {
			this.placa = placa;
		}

		public int getAno() {
			return ano;
		}

		public void setAno(int ano) {
			this.ano = ano;
		}

		  @SuppressWarnings("resource")
		public static void cadastrarNovoVeiculo(List<class_Veiculo> veiculos) {
		        Scanner scanner = new Scanner(System.in);

		        System.out.println("Cadastro de Veículo");
		        System.out.print("Placa: ");
		        String placa = scanner.nextLine();

		        System.out.print("Ano: ");
		        int ano = scanner.nextInt();
		        scanner.nextLine(); 

		        class_Veiculo veiculo = new class_Veiculo(placa, ano);
		        veiculos.add(veiculo);

		        System.out.println("Veículo cadastrado com sucesso!");
		    }

		    public static void main(String[] args) {
		        List<class_Veiculo> listaVeiculos = new ArrayList<>();
		        cadastrarNovoVeiculo(listaVeiculos);
		    }
}
