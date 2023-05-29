package lista05_2;

import util.Teclado;

/*
 * Desenvolver um programa que apresente os resultados de uma tabuada de um
 * número n qualquer a ser perguntado ao usuário (n x 1, n x 2, n x 3, ... , n x
 * 9, n x 10)
 */

public class Questao04 {

    public static void main(String[] args) {
	int num, cont = 1, resultado;
	num = Teclado.lerInt("Digite um número qualquer.");
	do {
	    resultado = num * cont;
	    System.out.println(num + " X " + cont + " = " + resultado + ".");
	    cont++;
	} while (cont <= 10);
	
    }

}
