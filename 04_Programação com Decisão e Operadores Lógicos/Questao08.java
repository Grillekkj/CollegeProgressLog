package lista04_1;

import util.Teclado;

//Desenvolver um programa que pergunte um número inteiro qualquer e verifique se ele está na faixa de 1 a 10.

public class Questao08 {

	public static void main(String[] args) {
		int num1;
		num1 = Teclado.lerInt("Digite seu número.");
		if (num1 < 1 || num1 > 10) {
			System.out.println("Seu número não está na faixa de 1 a 10.");
		} else {
			System.out.println("Seu número está na faixa de 1 a 10.");
		}
	}

}
