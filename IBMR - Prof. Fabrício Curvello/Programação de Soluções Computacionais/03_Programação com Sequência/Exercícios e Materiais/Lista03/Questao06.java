package lista03_3;

import util.Teclado;

//Fazer um algoritmo que pergunte dois valores a e b, efetue a troca dos valores, de forma que a variável a passe a 
//possuir o valor da variável b, e que a variável b passe a possuir o valor da variável a, e apresente os valores 
//trocados.

public class Questao06 {

	public static void main(String[] args) {
		int a, b, ab, ba;
		a = Teclado.lerInt("Digite seu primeiro número.");
		b = Teclado.lerInt("Digite seu segundo número.");
		ab = b;
		ba = a;
		System.out.println("Seu primeiro número foi " + ab + " e o seu segundo número foi o " + ba + ".");
	}

}
