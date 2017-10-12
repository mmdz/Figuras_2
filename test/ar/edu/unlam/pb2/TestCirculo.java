package ar.edu.unlam.pb2;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCirculo {

	@Test
	public void testQueCreaUnCirculo() {
		Circulo micirculo = new Circulo(); //sin parametros
		micirculo.setRadio(2.0);
		
		micirculo.dibujarFigura();
	}
	
	@Test
	public void testQueCalculaAreaDeUnCirculo(){
		Circulo miCirculo = new Circulo();
		miCirculo.setRadio(3.0);		
		Double area = miCirculo.calcularElArea();
		
		miCirculo.dibujarFigura();
		
		assertTrue(area.equals(28.274333882308138));
	}

	@Test 
	public void testQueCalculaPerimetroDeUnCirculo(){
		Circulo miCirculo = new Circulo();
		miCirculo.setRadio(4.0);
		Double perimetro = miCirculo.calcularElPerimetro();
		
		miCirculo.dibujarFigura();
		
		assertTrue(perimetro.equals(25.132741228718345));
	}
	
	
}


