package lista03_2;

import util.Teclado;

//Desenvolver um programa que pergunte ao usuário o seu peso e sua altura. Ao final o programa deverá exibir na 
//tela o valor do índice de massa corporal desta pessoa (IMC). 
//Fórmula: IMC = peso / altura2
//- Obs: peso em quilos e altura em metros.

public class Questao04 {

	public static void main(String[] args) {
		double peso, altura, imc;
		peso = Teclado.lerDouble("Digite o seu peso em quilos.");
		altura = Teclado.lerDouble("Digite sua altura em metros.");
		imc = peso / Math.pow(altura, 2);
		System.out.println("Seu IMC é " + imc + ".");
	}

}
