package lista03_3;

import util.Teclado;

//Desenvolver um programa que calcule o salário líquido de um professor. Para elaborar o programa, é necessário 
//possuir alguns dados, tais como: Valor da hora aula, número de horas trabalhadas no mês e percentual de 
//desconto do INSS.

public class Questao02 {

	public static void main(String[] args) {
		double valorHora, horasTrabalhadas, inssPercen, valorLiquido;
		valorHora = Teclado.lerDouble("Digite o valor da hora trabalhada.");
		horasTrabalhadas = Teclado.lerDouble("Digite quantas horas você trabalhou nesse mês.");
		inssPercen = Teclado.lerDouble("Digite o percentual de desconto do INSS.");
		valorLiquido = valorHora * horasTrabalhadas - ((valorHora * horasTrabalhadas) * inssPercen / 100);
		System.out.println("O seu salário líquido é R$" + valorLiquido + ".");
	}

}
