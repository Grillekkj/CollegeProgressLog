package lista05_3;

/*
 * Desenvolver um programa que apresente no final a soma dos valores pares
 * existentes na faixa de 3 até 21
 */

public class Questao07 {

    public static void main(String[] args) {
	int soma = 0;
	for (int cont = 3; cont <= 21; cont++) {
	    if (cont % 2 == 0) {
		soma = soma + cont;
	    }
	}
	System.out.println(soma);
    }

}
