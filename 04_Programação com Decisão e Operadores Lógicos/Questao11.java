package lista04_1;

import util.Teclado;

//Desenvolver um programa que pergunte um número de 3 casas e apresente como resultado somente o algarismo das centenas.

public class Questao11 {

	public static void main(String[] args) {
		int num1;
		num1 = Teclado.lerInt("Digite um número de 3 casas.");
		if (num1 < 100 || num1 > 999) {
			System.out.println("Seu número não tem 3 casas.");
		} else {
			System.out.println("O algarismo das centanas do seu número é " + (num1 / 100) + ".");
		}
	}

}
