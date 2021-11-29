package numero3;

public class Main {

	public static void main(String[] args) {
		
	Computador c1 = new Computador();
	
	c1.gabinete.setTipo("ATX");
	c1.gabinete.setBaias(5);
	c1.gabinete.setModelo("X");
	
	c1.teclado.setMarca("logi");
	c1.teclado.setTipo("gamer");
	
	c1.mouse.setMarca("logi");
	c1.mouse.setTipo("gamer");
	
	c1.monitor.setMarca("vaio");
	c1.monitor.setResolucao("720 x 1080");
	c1.monitor.setTipo("do tipo que dá para ver");
	
	c1.setMarca("Acer");
	c1.setModelo("computador de mesa");
	
	Gabinete g1 = new Gabinete();
	
	g1.placamae.setMarca("AMD");
	g1.placamae.setModelo("Teste");
	
	PlacaMae p1 = new PlacaMae();
	
	p1.processador.setCache(3);
	p1.processador.setClock(3.70f);
	p1.processador.setMarca("Intel");
	p1.processador.setModelo("teste");
	
	p1.hd.setCapacidade(1);
	p1.hd.setMarca("Dell");
	p1.hd.setModelo("teste");
	p1.hd.setRpm(7200);
	
	p1.memoria.setVelocidade(3200);
	p1.memoria.setCapacidade(8);
	p1.memoria.setMarca("Dell");
	p1.memoria.setModelo("SDRAM");
	
	}

}
