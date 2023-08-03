package restart;

import java.util.Scanner;

public class Exercicio4Lista1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("\n===============================================");
        System.out.println("IDENTIFICANDO SE NUMERO PAR OU ÍMPAR");
        System.out.println("===============================================");
        
        System.out.print("\nInforme um Número: ");
        int num = sc.nextInt();

        if (num % 2 == 0){
            System.out.println("\nO número " + num + " é par!");
        } else{
            System.out.println("\nO número " + num + " é ímpar!");
        }
        sc.close();

        System.out.println("\n===============================================");
        System.out.println("FIM!");
        System.out.println("===============================================");    }
}