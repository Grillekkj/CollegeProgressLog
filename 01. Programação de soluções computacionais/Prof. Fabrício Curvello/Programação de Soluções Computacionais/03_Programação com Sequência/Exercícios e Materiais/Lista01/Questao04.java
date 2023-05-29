package lista03_1;

import util.Teclado;

//Fazer um programa que pergunte um número inteiro e apresente o seu antecessor e seu sucessor.

public class Questao04 {

	public static void main(String[] args) {
		int num1, ante, suce;
		num1 = Teclado.lerInt("Digite um número que você queira saber o antecessor e o sucessor.");
		ante = num1 - 1;
		suce = num1 + 1;
		System.out.println("O antecessor do seu número é " + ante + " e o sucessor dele é " + suce + ".");
		
	}

}
