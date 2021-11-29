package numero1;

public class Main {

	public static void main(String[] args) {
		
		Carro P1 = new Carro();
		
		P1.dono.setNome("Gabriel");
		P1.dono.setEndereco("Rua x");
	
		P1.motor.setMarca("Fiat");
		P1.motor.setPotencia(350f);
		P1.motor.setCilindros(50);
		P1.motor.setCombustivel("gasolina");
		
		P1.setCor("Amarelo");
		P1.setModelo("Uno");
		P1.setAno(2021);
		P1.setFabricante("Fiat");
		
		System.out.print(P1);
	}

}
