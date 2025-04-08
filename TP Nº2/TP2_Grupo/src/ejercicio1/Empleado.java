package ejercicio1;

import java.util.Objects;

public class Empleado implements Comparable<Empleado>{
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

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getId() {
		return id;
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(edad, id, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empleado other = (Empleado) obj;
		return edad == other.edad && Objects.equals(nombre, other.nombre);
	}

	//ToString
	@Override
	public String toString() {
		return "Empleado: "+nombre+", Edad: "+edad+", Legajo: "+id;
	}

	@Override
	public int compareTo(Empleado o) {
		
		if (o.id<this.id) {
			return 1;
		}else {
			return -1;
		}
	}
	
}
