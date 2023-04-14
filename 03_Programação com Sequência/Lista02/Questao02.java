package lista03_2;

import util.Teclado;

// Desenvolver um programa que faça duas perguntas: o valor referente às horas atuais e o valor referente aos 
//minutos atuais. Exemplo, se agora são 09:35h o usuário deverá informar como resposta às horas atuais o valor 
//09 e como resposta aos minutos atuais o valor 35. Em seguida o programa deverá apresentar como resposta 
//quantos minutos já se passaram desde às 00:00h deste dia.

public class Questao02 {

	public static void main(String[] args) {
		int horas, minutos, tempoPassado;
		horas = Teclado.lerInt("Informe os 2 números da hora do horario atual.");
		minutos = Teclado.lerInt("Informe os 2 números dos minutos do horario atual.");
		tempoPassado = minutos + (horas * 60);
		System.out.println("O tempo em minutos do dia de hoje é " + tempoPassado + ".");
	}

}
