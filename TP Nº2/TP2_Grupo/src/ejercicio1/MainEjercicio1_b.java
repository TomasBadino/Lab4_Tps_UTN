package ejercicio1;

import java.util.Iterator;
import java.util.TreeSet;

public class MainEjercicio1_b {

	public static void main(String[] args) {

		TreeSet<Profesor> profesores = new TreeSet<Profesor>();

		profesores.add(new Profesor("P1", 1, "Manuel", 25));
		profesores.add(new Profesor("P2", 2, "Jorge", 30));
		profesores.add(new Profesor("P3", 5, "Rogelio", 37));
		profesores.add(new Profesor("Lab1", 2, "Michael", 24));
		profesores.add(new Profesor("Lab2", 4, "Ross", 40));

		Iterator<Profesor> it = profesores.iterator();

		while (it.hasNext()) {
			Profesor p = (Profesor) it.next();
			System.out.println(p.toString());
		}

	}
}