package ejercicio3;

public class Edificio {

	private double superficieEdifio;

	Edificio() {
		this.superficieEdifio = -1;
	}

	Edificio(double supEdi) {
		this.superficieEdifio = supEdi;
	}

	public double getSuperficieEdifio() {
		return superficieEdifio;
	}

	public void setSuperficieEdifio(double superficieEdifio) {
		this.superficieEdifio = superficieEdifio;
	}

	@Override
	public String toString() {
		return "El edificio tiene una superficie de: "+superficieEdifio+"m^2";
	}
	
}
