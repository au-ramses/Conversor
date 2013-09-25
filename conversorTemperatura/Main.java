package conversorTemperatura;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		InputStreamReader leitorEntrada = new InputStreamReader(System.in);
		BufferedReader leitor = new BufferedReader(leitorEntrada);
		
		System.out.println("Digite qual conversão deseja :");
		System.out.println("1- Celsius para Fahrenheit");
		System.out.println("2- Fahrenheit para Celsius");
		System.out.println("3- Celsius para Kelvin");
		System.out.println("4- Kelvin para Celsius");
		System.out.println("5- Fahrenheit para Kelvin");
		System.out.println("6- Kelvin para Fahrenheit");
		
		//Lendo a opção digitada pelo usuário
		int opcaoLidaUsuario = Integer.parseInt(leitor.readLine());
		
		//Pedindo valor para ser convertido do usuário
		System.out.println("Digite o valor que deseja converter: ");
		
		//lendo o valor digitado para conversão
		double valorLidoUsuario = Double.parseDouble(leitor.readLine());
		
		//criando o conversor
		ConversorTemperatura converterValor = new ConversorTemperatura();
		
		double resultadoConversao = 0;
		
		switch (opcaoLidaUsuario){
			case 1:
				resultadoConversao = converterValor.celsiusParaFahrenheit(valorLidoUsuario);
				break;
			case 2:
				resultadoConversao = converterValor.fahrenheitParaCelsius(valorLidoUsuario);
				break;
			case 3:
				resultadoConversao = converterValor.celsiusParaKelvin(valorLidoUsuario);
				break;
			case 4:
				resultadoConversao = converterValor.KelvinParaCelsius(valorLidoUsuario);
				break;
			case 5:
				resultadoConversao = converterValor.fahrenheitParaKelvin(valorLidoUsuario);
				break;
			case 6:
				resultadoConversao = converterValor.KelvinParaFahrenheit(valorLidoUsuario);
				break;
			default:
				System.out.println ("Erro, opção inválida");
		}
		
		System.out.println("O valor da conversão é: " + resultadoConversao);
		
	
	}

}
