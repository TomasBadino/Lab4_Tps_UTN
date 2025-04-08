package ejercicio3;

import java.util.ArrayList;
import java.util.ListIterator;

public class MainEjercicio3 {

	public static void main(String[] args) {
		
		ArrayList<Edificio> edificios  = new ArrayList<Edificio>(5);
		
		edificios.add(new Polideportivo(1.2,1));
		edificios.add(new Polideportivo(2.3,1));
		edificios.add(new Polideportivo(3.4,0));
		edificios.add(new EdificioOficinas(3.3,5));
		edificios.add(new EdificioOficinas(4.1,7));
		
		ListIterator<Edificio> it = edificios.listIterator();
		
		while (it.hasNext()) {
			Edificio e = (Edificio) it.next();
			System.out.println(e.toString());
		}

	}

}
