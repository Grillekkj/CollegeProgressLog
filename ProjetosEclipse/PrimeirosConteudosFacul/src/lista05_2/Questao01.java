package lista05_2;

/*
 * Desenvolver um programa que apresente todos os valores numéricos inteiros
 * pares situados na faixa de 100 a 200.
 */

public class Questao01 {

    public static void main(String[] args) {
	int cont = 100;
	do {
	    if (cont % 2 == 0) {
		System.out.println(cont);
	    }
	    cont++;
	    
	} while (cont <= 200);

    }

}
