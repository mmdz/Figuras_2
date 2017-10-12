package ar.edu.unlam.pb2;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestRectangulo {

	@Test
	public void testQueCreaRectangulo() {
		Rectangulo miRectangulo = new Rectangulo(2.0,4.0); //con parametros
		miRectangulo.dibujarFigura();		
	}
	
	@Test 
	public void testQueCalculaAreaDeRectangulo(){
		
		Rectangulo miRectangulo = new Rectangulo(3.0, 5.0);
		Double area = miRectangulo.calcularElArea();
		
		miRectangulo.dibujarFigura();
		
		assertTrue(area.equals(15.0));
	}
	
	@Test
	public void testQueCalculaPerimetroDeUnRectangulo(){
		
		Rectangulo miRectangulo = new Rectangulo(7.1, 5.9);
		Double perimetro = miRectangulo.calcularElPerimetro();
		
		miRectangulo.dibujarFigura();
		
		assertTrue(perimetro.equals(26.0));
	}

}
