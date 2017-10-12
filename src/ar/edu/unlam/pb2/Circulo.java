package ar.edu.unlam.pb2;

public class Circulo extends Figura{ //subclase circulo

	private Double radio; //atributo propio
	
	public Circulo(){ //constructor
		
		this.setRadio(new Double (0.00));
	}

	//setter y getter de radio
	public Double getRadio() {
		return radio;
	}

	public void setRadio(Double radio) {
		this.radio = radio;
	}

	//metodos abstractos
	
	@Override
	public Double calcularElArea() {
		Double area;
		area = (this.radio * this.radio * Math.PI);
			return area;
	}

	@Override
	public Double calcularElPerimetro() {
		Double longitud;
		longitud = (2 * this.radio * Math.PI);
			return longitud;
	}

	@Override
	public void dibujarFigura() {
		System.out.println("Se dibuja un circulo con un area de "+ calcularElArea() + " y un perimetro de " + calcularElPerimetro());
		
	}
	
	
}
