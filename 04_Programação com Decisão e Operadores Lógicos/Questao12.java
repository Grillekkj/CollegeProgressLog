package lista04_1;

import util.Teclado;

//Desenvolver um programa que pergunte 5 números inteiros e identifique o maior número e o menor número.

public class Questao12 {

	public static void main(String[] args) {
		int num1, num2, num3, num4, num5, maior, menor;
		num1 = Teclado.lerInt("Digite seu primeiro número.");
		num2 = Teclado.lerInt("Digite seu segundo número.");
		num3 = Teclado.lerInt("Digite seu terceiro número.");
		num4 = Teclado.lerInt("Digite seu quarto número.");
		num5 = Teclado.lerInt("Digite seu quinto número.");
		
		maior = num1;
		
		if (num2 > maior) {
			maior = num2;
		}
		if (num3 > maior) {
			maior = num3;
		}
		if (num4 > maior) {
			maior = num4;
		}
		if (num5 > maior) {
			maior = num5;
		}
		
		menor = num1;
		
		if (num2 < menor) {
			menor = num2;
		}
		if (num3 < menor) {
			menor = num3;
		}
		if (num4 < menor) {
			menor = num4;
		}
		if (num5 < menor) {
			menor = num5;
		}
		System.out.println("O maior número é o " + maior + " e o menor número é o " + menor + ".");
	}

}
