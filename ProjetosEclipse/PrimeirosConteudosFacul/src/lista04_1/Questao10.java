package lista04_1;

import util.Teclado;

//Desenvolver um programa que pergunte dois números inteiros, e apresente como resultado se o segundo 
//número informado é ou não um divisor do primeiro número informado.


public class Questao10 {

	public static void main(String[] args) {
		int num1, num2;
		num1 = Teclado.lerInt("Digite seu primeiro número.");
		num2 = Teclado.lerInt("Digite seu segundo número.");
		if (num1 % num2 == 0) {
			System.out.println("O segundo número é divisor do primeiro.");
		} else {
			System.out.println("O segundo número não é divisor do primeiro.");
		}
	}

}
