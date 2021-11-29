package numero2;

public class ContaBancaria {

	protected Banco banco;
	protected Pessoa correntista;

	private int agencia;
	private int numerodaconta;
	private double saldo;
	
	public ContaBancaria(){
	banco = new Banco();
	correntista = new Pessoa();
	}
	

	public Banco getBanco() {
		return banco;
	}

	public void setBanco(Banco banco) {
		this.banco = banco;
	}

	public Pessoa getCorrentista() {
		return correntista;
	}

	public void setCorrentista(Pessoa correntista) {
		this.correntista = correntista;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		if (agencia > 0)
		this.agencia = agencia;
	}

	public int getNumeroDaConta() {
		return numerodaconta;
	}

	public void setNumeroDaConta(int numeroDaConta) {
		if (numerodaconta > 0)
		numerodaconta = numeroDaConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		if (saldo > 0)
		this.saldo = saldo;
	}

	public boolean deposito(double valor) {
		if (valor > 0) {
			setSaldo(getSaldo() + valor);
			return true;
		}

		return false;

	}

	public boolean saque(double valor) {
		if (valor <= getSaldo()) {
			setSaldo(getSaldo() - valor);
			return true;
		}

		return false;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ContaBancaria [banco=");
		builder.append(banco);
		builder.append(", correntista=");
		builder.append(correntista);
		builder.append(", agencia=");
		builder.append(agencia);
		builder.append(", numerodaconta=");
		builder.append(numerodaconta);
		builder.append(", saldo=");
		builder.append(saldo);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}

}
	
