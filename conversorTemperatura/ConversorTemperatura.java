package conversorTemperatura;

public class ConversorTemperatura {
	public double celsiusParaFahrenheit(double valorCelsius){
        return 9 * valorCelsius / 5 + 32;
    }
    
    public double fahrenheitParaCelsius(Double valorFahrenheit){
        return 5 * (valorFahrenheit - 32) / 9;
    }
    
    public double celsiusParaKelvin(Double valorCelsius){
        return valorCelsius + 273;
    }
    
    public double KelvinParaCelsius(Double valorKelvin){
        return valorKelvin - 273;
    }
    
    public double fahrenheitParaKelvin(Double valorFahrenheit){
        return (( valorFahrenheit - 32 ) / 1.8 ) + 273;
    }
    
    public double KelvinParaFahrenheit(Double valorKelvin){
        return ((valorKelvin - 273)* 1.8 ) + 32;
    }

	 
}
