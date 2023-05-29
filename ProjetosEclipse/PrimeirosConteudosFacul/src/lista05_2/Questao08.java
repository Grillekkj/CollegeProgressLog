package lista05_2;

import util.Teclado;

/*
 * Desenvolver um programa que apresente o valor de uma potência de uma base
 * qualquer elevada a um expoente qualquer, ou seja, de b elevado a e . (Não utilize
 * Math.pow();)
 */

public class Questao08 {

    public static void main(String[] args) {
	int base, expoente, cont = 1, potencia = 1;
	base = Teclado.lerInt("Digite uma base.");
	expoente = Teclado.lerInt("Digite um expoente.");
	do {
	    potencia = potencia * base;
	    cont++;
	} while (cont <= expoente);
	System.out.println(base + " elevado a " + expoente + " é " + potencia + ".");
    }

}