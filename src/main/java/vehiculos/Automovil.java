package vehiculos;

public class Automovil extends Vehiculo{
	public int puestos;
	private static int totalAuto;
	
	public Automovil(String string, String string2, int i, int j, Fabricante f, int k) {
		
		super.placa = string;
		super.nombre = string2;
		super.velocidadMaxima = i;
		super.precio = j;
		super.fabricante = f;
		super.peso = k;
		
		super.puertas = 4;
		super.velocidadMaxima = 100;
		super.traccion = "FWD";

	}
	
	
	
	
	public int getPuestos() {
		return puestos;
	}
	public void setPuestos(int puestos) {
		this.puestos = puestos;
	}
	public int getTotalAuto() {
		return totalAuto;
	}
	public void setTotalAuto(int totalAuto) {
		Automovil.totalAuto = totalAuto;
	}

	
}