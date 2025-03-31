package ejercicio1;

public class Empleado {
	private static int nextId = 1000;
	
	private final int id;
	private String nombre;
	private int edad;
	
	//Constructores
	
	Empleado(){
		this.id = nextId;
		this.nombre = "Sin nombre";
		this.edad = 99;
		nextId++;
	}
	
	Empleado(String nombre,int edad){
		this.id = nextId;
		this.nombre = nombre;
		this.edad = edad;
		nextId++;
	}
	
	//Metodos
	
	static int devuelveProximoID() {
		return nextId;
	}

	//ToString
	@Override
	public String toString() {
		return "Empleado: "+nombre+", Edad: "+edad+", Legajo: "+id;
	}
	
}
