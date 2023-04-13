package lista03_1;

import util.Teclado;

//Elaborar um programa que pergunte quatro valores inteiros e apresente 2 resultados: 
//a) Resultado de suas adições
//b) Resultado de suas multiplicações

public class Questao02 {

	public static void main(String[] args) {
		int num1, num2, num3, num4;
		num1 = Teclado.lerInt("Digite o seu primeiro número.");
		num2 = Teclado.lerInt("Digite o seu segundo número.");
		num3 = Teclado.lerInt("Digite o seu terceiro número.");
		num4 = Teclado.lerInt("Digite o seu quarto número.");
		var Soma = num1 + num2 + num3 + num4;
		var Multi = num1 * num2 * num3 * num4;
		System.out.println("A soma total dos seus números é " + Soma + " e a multiplicação total dos seus números é " + Multi + ".");
	}

}
