package lista03_1;

import util.Teclado;

//Fazer um algoritmo que efetue o cálculo do valor de uma prestação em atraso, utilizando a fórmula prestação	=	
//valor	+	(valor	x	(taxa	:	100)	x	tempo	em	dias)

public class Questao10 {

	public static void main(String[] args) {
		double prest, valor, taxa, tempDia;
		valor = Teclado.lerDouble("Digite o valor do produto/serviço.");
		taxa = Teclado.lerDouble("Digite o valor da taxa do produto/serviço.");
		tempDia = Teclado.lerDouble("Digite o tempo em dias.");
		prest = valor + (valor * (taxa / 100) * tempDia);
		System.out.println("O valor da prestação ficará custando R$" + prest + ".");
	}

}
