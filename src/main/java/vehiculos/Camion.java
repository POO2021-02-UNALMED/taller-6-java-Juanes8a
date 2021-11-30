package vehiculos;

public class Camion extends Vehículo{
	
	public int ejes;
	public int puertas=2;
	public int velocidadMaxima=80;
	public String traccion="4X2";
	public Camion(int placa, int puertas, int velocidadMaxima, String nombre, int precio, int peso, String traccion,
			Fabricante fabricante, int ejes, int puertas2, int velocidadMaxima2, String traccion2) {
		super(placa, puertas, velocidadMaxima, nombre, precio, peso, traccion, fabricante);
		this.ejes = ejes;
		puertas = puertas2;
		velocidadMaxima = velocidadMaxima2;
		traccion = traccion2;
	}
	
	
	
	public int getEjes() {
		return ejes;
	}
	public void setEjes(int ejes) {
		this.ejes = ejes;
	}
	public int getPuertas() {
		return puertas;
	}
	public void setPuertas(int puertas) {
		this.puertas = puertas;
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
