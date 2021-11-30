package vehiculos;

public class Camioneta extends Vehículo{

	private boolean volco;
	private int velocidadMaxima; 
	private String traccion;
	public Camioneta(int placa, int puertas, int velocidadMaxima, String nombre, int precio, int peso, String traccion,
			Fabricante fabricante, boolean volco, int velocidadMaxima2, String traccion2) {
		super(placa, puertas, velocidadMaxima, nombre, precio, peso, traccion, fabricante);
		this.volco = volco;
		velocidadMaxima = velocidadMaxima2;
		traccion = traccion2;
	}
	public boolean isVolco() {
		return volco;
	}
	public void setVolco(boolean volco) {
		this.volco = volco;
	}
	public int getVelocidadMaxima() {
		return velocidadMaxima;
	}
	public void setVelocidadMaxima(int velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}
	public String getTraccion() {
		return traccion;
	}
	public void setTraccion(String traccion) {
		this.traccion = traccion;
	}
	
	
}

