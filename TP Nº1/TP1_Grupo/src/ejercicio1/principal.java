package ejercicio1;

public class principal {

	public static void main(String[] args) {
		
		Empleado[] aEmpleados = new Empleado [5];
		aEmpleados[0] = new Empleado ();
		aEmpleados[1] = new Empleado ("Manuel",25);
		aEmpleados[2] = new Empleado ("Carlos",30);
		aEmpleados[3] = new Empleado ();
		aEmpleados[4] = new Empleado ("Samuel",40);
		
		for (Empleado empleado : aEmpleados) {
			System.out.println(empleado.toString());
		}
		
		System.out.println("\nEl proximo ID sera el "+Empleado.devuelveProximoID());
	}

}
