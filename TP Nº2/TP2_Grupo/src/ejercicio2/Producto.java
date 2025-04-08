package ejercicio2;

public class Producto {

	private String fechaCaducidad;
	private int numLote;
	
	Producto(){
		
	}
	
	Producto(String fCaducidad,int nLote){
		
		this.numLote = nLote;
		this.fechaCaducidad = fCaducidad;
		
	}

	public String getFechaCaducidad() {
		return fechaCaducidad;
	}

	public void setFechaCaducidad(String fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}

	public int getNumLote() {
		return numLote;
	}

	public void setNumLote(int numLote) {
		this.numLote = numLote;
	}

	@Override
	public String toString() {
		return "Producto [fechaCaducidad=" + fechaCaducidad + ", numLote=" + numLote + "]";
	}
	
	
}
