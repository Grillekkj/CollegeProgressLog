package lista04_1;

import util.Teclado;

//Desenvolver um programa que permita ao aluno responder qual a capital do Brasil. O programa deverá exibir se 
//a resposta está certa ou errada.

public class Questao02 {

	public static void main(String[] args) {
		String pergunta;
		pergunta = Teclado.lerTexto("Qual a capital do Brasil?");
		if (pergunta.equals("Brasília")) {
			System.out.println("Parabéns, você acertou a capital do Brasil.");
		} else {
			System.out.println("Infelizmente, você errou a capital do Brasil.");
		}
		
	}

}
