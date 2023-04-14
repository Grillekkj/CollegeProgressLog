package lista03_2;

import util.Teclado;

//Desenvolver um programa que pergunte o valor da conta a ser paga no restaurante e exiba como resposta o 
//valor com o acréscimo dos 10% da gorjeta do garçom.

public class Questao01 {

	public static void main(String[] args) {
		double valConta, valTotal;
		valConta = Teclado.lerDouble("Digite o valor da conta.");
		valTotal = valConta + (valConta * 10 / 100);
		System.out.println("O total da sua conta ficará em R$" + valTotal + ".");
	}

}
