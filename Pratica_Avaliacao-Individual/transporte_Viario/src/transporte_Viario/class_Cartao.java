package transporte_Viario;

public class class_Cartao {
	  private String numero;
	    private String tipo; 
	    private boolean ativo;

	    public class_Cartao(String numero, String tipo) {
	        this.numero = numero;
	        this.tipo = tipo;
	        this.ativo = true; 
	    }

	    public void desativarCartao() {
	        this.ativo = false;
	    }

	    public void ativarCartao() {
	        this.ativo = true;
	    }

	    public String getNumero() {
	        return numero;
	    }

	    public String getTipo() {
	        return tipo;
	    }

	    public boolean isAtivo() {
	        return ativo;
	    }
}
