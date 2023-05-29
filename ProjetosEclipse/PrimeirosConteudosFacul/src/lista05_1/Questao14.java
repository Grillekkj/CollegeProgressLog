package lista05_1;

import util.Teclado;

/*
 * Desenvolver um programa que calcule o fatorial do número 5, ou seja, 5!.
 * Desta forma, temos que 5! = 5 . 4 . 3 . 2 . 1 ou 5! = 1 . 2 . 3 . 4 . 5,
 * equivalente a 120.
 */
public class Questao14 {

    public static void main(String[] args) {
	int a = 1, fato = Teclado.lerInt("Digite um número."), b = fato;
	while (a < b) {
	    fato = fato * a;
	    a++;
	}
	System.out.println("Seu número em fatorial é " + fato + ".");
    }

}
