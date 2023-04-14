package lista05_1;

//Desenvolver um programa que apresente os quadrados dos números inteiros de 15 a 200.

public class Questao03 {

	public static void main(String[] args) {
		int cont;
		cont = 15;
		while (cont <= 200) {
			System.out.println(cont + " elevado ao quadrado é " + Math.pow(cont, 2) + ".");
			cont++;;
		}
	}

}
