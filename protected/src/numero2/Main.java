package numero2;

public class Main {

	public static void main(String[] args) {
		
		ContaBancaria c1 = new ContaBancaria();
		
		c1.banco.setCodigo(1);
		c1.banco.setNumeroAgencias(500);
		c1.banco.setNome("Marcio");
		
		c1.correntista.setNome("Luisa");
		c1.correntista.setEndereco("Laranjeira");
		
		c1.setAgencia(1256);
		c1.setNumeroDaConta(14567-98);
		c1.setSaldo(2000);
		
		c1.deposito(100);
		c1.saque(200);
		
		System.out.print(c1);
		
		ContaSimples p1 = new ContaSimples();
		
		p1.setSaldoPoupanca(1000);
		p1.depositoPoupanca(10);
		p1.saquePoupanca(500);
		
		ContaEspecial d1 = new ContaEspecial();
		
		d1.cartao.setNumero(20356);
		d1.cartao.setOperadora("teste");
		d1.cartao.setLimite(1000);
		d1.cartao.setTipoDecartao("débito");
		
		d1.setDiasSemJuros(5);
		d1.setLimite(1000);
	
	}

}
