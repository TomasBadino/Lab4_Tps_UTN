package ejercicio1;

import java.util.ArrayList;
import java.util.ListIterator;

public class MainEjercicio1_a {

	public static void main(String[] args) {

		ArrayList<Profesor> profesores = new ArrayList<Profesor>(5);

		profesores.add(new Profesor("P1", 1, "Manuel", 25));
		profesores.add(new Profesor("P2", 2, "Jorge", 30));
		profesores.add(new Profesor("P3", 5, "Rogelio", 37));
		profesores.add(new Profesor("Lab1", 2, "Michael", 24));
		profesores.add(new Profesor("Lab2", 4, "Ross", 40));

		ListIterator<Profesor> it = profesores.listIterator();

		while (it.hasNext()) {
			Profesor p = (Profesor) it.next();
			System.out.println(p.toString());
		}
	}

}