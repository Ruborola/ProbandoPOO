package poo;

public class Rectangulo {

	private double base;
	private double altura;
	
	public Rectangulo() {
		
	}
	
	public Rectangulo(double base, double altura) {
		
	}
	
	
	public void setBase(double base) {
		this.base = base;
	}
	
	public double getBase(){
		return base;
	}
	
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public double getAltura() {
		return altura;
	}
	
	public double calcularArea() {
		
		double resultadoArea = base * altura;
		return resultadoArea;
	}
	
	public double calcularPerimetro() {
		
		
		double resultadoPerimetro = (2*base + 2*altura);
		return resultadoPerimetro;
		}
	
	public void mostrarDatos() {
		System.out.println("La base de su rectangulo es: " + base);
		System.out.println("La altura de su rectangulo es: " + altura);
		System.out.println("El area de su rectangulo es: " + calcularArea());
		System.out.println("El perimetro de su rectangulo es: " + calcularPerimetro());
		/* Preguntarle a JM que es lo que tengo que introducir por parametros en esta funcion, ya que
		 * si no pongo ninguno, no existe resArea ni resPerimetro dentro de esta funcion.
		 */
		
	}
	
}
