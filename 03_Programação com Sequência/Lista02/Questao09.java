package lista03_2;

import util.Teclado;

//Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e mostre-a expressa apenas 
//em dias. Obs: Considere os anos com 365 dias e os meses com 30 dias.

public class Questao09 {

	public static void main(String[] args) {
		int anos, meses, dias, idadeDias;
		anos = Teclado.lerInt("Digite quantos anos você tem.");
		meses = Teclado.lerInt("Digite quantos meses fazem que você fez aniversário.");
		dias = Teclado.lerInt("Digite quantos dias se passaram desde o mês digitado acima.");
		idadeDias = (anos * 365) + (meses * 30) + dias;
		System.out.println("Sua idade em dias é " + idadeDias + ".");		
	}

}
