package ejercicio2;

public class ProductoRefrigerado extends Producto{
	
	private int codORGSupAlimentaria;
	
	ProductoRefrigerado(){
		super();
	}
	
	ProductoRefrigerado(String fCaducidad,int nLote,int codProdRef){
		super(fCaducidad,nLote);
		this.codORGSupAlimentaria = codProdRef;
	}

	public int getCodORGSupAlimentaria() {
		return codORGSupAlimentaria;
	}

	public void setCodORGSupAlimentaria(int codORGSupAlimentaria) {
		this.codORGSupAlimentaria = codORGSupAlimentaria;
	}

	@Override
	public String toString() {
		return super.toString()+"ProductoRefrigerado [codORGSupAlimentaria=" + codORGSupAlimentaria + "]";
	}

}
