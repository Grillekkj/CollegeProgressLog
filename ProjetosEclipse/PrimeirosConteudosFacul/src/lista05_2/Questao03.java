package lista05_2;

/*
 * Desenvolver um programa que apresente o total da soma dos cinco primeiros
 * números inteiros.
 */

public class Questao03 {

    public static void main(String[] args) {
	int cont = 1, soma = 0;
	do {
	    soma = soma + cont;
	    cont++;
	} while (cont <= 5);
	System.out.println("A soma dos 5 primeiros números inteiros é: " + soma + ".");
    }

}
