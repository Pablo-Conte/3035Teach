//3) Faça uma função que retorne apenas as vogais de uma palavra.

import java.util.Scanner;

public class Question3 {

    public static String justVowels(String str){
        
        String justVowels = "";

        for (char c : str.toCharArray()){
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' || c == 'á' || c == 'À' || c == 'Â' || c == 'Ã' || c == 'Á' || c == 'é' || c == 'ê' || c == 'É' || c == 'Ê' || c == 'í' || c == 'Í' || c == 'ó' || c == 'Ó'){
                justVowels = justVowels + c;
            }
        }

        return justVowels;
    }

    public static void main(String []args) {

        Scanner monitor = new Scanner(System.in);
        System.out.print("Write a string: ");

        String word = monitor.nextLine();

        System.out.println(justVowels(word));
        monitor.close();
    }
}