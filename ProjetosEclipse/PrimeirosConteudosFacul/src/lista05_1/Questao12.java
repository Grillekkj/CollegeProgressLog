package lista05_1;

import util.Teclado;

/*
 * Desenvolver um programa que peça ao usuário para digitar diversos números
 * reais, e ao final, exibir o maior e o menor número que foram digitados, além
 * da média entre TODOS os números digitados pelo usuário. A inserção de números
 * deve parar quando o usuário digitar o número -1, e este número -1 não deve
 * ser considerado nem como maior, nem como menor, e nem na contagem da média.
 */

public class Questao12 {

    public static void main(String[] args) {
	double numeros, maior, menor, cont, media;
	numeros = Teclado.lerDouble("Digite quantos números reais quiser. (Digite -1 para parar)");
	cont = 0;
	menor = numeros;
	maior = numeros;
	media = 0;

	while (numeros != -1) {
	    media = media + numeros;
	    if (menor > numeros) {
		menor = numeros;
	    }
	    if (maior < numeros) {
		maior = numeros;
	    }

	    numeros = Teclado.lerDouble("Digite quantos números reais quiser. (Digite -1 para parar)");
	    cont++;
	}
	if (numeros == -1) {
	    System.out.println("Seu maior número foi:" + maior + ".");
	    System.out.println("Seu menor número foi:" + menor + ".");
	    System.out.println("A média dos seus números foi:" + media / cont + ".");
	}
    }

}
