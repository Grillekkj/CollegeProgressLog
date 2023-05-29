package lista03_3;

import util.Teclado;

//Fazer um programa que pergunte dois valores reais e apresente o primeiro com acréscimo de 30% e o segundo 
//com desconto de 25%.

public class Questao03 {

	public static void main(String[] args) {
		double num1, num2, mais30, mais25;
		num1 = Teclado.lerDouble("Digite o seu primeiro número.");
		num2 = Teclado.lerDouble("Digite o seu segundo número.");
		mais30 = num1 + (num1 * 0.30);
		mais25 = num2 - (num2 * 0.25);
		System.out.println("Seu primeiro número com aumento de 30% é " + mais30 + " e o segundo com desconto de 25% é " + mais25 + ".");
	}

}
