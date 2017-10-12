package ar.edu.unlam.pb2;

public abstract class Figura { //clase abstracta, padre ESTA CLASE NO PUEDE SER INSTANCIADA

	private String color;
	
	//getters y setters
	public String getColor(){
		return color;
	}
	
	public void setColor(String color){
		this.color = color;
	}
	
	//constructor
	public Figura(){
		this.color = "Negro"; 
	}
	
	public Figura(String color){
		this.color=color;
	}
	
	//metodos abstractos
	public abstract Double calcularElArea();
	
	public abstract Double calcularElPerimetro();
	
	public abstract void dibujarFigura();
	
	/*En este caso se implementa solo el POLIMOSRFISMO*/
	
	//otros metodos
	
	/*como es una clase abstracta puede tener metodos comunes y al menos uno abstracto*/
}
