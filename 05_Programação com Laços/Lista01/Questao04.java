package lista05_1;

//Desenvolver um programa que apresente o valor da soma dos cem primeiros números inteiros (1 + 2 + 3 + 4 + ... + 97 + 98 + 99 + 100)

public class Questao04 {

	public static void main(String[] args) {
		int cont, armazem;
		cont = 1;
		armazem = 0;
		while (cont <= 100) {
			armazem = armazem + cont;
			cont++;
		}
		System.out.println("A soma dos cem primeiros números inteiros é " + armazem + ".");
	}

}
