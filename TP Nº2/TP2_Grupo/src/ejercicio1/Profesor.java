package ejercicio1;

import java.util.Objects;

public class Profesor extends Empleado {

	private String cargo;
	private int antiguedadDocente;
	
	Profesor(){
		super();
	}
	
	Profesor(String cargo,int antiguedadDocente,String nombre, int edad){
		super(nombre,edad);
		this.cargo = cargo;
		this.antiguedadDocente = antiguedadDocente;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public int getAntiguedadDocente() {
		return antiguedadDocente;
	}

	public void setAntiguedadDocente(int antiguedadDocente) {
		this.antiguedadDocente = antiguedadDocente;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(antiguedadDocente, cargo);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Profesor other = (Profesor) obj;
		return antiguedadDocente == other.antiguedadDocente && Objects.equals(cargo, other.cargo);
	}

	@Override
	public String toString() {
		return super.toString()+", Cargo: "+
				cargo+", Antiguedad: "+antiguedadDocente+".";
	}
	
}
