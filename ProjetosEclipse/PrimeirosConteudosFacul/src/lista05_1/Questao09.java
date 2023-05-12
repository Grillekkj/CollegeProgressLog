package lista05_1;

//Elaborar um programa que apresente no final a soma dos valores pares existentes na faixa de 0 até 500. Utilize 
//um laço que efetue a variação de 2 em 2.

public class Questao09 {

	public static void main(String[] args) {
		int cont, soma;
		cont = 0;
		soma = 0;
		while (cont <= 500) {
			if (cont % 2 == 0) {
				soma = soma + cont;
			}
			cont = cont + 2;
		}
		System.out.println("A soma dos números pares de 0 a 500 é " + soma + ".");
	}

}