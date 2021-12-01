package vehiculos;

public class Camion extends Vehiculo{
	
	public int ejes;
	private static int totalCam;
	
	
	public Camion(String placa,String texto,int precio,int peso,Fabricante fabricante,int ejes) {
		super.placa = placa;
		super.puertas = 2;
		super.velocidadMaxima = 80;
		super.nombre = texto;
		super.precio = precio;
		super.peso = peso;
		super.traccion = "4X2";
		
		super.fabricante = fabricante;
		this.ejes = ejes;
		totalCam++;
		Vehiculo.totalVehiculos++;
	}
	
	
	
	public int getEjes() {
		return ejes;
	}
	public void setEjes(int ejes) {
		this.ejes = ejes;
	}
	public static int getTotalCam() {
		return totalCam;
	}
	public void setTotalCam(int totalCam) {
		Camion.totalCam = totalCam;
	}


	
	
}
