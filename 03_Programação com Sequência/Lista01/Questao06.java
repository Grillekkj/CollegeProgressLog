package lista03_1;

import util.Teclado;

//Fazer um programa que pergunte uma temperatura ao usuário, em graus Fahrenheit, e apresente esta 
//temperatura convertida em graus Celsius. A fórmula da conversão é c	=	(f	–	32)	x	5	:	9	, onde c	 é a temperatura 
//em graus Celsius e f em Fahrenheit.

public class Questao06 {

	public static void main(String[] args) {
		double c, f;
		f = Teclado.lerDouble("Digite uma temperatura em Fahrenheit.");
		c = (f - 32) * 5 / 9;
		System.out.println("A temperatura que você digitou em graus celsius ficará " + c + ".");
	}

}
