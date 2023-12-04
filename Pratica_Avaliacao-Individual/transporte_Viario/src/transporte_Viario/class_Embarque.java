package transporte_Viario;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

public class class_Embarque {
    	private static List<class_Embarque> embarques;
    	private class_Passageiro passageiro;
	    private class_Cartao cartao;
	    private class_PontoParada pontoDeEmbarque;
	    private Date dataEmbarque;

	    
	    public void Embarque(class_Passageiro passageiro, class_Cartao cartao, class_PontoParada pontoDeEmbarque, Date dataEmbarque) {
	        this.passageiro = passageiro;
	        this.cartao = cartao;
	        this.pontoDeEmbarque = pontoDeEmbarque;
	        this.dataEmbarque = dataEmbarque;
	    }


		public class_Passageiro getPassageiro() {
			return passageiro;
		}


		public void setPassageiro(class_Passageiro passageiro) {
			this.passageiro = passageiro;
		}


		public class_Cartao getCartao() {
			return cartao;
		}


		public void setCartao(class_Cartao cartao) {
			this.cartao = cartao;
		}


		public class_PontoParada getPontoDeEmbarque() {
			return pontoDeEmbarque;
		}


		public void setPontoDeEmbarque(class_PontoParada pontoDeEmbarque) {
			this.pontoDeEmbarque = pontoDeEmbarque;
		}


		public Date getDataEmbarque() {
			return dataEmbarque;
		}


		public void setDataEmbarque(Date dataEmbarque) {
			this.dataEmbarque = dataEmbarque;
		}


		public List<class_Embarque> getEmbarques() {
			return embarques;
		}


		public void setEmbarques(List<class_Embarque> embarques) {
			this.embarques = embarques;
		}
	    
		public static void registrarEmbarqueComCartao(class_Passageiro passageiro, class_PontoParada pontoEmbarque, class_Cartao cartao) {
	        class_Embarque embarque = new class_Embarque();
	        embarques.add(embarque);
	        System.out.println("Embarque registrado: " + embarque);
	    }
	    
}
