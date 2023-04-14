package lista04_1;

import util.Teclado;

//Desenvolver um programa que pergunte dois valores numéricos inteiros e apresente o valor da diferença entre o 
//maior valor e o menor valor lido.

public class Questao06 {

	public static void main(String[] args) {
		int num1, num2;
		num1 = Teclado.lerInt("Digite seu primeiro número.");
		num2 = Teclado.lerInt("Digite seu segundo número.");
		if (num1 >= num2) {
			System.out.println("A diferença entre o maior valor e o menor valor é " + (num1 - num2) + ".");
		} else {
			System.out.println("A diferença entre o maior valor e o menor valor é " + (num2 - num1) + ".");
		}
	}

}
