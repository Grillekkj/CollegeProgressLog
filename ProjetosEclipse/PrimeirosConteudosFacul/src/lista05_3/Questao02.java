package lista05_3;

import util.Teclado;

/*
 * Desenvolver um programa que apresente o total da soma de n números inteiros
 * do número 1 até n, onde n é um valor informado pelo usuário.
 */

public class Questao02 {

    public static void main(String[] args) {	
	int soma = 0;
	int n = Teclado.lerInt("Digite um número.");
	for (int cont = 1; cont <= n; cont++) {
	    soma = soma + cont;
	}
	System.out.println(soma);
    }

}
