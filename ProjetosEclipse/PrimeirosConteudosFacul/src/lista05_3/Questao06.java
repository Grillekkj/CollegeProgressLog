package lista05_3;

import util.Teclado;

/*
 * Desenvolver um programa que apresente o valor de uma potência de uma base
 * qualquer elevada a um expoente qualquer, ou seja, de b elevado a e , onde os valores de
 * b e e são fornecidos pelo usuário, sem utilizar Math.pow()
 */

public class Questao06 {

    public static void main(String[] args) {
	int base = Teclado.lerInt("Digite uma base");
	int expoente = Teclado.lerInt("Digite um expoente");
	int resultado = 1;
	for (int cont = 1; cont <= expoente; cont++) {
	    resultado = resultado * base;
	}
	System.out.println(base + " elevado a " + expoente + " é " + resultado + ".");
    }

}
