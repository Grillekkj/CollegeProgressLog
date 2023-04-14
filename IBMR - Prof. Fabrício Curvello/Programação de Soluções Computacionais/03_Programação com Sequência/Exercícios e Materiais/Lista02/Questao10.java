package lista03_2;

import util.Teclado;

//Escreva um algoritmo pergunte o número total de eleitores de um município, o número de votos brancos, nulos 
//e válidos e apresente como resposta o percentual que cada um representa em relação ao total de eleitores.

public class Questao10 {

	public static void main(String[] args) {
		int totalEleitores, votosBrancos, votosNulos, votosValidos, perBrancos, perNulos, perValidos;
		totalEleitores = Teclado.lerInt("Digite o total de eleitores.");
		votosBrancos = Teclado.lerInt("Digite o total de votos brancos.");
		votosNulos = Teclado.lerInt("Digite o total de votos nulos.");
		votosValidos = Teclado.lerInt("Digite o total de votos válidos.");
		perBrancos = 100 * votosBrancos / totalEleitores;
		perNulos = 100 * votosNulos / totalEleitores;
		perValidos = 100 * votosValidos / totalEleitores;
		System.out.println("O percentual de votos brancos é " + perBrancos + ".");
		System.out.println("O percentual de votos nulos é " + perNulos + ".");
		System.out.println("O percentual de votos válidos é " + perValidos + ".");
	}

}