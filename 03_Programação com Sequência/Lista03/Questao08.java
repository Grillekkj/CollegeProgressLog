package lista03_3;

import util.Teclado;

//Fazer um algoritmo que pergunte a base e a altura de um retângulo, e apresente:
//a) O perímetro deste retângulo
//b) A área deste retângulo
//c) A diagonal deste retângulo
//Eis as fórmulas:
//perímetro	=	Soma	de	todos	os	lados	do	retângulo.	
//área	=	Base	x	Altura	
//diagonal2	=	base2	+	altura2 ou, se preferir, diagonal	=	√(base2	+	altura2).

public class Questao08 {

	public static void main(String[] args) {
		double base, altura, perim, area, diagonal;
		base = Teclado.lerDouble("Digite o valor da base do seu retângulo.");
		altura = Teclado.lerDouble("Digite o valor da altura do seu retângulo.");
		perim = base + base + altura + altura;
		area = base * altura;
		diagonal = Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2));
		System.out.println("O valor do perímetro do seu retângulo é " + perim + ".");
		System.out.println("O valor da área do seu retângulo é " + area + ".");
		System.out.println("O quantidade de diagonais do seu retângulo é " + diagonal + ".");
	}

}
