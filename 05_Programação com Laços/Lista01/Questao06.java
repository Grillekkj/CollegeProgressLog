package lista05_1;

import util.Teclado;

//Desenvolver um programa que leia um número n qualquer menor ou igual a 50 e apresente o valor obtido da 
//multiplicação sucessiva de n por 3 enquanto o produto for menor que 250. (n x 3; n x 3 x 3; n x 3 x 3 x 3 etc...).

public class Questao06 {

	public static void main(String[] args) {
		int num1, prod;
		num1 = Teclado.lerInt("Digite um número.");
		if (num1 > 50) {
			while (num1 > 50) {
				num1 = Teclado.lerInt("Digite um número menor ou igual a 50");
			}
		} 
		if (num1 <= 50){
			prod = num1;
				while (prod <= 250) {
					System.out.println(prod);
					prod = prod * 3;
			}
				System.out.println("O produto da multiplicação do seu número por 3 até o máximo de 250 é " + prod / 3 + ".");
		}
	}

}
