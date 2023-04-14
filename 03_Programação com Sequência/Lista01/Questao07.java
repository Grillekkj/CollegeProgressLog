package lista03_1;

import util.Teclado;

//Fazer um algoritmo que pergunte 3 números e apresente a média aritmética entre estes 3 números.


public class Questao07 {

	public static void main(String[] args) {
		double num1, num2, num3, valFinal;
		num1 = Teclado.lerDouble("Digite seu primeiro número.");
		num2 = Teclado.lerDouble("Digite seu segundo número.");
		num3 = Teclado.lerDouble("Digite seu terceiro número.");
		valFinal = (num1 + num2 + num3) / 3;
		System.out.println("A média aritmética dos seus 3 números é " + valFinal + ".");
		
	}
}
