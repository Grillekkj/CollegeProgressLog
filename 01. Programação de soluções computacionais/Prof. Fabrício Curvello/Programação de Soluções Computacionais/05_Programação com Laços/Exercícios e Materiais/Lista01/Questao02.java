package lista05_1;

//Desenvolver um programa que exiba os números em ordem decrescente de 100 até 1.

public class Questao02 {

	public static void main(String[] args) {
		int cont;
		cont = 101;
		while (cont > 1) {
			cont--;
			System.out.println(cont + ".");
		}
		System.out.println("Aqui estão os números de 100 a 1.");
	}

}
