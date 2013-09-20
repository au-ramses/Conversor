package tests;


import static org.junit.Assert.*;

import org.junit.Test;

import conversorTemperatura.ConversorTemperatura;


public class ConversorTemperaturaTest {
	
	ConversorTemperatura novoConversor = new ConversorTemperatura();
	@Test
	
	public void celsiusParaFahrenheitIntTest(){
		assertEquals(104, novoConversor.celsiusParaFahrenheit());
	}
	
	public void celsiusParaFahrenheitDoubleTest() {
		assertEquals(80.6, novoConversor.celsiusParaFahrenheit(27.00),0.1);	
	}
	
	public void fahrenheitParaCelsiusDoubleTest(){
		assertEquals(11.1, novoConversor.fahrenheitParaCelsius(52.0),0.1);
	}
	
	public void celsiusParaKelvinDoubleTest(){
		assertEquals(71.1, novoConversor.celsiusParaKelvin(344.1),0.1);
	}

	public void KelvinParaCelsiusDoubleTest(){
		assertEquals(48.5, novoConversor.KelvinParaCelsius(321.5),0.1);
	}
	
	public void fahrenheitParaKelvinDoubleTest(){
		assertEquals(255.9, novoConversor.fahrenheitParaKelvin(22.5),0.1);
	}
	
	public void KelvinParaFahrenheitDoubleTest(){
		assertEquals(182.12, novoConversor.KelvinParaFahrenheit(356.4),0.1);
	}
}
