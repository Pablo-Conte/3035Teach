// 7) Crie um programa EM JAVA que leia um número real, calcule e exiba na tela os valores correspondentes a 5%, 50% e 150% do valor 
// informado com 1, 2 e 3 casas decimais.
import java.util.Scanner;

public class Question7{
    public static void main(String[] args) {
        
        Scanner monitor = new Scanner(System.in);

        System.out.print("Digite um numero real: ");
        double n1 = monitor.nextDouble();

        double cinco = n1 * 0.05;
        double cinquenta = n1 * 0.5;
        double centCinquenta = n1 * 1.5;
        
        System.out.printf("5 porcento de %.1f = %.1f\n", n1, cinco);
        System.out.printf("50 porcento de %.2f = %.2f\n", n1, cinquenta);
        System.out.printf("150 porcento de %.3f = %.3f\n", n1, centCinquenta);

        monitor.close();
    }
}
