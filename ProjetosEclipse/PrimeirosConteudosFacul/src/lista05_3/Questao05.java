package lista05_3;

/*
 * Desenvolver um programa que apresente as potências de 2, variando de 0 a 10
 */

public class Questao05 {

    public static void main(String[] args) {
	int resultado = 0;
	for (int cont = 0; cont <= 10; cont++) {
	    resultado = (int) Math.pow(2, cont);
	    System.out.println("2 elevado a " + cont + " é " + resultado + ".");
	}
    }

}
