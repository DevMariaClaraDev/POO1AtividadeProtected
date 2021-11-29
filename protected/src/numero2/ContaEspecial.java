package numero2;

public class ContaEspecial extends ContaBancaria {
	
	protected CartaoDeCredito cartao;
	
	private int diasSemJuros;
	private double limite;
	
	public ContaEspecial(){
		cartao = new CartaoDeCredito();
	}
	
	public CartaoDeCredito getCartao() {
		return cartao;
	}
	public void setCartao(CartaoDeCredito cartao) {
		this.cartao = cartao;
	}
	public int getDiasSemJuros() {
		return diasSemJuros;
	}
	public void setDiasSemJuros(int diasSemJuros) {
		if (diasSemJuros > 0)
		this.diasSemJuros = diasSemJuros;
	}
	public double getLimite() {
		return limite;
	}
	public void setLimite(double limite) {
		if (limite > 0)
		this.limite = limite;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ContaEspecial [cartao=");
		builder.append(cartao);
		builder.append(", diasSemJuros=");
		builder.append(diasSemJuros);
		builder.append(", limite=");
		builder.append(limite);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
}
