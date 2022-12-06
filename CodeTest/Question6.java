// 6)Escreva um programa EM JAVA que lê três números reais, calcule e apresente a soma e a média dos números informados com 2 casas depois da vírgula.
import java.util.Scanner;

public class Question6 {
    
    public static void main(String[] args) {
        
        Scanner monitor = new Scanner(System.in);
        
        System.out.print("Escreva o primeiro numero real: ");
        double n1 = monitor.nextDouble();

        System.out.print("Escreva o segundo numero real: ");
        double n2 = monitor.nextDouble();

        System.out.print("Escreva o terceiro numero real: ");
        double n3 = monitor.nextDouble();


        double soma = n1 + n2 + n3;
        double media = soma / 3;

        System.out.printf("%f + %f + %f = %.2f \n", n1, n2, n3, soma);
        System.out.printf("A média entre esses 3 numeros é: %.2f\n", media);

        monitor.close();

    }
}
