package lista04_1;

import util.Teclado;

//Desenvolver um programa que pergunte um valor inteiro positivo ou negativo, e exiba como resposta o módulo 
//deste valor, ou seja, o número lido como sendo positivo.

public class Questao07 {

	public static void main(String[] args) {
		int num1;
		num1 = Teclado.lerInt("Digite seu número.");
		if (num1 < 0) {
			System.out.println("O módulo do seu número é " + (num1 * -1) + ".");
		} else {
			System.out.println("O módulo do seu número é " + num1 + ".");
		}
	}

}
