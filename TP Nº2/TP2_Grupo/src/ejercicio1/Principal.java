package ejercicio1;

public class Principal {

	public static void main(String[] args) {
		
		Profesor profe1 = new Profesor("P1",1,"Manuel",25);
		Profesor profe2 = new Profesor("P1",1,"Manuel",25);
		
		
		if (profe1.equals(profe2)) {
			System.out.println("Es el mismo profesor");
		}else {
			System.out.println("No es el mismo profesor");
		}
		
		
	}

}
