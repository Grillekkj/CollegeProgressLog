package lista03_1;

import util.Teclado;

// Fazer um programa que calcule e apresente a quantidade de litros que um automóvel gastará em uma viagem. O 
//programa deve coletar as seguintes informações: Distância a percorrer na viagem, em quilômetros; qual é o 
//valor do consumo médio do automóvel, em quilômetros por litro.

public class Questao08 {

	public static void main(String[] args) {
		double distKm, valMedCons, litro;
		distKm = Teclado.lerDouble("Digite a distância a percorrer na sua viagem.");
		valMedCons = Teclado.lerDouble("Digite o valor médio de consumo em km/L.");
		litro = distKm / valMedCons;
		System.out.println("Você consumirá " + litro + " litros de gasolina na sua viagem.");
	}

}
