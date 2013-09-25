package tests;


import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import conversorTemperatura.ConversorTemperatura;


public class ConversorTemperaturaTest {
	
	ConversorTemperatura novoConversor;
	
	@Before
	public void setUp() throws Exception{
		novoConversor = new ConversorTemperatura();
	}
	
	@Test
	public void celsiusParaFahrenheitDoubleTest() {
		assertEquals(80.6, novoConversor.celsiusParaFahrenheit(27.00),0.1);	
	}
	
	@Test
	public void fahrenheitParaCelsiusDoubleTest(){
		assertEquals(11.1, novoConversor.fahrenheitParaCelsius(52.0),0.1);
	}
	
	@Test
	public void celsiusParaKelvinDoubleTest(){
		assertEquals(344.1, novoConversor.celsiusParaKelvin(71.1),0.1);
	}

	@Test
	public void KelvinParaCelsiusDoubleTest(){
		assertEquals(48.5, novoConversor.KelvinParaCelsius(321.5),0.1);
	}
	
	@Test
	public void fahrenheitParaKelvinDoubleTest(){
		assertEquals(286.0, novoConversor.fahrenheitParaKelvin(55.5),0.1);
	}
	
	@Test
	public void KelvinParaFahrenheitDoubleTest(){
		assertEquals(182.12, novoConversor.KelvinParaFahrenheit(356.4),0.1);
	}
}
