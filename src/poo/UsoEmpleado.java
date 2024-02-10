package poo;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class UsoEmpleado {

	public static void main(String[] args) {
		/*Scanner sc = new Scanner(System.in);
		Empleado e1 = new Empleado("Ruben Rodriguez", 85000, 1990, 12, 17);
		Empleado e2 = new Empleado("Javiera Gomez", 95000, 1995, 06, 02);
		Empleado e3= new Empleado("Magdalena Martin", 105000, 2002, 03, 15);
		e1.subeSueldo(5);
		e2.subeSueldo(5);
		e3.subeSueldo(5);
		
		System.out.println("Nombre: " + e1.getNombre() + ", Sueldo: " + e1.getSueldo()
		+ ", Fecha de alta: " + e1.getAltaContrato());
		
		System.out.println("Nombre: " + e2.getNombre() + ", Sueldo: " + e2.getSueldo()
		+ ", Fecha de alta: " + e2.getAltaContrato());
		
		System.out.println("Nombre: " + e3.getNombre() + ", Sueldo: " + e3.getSueldo()
		+ ", Fecha de alta: " + e3.getAltaContrato());*/
		
		Empleado[] misEmpleados = new Empleado[3];
		
		misEmpleados[0] = new Empleado("Paco Gomez", 85000, 1990, 12, 17);
		misEmpleados[1] = new Empleado("Javier Perez", 95000, 1995, 6, 15);
		misEmpleados[2] = new Empleado("Pepito Piscinas", 105000, 2002, 3, 3);
		
		/*for (int i = 0; i < misEmpleados.length; i++) {
		misEmpleados[i].subeSueldo(5);
		}*/
		
		for (Empleado e: misEmpleados) {
			e.subeSueldo(5);
		}
		
		for (Empleado e: misEmpleados) {
			System.out.println("Nombre: " + e.getNombre() + " Sueldo nuevo: " + e.getSueldo()
					+ " Fecha de alta: " + e.getAltaContrato());
		}
		
		/*for (int i = 0; i < misEmpleados.length; i++) {
			
			System.out.println("Nombre: " + misEmpleados[i].getNombre() + " Sueldo nuevo: " + misEmpleados[i].getSueldo()
					+ " Fecha de alta: " + misEmpleados[i].getAltaContrato());
		}*/
	}
}

	 class Empleado {
		 
		 public Empleado() {
			 
		 }
		 
		 public Empleado(String nombre, double sueldo, int anio, int mes, int dia) {
			 
			 this.nombre = nombre;
			 this.sueldo = sueldo;
			 GregorianCalendar calendario = new GregorianCalendar(anio,mes-1,dia);
			 altaContrato = calendario.getTime();
			 
		 }
		 
		 private String nombre;
		 private double sueldo;
		 private Date altaContrato;
		 
		 public String getNombre() {
			 
			return nombre;
		 }
		 
		 
		 public double getSueldo() {
			 return sueldo;
		 }
		 
		 public Date getAltaContrato() {
			 
			 return altaContrato;
		 }
		 
		 public void subeSueldo(double porcentaje) { //setter
			 double aumento = sueldo*porcentaje/100;
			 
			 sueldo += aumento;	
		 }		
	}
