package lista03_1;

import util.Teclado;

//Fazer um algoritmo que pergunte 1 número e apresente:
//a) O próprio número
//b) O quadrado deste número
//c) A raiz quadrada deste número

public class Questao09 {

	public static void main(String[] args) {
		double num, numQuad, numRaiz;
		num = Teclado.lerDouble("Digite um número.");
		numQuad = Math.pow(num,2);
		numRaiz = Math.sqrt(num);
		System.out.println("Seu número é o " + num + " o quadrado desse número é " + numQuad + " e a raiz quadrada dele é " + numRaiz + ".");
	}

}
