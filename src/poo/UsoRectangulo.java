package poo;

import java.util.Scanner;

public class UsoRectangulo {

	public static void main(String[] args) {
		
		Rectangulo r1 = new Rectangulo();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca la base de su rectangulo");
		double entradaBase = sc.nextDouble();
		System.out.println("Introduzca la altura de su rectangulo");
		double entradaAltura = sc.nextDouble();
		r1.setBase(entradaBase);
		r1.setAltura(entradaAltura);
		System.out.println("Base: " + r1.getBase() + " // " + "Altura: " + r1.getAltura());
		r1.mostrarDatos();
		

	}

}
