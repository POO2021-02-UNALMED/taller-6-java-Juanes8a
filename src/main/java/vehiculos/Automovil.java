package vehiculos;

public class Automovil extends Vehiculo{
	public int puestos;
	private static int totalAuto;
	
	public Automovil(String placa, String nombre, int velocidadMaxima, int precio, Fabricante fabricante, int peso) {
		
		super.placa = placa;
		super.nombre = nombre;
		super.velocidadMaxima = velocidadMaxima;
		super.precio = precio;
		super.fabricante = fabricante;
		super.peso = peso;
		
		super.puertas = 4;
		super.velocidadMaxima = 100;
		super.traccion = "FWD";
		totalAuto++;
		Vehiculo.totalVehiculos++;
	}
	
	
	
	
	public int getPuestos() {
		return puestos;
	}
	public void setPuestos(int puestos) {
		this.puestos = puestos;
	}
	public static int getTotalAuto() {
		return totalAuto;
	}
	public void setTotalAuto(int totalAuto) {
		Automovil.totalAuto = totalAuto;
	}

	
}