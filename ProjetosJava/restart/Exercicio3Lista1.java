package restart;

import java.util.Scanner;

public class Exercicio3Lista1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("\n===============================================");
        System.out.println("IDENTIFICANDO O MAIOR NUMERO");
        System.out.println("===============================================");
        
        System.out.print("Informe o Primeiro Número: ");
        int num1 = sc.nextInt();
        System.out.print("\nInforme o Segundo Número: ");
        int num2 = sc.nextInt();
        System.out.print("\nInforme o Terceiro Número: ");
        int num3 = sc.nextInt();

        if ((num1>num2)&&(num1>num3)) {
            System.out.println("\nO maior número é " + num1 + ".");            
        } else {
            if (num2 > num3 ){
                System.out.println("\nO maior número é " + num2 + ".");                
            } else{
                System.out.println("\nO maior número é " + num3 + ".");
            }            
        }
        sc.close();

        System.out.println("\n===============================================");
        System.out.println("FIM!");
        System.out.println("===============================================");       
    }
}