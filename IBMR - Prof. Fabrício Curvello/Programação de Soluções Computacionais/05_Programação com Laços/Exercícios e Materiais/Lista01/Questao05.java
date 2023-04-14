package lista05_1;

import util.Teclado;

//Desenvolver um programa que apresente os resultados de uma tabela de um número qualquer. Ela deve ser 
//impressa no seguinte formato: 
//Considerando como exemplo o fornecimento do número 2
//2 . 1 = 2
//2 . 2 = 4
//2 . 3 = 6
//2 . 4 = 8
//2 . 5 = 10
//(...)
//2 . 10 = 20

public class Questao05 {

	public static void main(String[] args) {
		int num1, cont, resultado;
		num1 = Teclado.lerInt("Digite um número.");
		cont = 1;
		while (cont <= 10) {
			resultado = num1 * cont;
			System.out.println(num1 + " . " + cont + " = " + resultado);
			cont++;
		}
	}

}
