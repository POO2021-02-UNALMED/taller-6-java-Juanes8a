package vehiculos;

public class Camioneta extends Vehiculo{

	private boolean volco;
	private static int totalCamioneta;
	
	
	
	
	
	public Camioneta(String string, int i, String string2, int j, int k, Fabricante f, boolean volco) {

		super.placa = string;
		super.puertas = i;
		super.nombre = string2;
		super.precio = j;
		super.peso = k;
		super.fabricante = f;
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

