package restart;

import java.util.Scanner;

public class Exercicio6Lista1 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("\n===============================================");
        System.out.println("CALCULANDO MÉDIA DE ALTURA");
        System.out.println("===============================================");
        
        int altura = 0;
        int somaAltura = 0;
        int qtde = 0;
        boolean continuar = true;
    
        while(continuar){
            System.out.print("\nDigite a altura ou 0 para sair: ");
            altura = sc.nextInt();
    
            if (altura !=0) {
                somaAltura += altura;
                qtde += 1;
            } else {
                continuar = false;
            }
        }
    
        if (qtde > 0) {
            System.out.println("\nA média de altura dos alunos é " + somaAltura/qtde + "!");  
        }else {
            System.out.println("\nNão foi informada nenhuma altura!");
        };            
    
        sc.close();
    
        System.out.println("\n===============================================");
        System.out.println("FIM!");
        System.out.println("==============================================="); 
    }        
}