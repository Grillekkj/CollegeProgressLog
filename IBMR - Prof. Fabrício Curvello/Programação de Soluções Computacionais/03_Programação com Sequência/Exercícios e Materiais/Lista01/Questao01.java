package lista03_1;

import util.Teclado;

//Desenvolver um programa que pergunte ao usuário o seu nome completo e seu sexo.
//Em seguida, o programa deve apresentar os dados anteriormente informados.

public class Questao01 {

	public static void main(String[] args) {
		String nome, sexo;
		nome = Teclado.lerTexto("Digite seu nome completo.");
		sexo = Teclado.lerTexto("Digite seu sexo.");
		System.out.println("Seu nome completo é " + nome + " e seu sexo é " + sexo + ".");
	}

}
