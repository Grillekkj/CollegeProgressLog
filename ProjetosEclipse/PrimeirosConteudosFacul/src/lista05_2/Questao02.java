package lista05_2;

/*
 * Desenvolver um programa que apresente no final a soma dos valores pares
 * existentes na faixa de 0 até 500. Utilize um laço que varie de 2 em 2.
 */

public class Questao02 {

    public static void main(String[] args) {
	int cont = 0, soma = 0;
	do {
	    soma = soma + cont;
	    cont = cont + 2;
	} while (cont <=500);
	System.out.println("A soma dos valores pares exisitentes na faixa de 0 até 500 é: " + soma + ".");
    }

}
