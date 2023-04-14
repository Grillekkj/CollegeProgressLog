package lista03_2;

import util.Teclado;

//Fazer um algoritmo que receba o preço de custo de um produto e mostre como resposta o valor de venda.
//sabe-se que o preço de custo receberá um acréscimo de acordo com um percentual informado pelo usuário.


public class Questao08 {

	public static void main(String[] args) {
		double custoProd, percentual, valorVenda;
		custoProd = Teclado.lerDouble("Digite o valor de custo do seu produto.");
		percentual = Teclado.lerDouble("Digite o percentual de acréscimo para a venda do seu produto.");
		valorVenda = (custoProd * (percentual / 100)) + custoProd;
		System.out.println("O valor de venda do seu produto é R$" + valorVenda + ".");
	}

}
