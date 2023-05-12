package SeparadorDeSilabas;
import java.util.Scanner;

public class ContagemMenoresIdade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cont = 1;
        int idade;
        int totalMenores = 0;
        
        do {
            System.out.print("Digite a idade da pessoa " + cont + ": ");
            idade = scanner.nextInt();
            
            if (idade < 18) {
        	totalMenores++;
            }
            
            cont++;
        } while (cont <= 10);
        
        System.out.println("Quantidade de pessoas menores de idade: " + totalMenores);
    }
}
