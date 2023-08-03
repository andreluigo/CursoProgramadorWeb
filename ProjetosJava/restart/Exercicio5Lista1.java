package restart;

import java.util.Scanner;

public class Exercicio5Lista1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("\n===============================================");
        System.out.println("CALCULANDO MÉDIA");
        System.out.println("===============================================");
        
        System.out.print("\nInforme o Primeiro Número: ");
        int num1 = sc.nextInt();
        System.out.print("\nInforme o Segundo Número: ");
        int num2 = sc.nextInt();
        System.out.print("\nInforme o Terceiro Número: ");
        int num3 = sc.nextInt();
    
        double media = (num1 + num2 + num3)/3;

        System.out.println("\nA média dos números informados é " + media + "!");
    
        sc.close();

        System.out.println("\n===============================================");
        System.out.println("FIM!");
        System.out.println("===============================================");  
    }
}
