package lista03_3;

import util.Teclado;

//Fazer um algoritmo que pergunte os valores dos catetos de um triângulo retângulo e apresente o valor da 
//hipotenusa. 
//Obs: A fórmula é hipotenusa2	=	cateto12	+	cateto22 ou, se preferir, hipotenusa	=	√(	cateto12	+	cateto22).

public class Questao07 {

	public static void main(String[] args) {
		double cat1, cat2, hip;
		cat1 = Teclado.lerDouble("Digite o valor do primeiro cateto.");
		cat2 = Teclado.lerDouble("Digite o valor do segundo cateto.");
		hip = Math.sqrt(Math.pow(cat1, 2) + Math.pow(cat2, 2));
		System.out.println("A hipotenusa do seu triângulo vale " + hip + ".");
	}

}
