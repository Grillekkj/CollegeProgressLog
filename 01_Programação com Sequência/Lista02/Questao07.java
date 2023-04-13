package lista03_2;

import util.Teclado;

//A Loja Mamão com Açúcar está vendendo seus produtos em até 10 prestações sem juros. Faça um algoritmo que 
//pergunte um valor de uma compra, o número de prestações escolhidas e apresente como resultado o valor das 
//prestações.

public class Questao07 {

	public static void main(String[] args) {
		double valorCompra, numPresta, valorPresta;
		valorCompra = Teclado.lerDouble("Digite o valor da sua compra.");
		numPresta = Teclado.lerDouble("Digite o número de prestações. (Máximo de 10x /s juros)");
		valorPresta = valorCompra / numPresta;
		System.out.println("O valor das suas prestações ficará em R$" + valorPresta + ".");
	}

}
