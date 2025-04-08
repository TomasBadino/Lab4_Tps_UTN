package ejercicio2;

public class ProductoFresco extends Producto{
	
	private String fechaEnvasado;
	private String paisOG;
	
	ProductoFresco(){
		super();
	}
	
	ProductoFresco(String fCaducidad,int nLote,String fEnvasado, String paisOG){
		super(fCaducidad,nLote);
		this.fechaEnvasado = fEnvasado;
		this.paisOG = paisOG;
	}

	public String getFechaEnvasado() {
		return fechaEnvasado;
	}

	public void setFechaEnvasado(String fechaEnvasado) {
		this.fechaEnvasado = fechaEnvasado;
	}

	public String getPaisOG() {
		return paisOG;
	}

	public void setPaisOG(String paisOG) {
		this.paisOG = paisOG;
	}

	@Override
	public String toString() {
		return super.toString()+"ProductoFresco [fechaEnvasado=" + fechaEnvasado + ", paisOG=" + paisOG + "]";
	}

}
