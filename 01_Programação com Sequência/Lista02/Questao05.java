package lista03_2;

import util.Teclado;

//Fazer um algoritmo que pergunte dois números e ao final apresente os seguintes valores: a soma dos dois 
//números, a subtração do primeiro pelo segundo número, a subtração do segundo pelo primeiro número, a 
//multiplicação entre os dois números, a divisão do primeiro pelo segundo número, e também o resto da divisão 
//do primeiro pelo segundo número.

public class Questao05 {

	public static void main(String[] args) {
		int num1, num2, soma, sub12, sub21, multi, div12, resto12;
		num1 = Teclado.lerInt("Digite seu primeiro número.");
		num2 = Teclado.lerInt("Digite seu segundo número.");
		soma = num1 + num2;
		sub12 = num1 - num2;
		sub21 = num2 - num1;
		multi = num1 * num2;
		div12 = num1 / num2;
		resto12 = num1 % num2;
		System.out.println("A soma dos seus números é " + soma + ".");
		System.out.println("A subtração do " + num1 + " pelo " + num2 + " é " + sub12 + ".");
		System.out.println("A subtração do " + num2 + " pelo " + num1 + " é " + sub21 + ".");
		System.out.println("A multiplicação dos seus números é " + multi + ".");
		System.out.println("A divisão do " + num1 + " pelo " + num2 + " é " + div12 + ".");
		System.out.println("O resto da divisão entre o " + num1 + " e o " + num2 + " é " + resto12 + ".");
	}

}
