package lista03_3;

import util.Teclado;

//Fazer um algoritmo que calcule e apresente o valor do volume de uma lata de óleo, utilizando a fórmula 
//v	= pi.r elevado a 2. h. Onde v=Volume, pi=3.14159265, r	=	raio	e	h	=	altura

public class Questao05 {

	public static void main(String[] args) {
		double altura, raio, volume;
		altura = Teclado.lerDouble("Digite a altura da lata.");
		raio = Teclado.lerDouble("Digite o raio da lata.");
		volume = Math.PI * Math.pow(raio, 2) * altura;
		System.out.println("O volume da sua lata de óleo é " + volume + ".");
	}

}
