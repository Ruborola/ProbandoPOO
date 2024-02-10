package poo;

public class UsoCoche {

	public static void main(String[] args) {

		BaseCoche renault = new BaseCoche(); // INSTANCIAR UNA CLASE (el primer Coche es nuestra clase, y el segundo es el constructor) 
		renault.setColor("Amarillo");
		renault.setAsientosCuero("si");
		renault.setClimatizador("si");
		System.out.println("El renault es de color " + renault.getColor());
		System.out.println(renault.dimeDatosGenerales());
		System.out.println(renault.getAsientosCuero());
		System.out.println(renault.getClimatizador());
		System.out.println(renault.getSetPesoTotal());
		System.out.println("El precio del coche es " + renault.getPrecioTotal() + "€");
		System.out.println("GUILLAMON TUS MUERTOS");
	}
	
	
	
}


