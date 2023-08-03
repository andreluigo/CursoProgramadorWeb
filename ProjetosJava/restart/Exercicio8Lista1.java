package restart;

import java.util.Scanner;

public class Exercicio8Lista1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("\n===============================================");
        System.out.println("CALCULANDO ALTURAS E PESOS");
        System.out.println("===============================================");

        int altura = 0;
        int peso = 0;
        int maiorAltura = -1;
        int menorAltura = 1000;
        int maiorPeso = 0;
        int menorPeso = 1000;

        boolean continuar = true;

        while(continuar){
            System.out.print("\nDigite altura ou 0 para sair: ");
            altura = sc.nextInt();
            if (altura!=0){
                System.out.print("\nInforme o peso da criança: ");
                peso = sc.nextInt();
                if (altura > maiorAltura){
                    maiorAltura = altura;
                }
                if (altura < menorAltura){
                    menorAltura = altura;
                }
                if (peso > maiorPeso){
                    maiorPeso = peso;
                }
                if (peso < menorPeso){
                    menorPeso = peso;
            }
            } else {
                continuar = false;
            }
        }

        if (maiorAltura > 0) {
            System.out.println("\nA maior altura do grupo é " + maiorAltura + ".");
            System.out.println("\nA menor altura do grupo é " + menorAltura + ".");
            System.out.println("\nO maior peso do grupo é " + maiorPeso + ".");
            System.out.println("\nA menor peso do grupo é " + menorPeso + ".");            
        }else {
            System.out.println("\nNão foi informada nenhuma altura e nenhum peso!");
        };

        sc.close();

        System.out.println("\n===============================================");
        System.out.println("FIM!");
        System.out.println("==============================================="); 
    }
}
