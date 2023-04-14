package lista04_1;

import util.Teclado;

//Desenvolver um programa que pergunte um número e exiba a informação de que ele é positivo, negativo ou nulo.

public class Questao09 {

	public static void main(String[] args) {
		int num1;
		num1 = Teclado.lerInt("Digite seu número.");
		if (num1 < 0) {
			System.out.println("Seu número é negativo.");
		} else {
			if (num1 > 0) {
				System.out.println("Seu número é positivo.");
			} else {
				System.out.println("Seu número é nulo.");
			}
		}
	}

}
