package lista05_1;

//Desenvolver um programa que apresente todos os números divisíveis por 4 que sejam menores que 200. Para 
//saber se o número é divisível por 4 será necessário verificar a lógica desta condição com o comando if. Sendo 
//divisível, mostre-o; não sendo, passe para o próximo passo. A variável que controla o contador deve ser iniciada 
//com valor 1.

public class Questao07 {

	public static void main(String[] args) {
		int cont;
		cont = 1;
		while (cont < 200) {
			if (cont % 4 == 0) {
				System.out.println(cont);
			}
			cont++;
		}
	}

}
