package lista05_2;

import util.Teclado;

/*
 * Desenvolver um programa que apresente a série de Fibonacci até o décimo
 * quinto termo. A série de Fibonacci é formada pela sequência
 * 1,1,2,3,5,8,13,21,34, ... etc. Essa série se caracteriza pela soma de um
 * termo posterior com o seu anterior subsequente.
 */

public class Questao09 {

    public static void main(String[] args) {
	int anterior = 1, posterior = 1, cont = 1, contTermo = Teclado.lerInt("Digite qual termo você quer."), a;
	do {
	    System.out.println(anterior + ".");
	    a = anterior + posterior;
	    anterior = posterior;
	    posterior = a;
	    cont++;
	}
	while (cont <= contTermo);
    }

}
