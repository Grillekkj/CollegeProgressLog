package lista05_3;

import util.Teclado;

/*
 * Desenvolver um programa que apresente os resultados de uma tabuada de um
 * número qualquer informado pelo usuário.
 */

public class Questao03 {

    public static void main(String[] args) {
	int multiplicado = Teclado.lerInt("Digite um número.");
	int resultado;
	for (int cont = 1; cont <= 10; cont++ ) {
	    resultado = multiplicado * cont;
	    System.out.println(multiplicado + " X " + cont + " = " + resultado);
	}
    }

}
