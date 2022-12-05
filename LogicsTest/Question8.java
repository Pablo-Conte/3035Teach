// 8) Faça um programa, usando SWITCH, que receba dois números e execute as operações listadas a seguir, de acordo com a escolha.
// Operações com SWITCH:
// a) Operação 1: A soma de dois números
// b) Operação 2: A subtração de dois números
// c) Operação 3: A multiplicação de dois números
// d) Operação 4: A divisão de dois números
// Se a opção digitada for inválida, mostre uma mensagem de erro e termine a execução do programa.

import java.util.Scanner;

public class Question8{
    public static void main(String[] args) {
        
        Scanner monitor = new Scanner(System.in);

        System.out.println("Bem vindo a calculadora!");
        System.out.println("1 - Somar");
        System.out.println("2 - Subtrair");
        System.out.println("3 - Multiplicar");
        System.out.println("4 - Dividir");

        System.out.print("Qual a sua escolha?: ");
        int choice = monitor.nextInt();

        switch (choice){

            case 1:
                System.out.print("Primeiro numero: ");
                double soma1 = monitor.nextDouble();

                System.out.print("Segundo numero: ");
                double soma2 = monitor.nextDouble();

                double soma = soma1 + soma2;
                System.out.printf("%.1f + %.1f = %.1f\n", soma1, soma2, soma);
            break;
            case 2:
                System.out.print("Primeiro numero: ");
                double sub1 = monitor.nextDouble();
                
                System.out.print("Segundo numero: ");
                double sub2 = monitor.nextDouble();

                double sub = sub1 - sub2;
                System.out.printf("%.1f - %.1f = %.1f\n", sub1, sub2, sub);
            break;
            case 3:
                System.out.print("Primeiro numero: ");
                double mult1 = monitor.nextDouble();
                
                System.out.print("Segundo numero: ");
                double mult2 = monitor.nextDouble();

                double mult = mult1 * mult2;
                System.out.printf("%.1f x %.1f = %.1f\n", mult1, mult2, mult);
            break;
            case 4:
                System.out.print("Primeiro numero: ");
                double div1 = monitor.nextDouble();
                
                System.out.print("Segundo numero: ");
                double div2 = monitor.nextDouble();

                double div = div1 / div2;
                System.out.printf("%.1f / %.1f = %.1f\n", div1, div2, div);
            break;
            default:
                System.out.println("Escolha incorreta, encerrando programa!");
        }
        monitor.close();
    }
}
