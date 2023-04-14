package lista04_1;

import util.Teclado;

//Desenvolver um programa que pergunte 3 valores (variáveis a, b e c) e ao final apresente-os dispostos em ordem crescente.

public class Questao13 {

	public static void main(String[] args) {
		double num1, num2, num3, aux;
		num1 = Teclado.lerInt("Digite seu primeiro número.");
		num2 = Teclado.lerInt("Digite seu segundo número.");
		num3 = Teclado.lerInt("Digite seu terceiro número.");
		if (num1 > num2 ) {
			aux = num1;
			num1 = num2;
			num2 = aux;
		}
		if (num1 > num3) {
			aux = num1;
			num1 = num3;
			num3 = aux;
		}
		if (num2 > num3) {
			aux = num2;
			num2 = num3;
			num3 = aux;
		}
		System.out.println("Seu primeiro número é " + num1 + ".");
		System.out.println("Seu segundo número é " + num2 + ".");
		System.out.println("Seu terceiro número é " + num3 + ".");
	}

}
