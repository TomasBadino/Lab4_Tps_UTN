package ejercicio2;

public class mainEjercicio2 {

	public static void main(String[] args) {
		
		Producto prodF = new ProductoFresco("1/1/90",12,"5/5/96","Arg");
		Producto prodR = new ProductoRefrigerado("2/2/90",21,1523);
		Producto prodC = new ProductoCongelado("3/3/90",33,"-10º");
		
		System.out.println(prodF);
		System.out.println(prodR);
		System.out.println(prodC);
		
	}

}
