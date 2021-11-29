package numero3;

public class Computador extends EquipamentoEletronico {
	
	protected Gabinete gabinete;
	protected Teclado teclado;
	protected Mouse mouse;
	protected Monitor monitor;
	
	private String marca;
	private String Modelo;
	
	public Computador(){
		gabinete = new Gabinete();
		teclado = new Teclado();
		mouse = new Mouse();
		monitor = new Monitor();
		}
	
	public Gabinete getGabinete() {
		return gabinete;
	}
	public void setGabinete(Gabinete gabinete) {
		this.gabinete = gabinete;
	}
	public Teclado getTeclado() {
		return teclado;
	}
	public void setTeclado(Teclado teclado) {
		this.teclado = teclado;
	}
	public Mouse getMouse() {
		return mouse;
	}
	public void setMouse(Mouse mouse) {
		this.mouse = mouse;
	}
	public Monitor getMonitor() {
		return monitor;
	}
	public void setMonitor(Monitor monitor) {
		this.monitor = monitor;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		if (marca.length() > 0)
		this.marca = marca;
	}
	public String getModelo() {
		return Modelo;
	}
	public void setModelo(String modelo) {
		if (modelo.length() > 0)
		Modelo = modelo;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Computador [gabinete=");
		builder.append(gabinete);
		builder.append(", teclado=");
		builder.append(teclado);
		builder.append(", mouse=");
		builder.append(mouse);
		builder.append(", monitor=");
		builder.append(monitor);
		builder.append(", marca=");
		builder.append(marca);
		builder.append(", Modelo=");
		builder.append(Modelo);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
}
