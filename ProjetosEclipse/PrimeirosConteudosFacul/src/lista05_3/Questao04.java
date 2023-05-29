package lista05_3;

/*
 * Desenvolver um programa que apresente todos os números divisíveis por 5 que
 * sejam menores que 50.
 */

public class Questao04 {

    public static void main(String[] args) {
	for (int cont = 1; cont < 50; cont++) {
	    if (cont % 5 == 0) {
		System.out.println(cont);
	    }
	}
    }

}
