package lista04_1;

import util.Teclado;

//Desenvolver um programa que pergunte um número. Se este número for maior que 20, então ele deverá exibir a 
//metade deste número, senão, ele deverá exibir o número sem alterações.

public class Questao01 {

	public static void main(String[] args) {
		double num1;
		num1 = Teclado.lerDouble("Digite seu número.");
		if (num1 > 20) {
			System.out.println("Seu número é maior que 20 e a metade dele é " + num1 / 2 + ".");
		} else {
			System.out.println("Seu número é menor que 20, seu número é " + num1 + ".");
		}
	}

}
