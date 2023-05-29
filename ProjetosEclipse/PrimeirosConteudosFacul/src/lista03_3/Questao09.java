package lista03_3;

import util.Teclado;

//Fazer um algoritmo que solicite a razão de uma pa (Progressão Aritmética) e o valor do 1º termo. E apresente o 
//10º termo da série.

public class Questao09 {

	public static void main(String[] args) {
		int razaoPa, primTermo, deciTermo;
		razaoPa = Teclado.lerInt("Digite a razão da sua P.A.");
		primTermo = Teclado.lerInt("Digite o primeiro termo da P.A.");
		deciTermo = primTermo + (10 - 1) * razaoPa;
		System.out.println("O décimo termo da sua P.A é " + deciTermo + ".");
	}

}
