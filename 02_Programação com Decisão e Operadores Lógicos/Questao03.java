package lista04_1;

import util.Teclado;

//Desenvolver um programa que pergunte um número, e apresente como resposta se o referido número é par ou é ímpar.

public class Questao03 {

	public static void main(String[] args) {
		double num1;
		num1 = Teclado.lerDouble("Digite um número.");
		if (num1 % 2 == 0) {
			System.out.println("Seu número é par.");
		} else {
			System.out.println("Seu número é ímpar.");
		}
	}

}
