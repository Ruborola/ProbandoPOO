package poo;

public class BaseCoche {

	private int ruedas;
	private int largoPlataforma;
	private int anchoPlataforma;
	private int motor;
	private int pesoPlataforma;
	private int pesoTotal;
	private boolean asientosCuero, climatizador;
	private int pesoCarroceria;
	String color;
	


	public BaseCoche() {
		ruedas=4;
		largoPlataforma=3000;
		anchoPlataforma=2;
		motor= 126;
		pesoPlataforma= 700;
		pesoCarroceria = 300;
	}



	public int getRuedas() {
		return ruedas;
	}



	public void setRuedas(int ruedas) {
		this.ruedas = ruedas;
	}



	public int getLargoPlataforma() {
		return largoPlataforma;
	}



	public void setLargoPlataforma(int largoPlataforma) {
		this.largoPlataforma = largoPlataforma;
	}



	public int getAnchoPlataforma() {
		return anchoPlataforma;
	}



	public void setAnchoPlataforma(int anchoPlataforma) {
		this.anchoPlataforma = anchoPlataforma;
	}



	public int getMotor() {
		return motor;
	}



	public void setMotor(int motor) {
		this.motor = motor;
	}



	public int getPesoPlataforma() {
		return pesoPlataforma;
	}



	public void setPesoPlataforma(int pesoPlataforma) {
		this.pesoPlataforma = pesoPlataforma;
	}



	public int getPesoTotal() {
		return pesoTotal;
	}



	public void setPesoTotal(int pesoTotal) {
		this.pesoTotal = pesoTotal;
	}
	
	public void setPesoCarroceria() {
		this.pesoCarroceria = pesoCarroceria;
	}
	
	public int getPesoCarroceria() {
		return pesoCarroceria;
	}



	public String getAsientosCuero() {
		
		if (asientosCuero) {
			return "El coche tiene asientos de cuero";
		} else {
			return "El coche tiene asientos de serie";
		}
		
	}



	public void setAsientosCuero(String asientosCuero) {
		
		if (asientosCuero.equalsIgnoreCase("si")){
			this.asientosCuero = true;
		} else {
			this.asientosCuero = false;
		}
		
		
	}



	public String getClimatizador() {
		
		if (climatizador) {
			return "El coche tiene climatizador";
		} else {
		return "El coche no tiene climatizador de serie";
		}
	}



	public void setClimatizador(String climatizador) {
		
		
		if (climatizador.equalsIgnoreCase("si")) {
			this.climatizador = true;
		} else {
			this.climatizador = false;
		}
		
	}


	public void setColor(String color) {
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}
	
	public String dimeDatosGenerales() {
		
		return "La plataforma del vehículo tiene " + ruedas + " ruedas. " + "Mide " + largoPlataforma / 1000 + " metros de largo. " + "Mide " + anchoPlataforma + ""
				+ " centimetros de ancho y un peso de plataforma de " + pesoPlataforma + " kgs"; 
	}
	
	public String getSetPesoTotal() {
		
		int pesoTotal = pesoCarroceria + pesoPlataforma;
		
		if (asientosCuero) {
			pesoTotal = pesoTotal + 50;
		} 

		if (climatizador) {
			pesoTotal = pesoTotal + 20;
		}
		
		return "El peso total del vehiculo es " + pesoTotal + " Kgs." ;
	}
	
	public int getPrecioTotal() {
		
		int precioTotal = 10000;
		
		if (asientosCuero) {
			precioTotal+=2000;
		}
		
		if (climatizador) {
			precioTotal+=1500;
		}
		
		return precioTotal;
		
	}
	




	
	
}
