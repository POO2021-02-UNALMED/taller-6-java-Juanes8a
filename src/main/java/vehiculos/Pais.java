package vehiculos;

public class Pais {
	public String nombre;
	private int totalPaises;

	public Pais(String nombre) {
		this.nombre = nombre;
		totalPaises++;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getTotalPaises() {
		return totalPaises;
	}

	public void setTotalPaises(int totalPaises) {
		this.totalPaises = totalPaises;
	}
	
	public static Pais paisMasVendedor() {
		return Fabricante.fabricaMayorVentas().getPais();
	}
	
	
	
}
