package lista05_2;

import util.Teclado;

/*
 * A série de Ricci difere da série de Fibonacci porque os dois primeiros termos
 * são fornecidos pelo usuário. O restante da série é calculado da mesma forma
 * que na série de Fibonacci. Altere o programa da questão anterior, para que
 * sejam perguntados os dois primeiros termos da série de Ricci, e sejam
 * exibidos os 15 termos subsequentes desta série.
 */

public class Questao10 {

    public static void main(String[] args) {
	int anterior = Teclado.lerInt("Digite o primeiro número da série.");
	int posterior = Teclado.lerInt("Digite o segundo número da série.");
	int cont = 1; 
	int contTermo = Teclado.lerInt("Digite qual termo você quer.");
	int a;
	do {
	    System.out.println(anterior + ".");
	    a = anterior + posterior;
	    anterior = posterior;
	    posterior = a;
	    cont++;
	} while (cont <= contTermo);
    }

}
