package poo;

public class Pruebas {

	public static void main(String[] args) {
		
		Empleados e1 = new Empleados("Ruben");
		Empleados e2 = new Empleados("Juan");
		e1.setSeccion("Taller");
		
		System.out.println(e1.devuelveDatos());
		System.out.println(e2.devuelveDatos());
		
		


	}

}

class Empleados {
	
	private final String nombre;
	private String seccion;
	
	public Empleados(String nombre) {
		this.nombre = nombre;
		seccion = "Administracion";
	}
	
	public void setSeccion(String seccion) {
		this.seccion = seccion;
	}
	
	public String devuelveDatos() {
		
		return "Nombre: " + nombre + ", Sección: " + seccion;
	}
	
	
	
	
	
}
