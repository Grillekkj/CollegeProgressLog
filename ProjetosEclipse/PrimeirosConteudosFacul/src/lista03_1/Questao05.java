package lista03_1;

import util.Teclado;

/*
 * Fazer um programa que pergunte o salário de um funcionário e apresente este salário com um aumento de 15%.
 */

public class Questao05 {

    public static void main(String[] args) {
	double sal, salFinal;
	sal = Teclado.lerDouble("Digite seu salário.");
	salFinal = sal + (sal * 15 / 100);
	System.out.println("Seu salário com aumento de 15% ficará em R$" + salFinal + ".");
    }

}
