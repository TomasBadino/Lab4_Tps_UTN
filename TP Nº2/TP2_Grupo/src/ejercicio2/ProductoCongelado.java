package ejercicio2;

public class ProductoCongelado extends Producto {
	
	private String tempCongRcmnd;
	
	ProductoCongelado(){
		super();
	}
	
	ProductoCongelado(String fCaducidad,int nLote,String tmpCR){
		super(fCaducidad,nLote);
		this.tempCongRcmnd = tmpCR;
	}

	public String getTempCongRcmnd() {
		return tempCongRcmnd;
	}

	public void setTempCongRcmnd(String tempCongRcmnd) {
		this.tempCongRcmnd = tempCongRcmnd;
	}

	@Override
	public String toString() {
		return super.toString()+"ProductoCongelado [tempCongRcmnd=" + tempCongRcmnd + "]";
	}
	
}
