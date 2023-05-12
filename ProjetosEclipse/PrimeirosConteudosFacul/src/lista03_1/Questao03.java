package lista03_1;

import util.Teclado;

/*
 * Fazer um programa que pergunte um valor em Dólares e apresente o equivalente em Reais.
 * Considere U$1,00 = R$3,80.
 */

public class Questao03 {

    public static void main(String[] args) {
	double dol, cota, reais;
	cota = 3.80;
	dol = Teclado.lerDouble("Digite quanto dinheiro em dólar você tem.");
	reais = dol * cota;
	System.out.printf("O valor de dólares em reais que você tem é: R$" + "%.2f", reais + ".");

    }

}
