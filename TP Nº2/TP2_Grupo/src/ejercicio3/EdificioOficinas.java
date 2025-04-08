package ejercicio3;

public class EdificioOficinas extends Edificio{

	private int cantOfis;
	
	EdificioOficinas(){
		super();
	}
	
	EdificioOficinas(double supEdi,int cantOfis){
		super(supEdi);
		this.cantOfis = cantOfis;
	}
	
	public int getCantOfis() {
		return cantOfis;
	}

	public void setCantOfis(int cantOfis) {
		this.cantOfis = cantOfis;
	}

	@Override
	public String toString() {
		return super.toString()+" y es de oficinas, tiene "+cantOfis+" oficinas.";
	}
	
}
