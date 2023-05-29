package lista03_2;

import util.Teclado;

//Desenvolver um programa que pergunte ao usuário o seu peso (em quilos) e sua altura (em metros). Ao final o 
//programa deverá exibir na tela para o usuário o valor do peso informado em gramas e a altura em centímetros.

public class Questao03 {

	public static void main(String[] args) {
		double peso, altura, pesoGr, alturaCm;
		peso = Teclado.lerDouble("Digite o seu peso em quilos.");
		altura = Teclado.lerDouble("Digite sua altura em metros.");
		pesoGr = peso * 1000;
		alturaCm = altura * 100;
		System.out.println("Seu peso em gramas é " + pesoGr + " e sua altura em cm é " + alturaCm + ".");
	}

}
