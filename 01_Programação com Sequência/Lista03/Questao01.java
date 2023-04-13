package lista03_3;

import util.Teclado;

//Elaborar um programa de computador que pergunte ao usuário o valor do Raio de um círculo e calcule a área do 
//referido círculo, apresentando o resultado deste cálculo.
//Obs: A fórmula da área é a=pi.r ao qudrado. Considere o valor de pi = 3.14159265

public class Questao01 {

	public static void main(String[] args) {
		double raioCirc, areaCirc;
		raioCirc = Teclado.lerDouble("Digite o raio do círculo.");
		areaCirc = Math.PI * (Math.pow(raioCirc, 2));
		System.out.println("A área do seu cículo é " + areaCirc + ".");
	}

}
