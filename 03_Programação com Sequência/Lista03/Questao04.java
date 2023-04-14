package lista03_3;

import util.Teclado;

//Fazer um algoritmo que pergunte 4 números e apresente a média aritmética ponderada, com pesos respectivos 
//de 1, 2, 3 e 4.
//Obs: Sabe-se que o cálculo da média aritmética ponderada (mp) é feito da seguinte forma: 
//mp = ( (num1 x peso1) + (num2 x peso2) + (num3 x peso3) + (num4 x peso4) ) / (peso1 + peso2 + peso3 + peso4).

public class Questao04 {

	public static void main(String[] args) {
		double num1, num2, num3, num4, medPonde, peso1, peso2, peso3, peso4;
		num1 = Teclado.lerDouble("Digite seu primeiro número.");
		num2 = Teclado.lerDouble("Digite seu segundo número.");
		num3 = Teclado.lerDouble("Digite seu terceiro número.");
		num4 = Teclado.lerDouble("Digite seu quarto número.");
		peso1 = 1;
		peso2 = 2;
		peso3 = 3;
		peso4 = 4;
		medPonde = ((num1 * peso1) + (num2 * peso2) + (num3 * peso3) + (num4 * peso4)) / (peso1 + peso2 + peso3 + peso4);
		System.out.println("A média ponderada dos seus números é " + medPonde + ".");
	}

}
