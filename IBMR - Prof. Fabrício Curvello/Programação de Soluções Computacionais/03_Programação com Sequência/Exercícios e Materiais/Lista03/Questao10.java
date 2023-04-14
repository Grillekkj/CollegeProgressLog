package lista03_3;

import util.Teclado;

//Fazer um algoritmo que solicite a razão de uma pg (Progressão Geométrica) e o valor do 1º termo. E apresente o
//5º termo da série.

public class Questao10 {

	public static void main(String[] args) {
		double razaoPg, primTermo, quinTermo;
		razaoPg = Teclado.lerDouble("Digite a razão da sua P.G.");
		primTermo = Teclado.lerDouble("Digite o primeiro termo da P.G.");
		quinTermo = primTermo * Math.pow(razaoPg, 5 - 1);
		System.out.println("O quinto termo da sua P.G é " + quinTermo + ".");
		
	}

}
