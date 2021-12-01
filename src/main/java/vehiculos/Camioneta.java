package vehiculos;

public class Camioneta extends Vehiculo{

	private boolean volco;
	private static int totalCamioneta;
	
	
	
	
	
	public Camioneta(String placa, int puertas,String nombre, int precio, int peso, Fabricante fabricante,boolean volco) {

		super.placa = placa;
		super.puertas = puertas;
		super.nombre = nombre;
		super.precio = precio;
		super.peso = peso;
		super.fabricante = fabricante;
		super.velocidadMaxima = 90;
		super.traccion = "4X4";
		this.volco = volco;

		totalCamioneta++;
		Vehiculo.totalVehiculos++;
	}
	public boolean isVolco() {
		return volco;
	}
	public void setVolco(boolean volco) {
		this.volco = volco;
	}
	public static int getTotalCamioneta() {
		return totalCamioneta;
	}
	public void setVelocidadMaxima(int totalCamioneta) {
		Camioneta.totalCamioneta = totalCamioneta;
	}

	
	
}

