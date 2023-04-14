package lista03_2;

import util.Teclado;

//Fazer um algoritmo que pergunte o nome de um vendedor, o seu salário fixo e o total de vendas efetuadas por 
//ele no mês (em dinheiro). Sabendo que este vendedor ganha 15% de comissão sobre suas vendas efetuadas, 
//exibir ao final o seu nome, o salário fixo, a comissão e o salário completo (fixo + comissão sobre vendas) no final 
//do mês.

public class Questao06 {

	public static void main(String[] args) {
		String nomeV;
		double salFix, totalVen, comissao, salTotal;
		nomeV = Teclado.lerTexto("Digite seu nome.");
		salFix = Teclado.lerDouble("Digite seu salário fixo.");
		totalVen = Teclado.lerDouble("Digite quantas vendas você fez esse mês.");
		comissao = totalVen * 0.15;
		salTotal = salFix + comissao;
		System.out.println("Seu nome é, " + nomeV + "." + " Seu salário fixo é de, R$" + salFix + " e nesse mês o seu salário total foi de R$" + salTotal + " com uma comissão de, R$" + comissao + ".");
	}

}
