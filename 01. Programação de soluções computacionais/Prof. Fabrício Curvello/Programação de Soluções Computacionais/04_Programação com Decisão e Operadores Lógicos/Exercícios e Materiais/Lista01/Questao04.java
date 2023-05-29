package lista04_1;

import util.Teclado;

//Desenvolver um programa que pergunte um valor numérico inteiro e faça a exibição desse valor caso seja 
//divisível por 4 e 5. Não sendo divisível por 4 e 5, o programa deverá exibir a mensagem “Valor não é divisível por 
//4 e 5”.

public class Questao04 {

	public static void main(String[] args) {
		int num1;
		num1 = Teclado.lerInt("Digite seu número.");
		if (num1 % 4 == 0 && num1 % 5 == 0) {
			System.out.println("Seu número (" + num1 + ") é divisível por 4 e 5.");
		} else {
			System.out.println("Seu número não é divisível por 4 e 5.");
		}
	}

}
