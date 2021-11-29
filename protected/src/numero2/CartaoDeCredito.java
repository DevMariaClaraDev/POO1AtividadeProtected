package numero2;

public class CartaoDeCredito {
	
	private int numero;
	private String operadora;
	private double limite;
	private String tipoDecartao;
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		if (numero >= 0)
		this.numero = numero;
	}
	public String getOperadora() {
		return operadora;
	}
	public void setOperadora(String operadora) {
		if (operadora.length() > 0)
		this.operadora = operadora;
	}
	public double getLimite() {
		return limite;
	}
	public void setLimite(double limite) {
		if (limite > 0)
		this.limite = limite;
	}
	public String getTipoDecartao() {
		return tipoDecartao;
	}
	public void setTipoDecartao(String tipoDecartao) {
		if (tipoDecartao.length() > 0)
		this.tipoDecartao = tipoDecartao;
	}
	
	

}
