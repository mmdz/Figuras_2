package ar.edu.unlam.pb2;

public class Rectangulo extends Figura{ //subclase rectangulo

	private Double ladoA;  //atributos propios
	private Double ladoB;
	
	public Rectangulo(Double ladoA, Double ladoB){ //constructor con parametros
		this.ladoA = ladoA;
		this.ladoB = ladoB;
	}

	//getter y setter de base y altura, PROPIOS DE CLASE RECTANGULO, NO LOS PUEDE USAR PADRE
	public Double getBase(){
		return ladoA;
	}
	
	public void setBase(Double base){
		this.ladoA = base;
	}
	
	public Double getAltura(){
		return ladoB;
	}
	
	public void setAltura(Double altura){
		this.ladoB = altura;
	}

	//metodos abstractos obligatorios 
	
	@Override
	public Double calcularElArea() {
		return (this.ladoA * this.ladoB);
	}

	@Override
	public Double calcularElPerimetro() {
		return (this.ladoA *2 )+ (this.ladoB * 2);	
	}

	@Override
	public void dibujarFigura(){
		System.out.println("Se dibuja un rectangulo con un area de "+ calcularElArea() + " y un perimetro de " + calcularElPerimetro());
	}
	

}
