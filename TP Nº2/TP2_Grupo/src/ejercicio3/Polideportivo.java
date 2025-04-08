package ejercicio3;

public class Polideportivo extends Edificio implements IInstalacionDeportiva{
	
	private int tipoInstalacion;
	
	Polideportivo(){
		super();
	}
	
	Polideportivo(double supEdi,int tipoInstalacion){
		super(supEdi);
		this.tipoInstalacion = tipoInstalacion;
	}

	@Override
	public String toString() {
		return super.toString()+" y es una instalacion deportiva de tipo: "
				+getTipoInstalacion()+".";
		
	}

	@Override
	public int getTipoInstalacion() {
		return tipoInstalacion;
	}

}
