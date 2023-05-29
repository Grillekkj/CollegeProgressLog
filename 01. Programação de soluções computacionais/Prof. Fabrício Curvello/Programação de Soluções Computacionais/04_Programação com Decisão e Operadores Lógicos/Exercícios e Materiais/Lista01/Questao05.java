package lista04_1;

import util.Teclado;

//Desenvolver um programa que pergunte 4 notas escolares de um aluno e exiba mensagem informando que o 
//aluno foi aprovado se a média escolar for maior ou igual a 5. Se o aluno não foi aprovado, indicar uma 
//mensagem informando essa condição. Apresentar junto com a mensagem de aprovação ou reprovação o valor 
//da média obtida pelo aluno.

public class Questao05 {

	public static void main(String[] args) {
		double num1, num2, num3, num4, mediaNotas;
		num1 = Teclado.lerDouble("Digite sua primeira nota.");
		num2 = Teclado.lerDouble("Digite sua segunda nota.");
		num3 = Teclado.lerDouble("Digite sua terceira nota.");
		num4 = Teclado.lerDouble("Digite sua quarta nota.");
		mediaNotas = (num1 + num2 + num3 + num4) / 4;
		if (mediaNotas >= 5) {
			System.out.println("Parabéns, você foi aprovado com uma média de " + mediaNotas + ".");
		} else {
			System.out.println("Infelizmente, você foi reprovado com uma média de " + mediaNotas + ".");
		}
	}

}
