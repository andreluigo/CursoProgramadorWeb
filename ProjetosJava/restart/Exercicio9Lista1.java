package restart;

import java.util.Scanner;

public class Exercicio9Lista1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("\n===============================================");
        System.out.println("CALCULANDO MÉDIA DE ALTURAS E PESOS");
        System.out.println("===============================================");

        int altura = 0;
        String sexo;
        int maiorAltura = -1;
        String sexoMaiorAltura = "";
        int menorAltura = 1000;
        String sexoMenorAltura = "";
        int contadorMeninos = 0;
        int contadorMeninas = 0;
        int acumuladorMeninos = 0;
        int acumuladorMeninas = 0;
        int mediaAlturaM = 0;
        int mediaAlturaF = 0;
        boolean continuar = true;

        while(continuar){
            System.out.print("\nDigite altura ou 0 para sair: ");
            altura = sc.nextInt();
            if (altura!=0){
                System.out.print("\nInforme o sexo da criança (M ou F): ");
                sexo = sc.next();
                if (altura > maiorAltura){
                    maiorAltura = altura;
                    sexoMaiorAltura = sexo;
                }
                if (altura < menorAltura){
                    menorAltura = altura;
                    sexoMenorAltura = sexo;
                }
                if (sexo.equalsIgnoreCase("M")){
                    contadorMeninos +=1;
                    acumuladorMeninos += altura;
                }else{
                    contadorMeninas +=1;
                    acumuladorMeninas += altura;
                }                
            } else {
                continuar = false;
            }
        }

        if (maiorAltura > 0) {
            System.out.println("\nSexo e altura da pessoa mais alta: " + sexoMaiorAltura + " - " + maiorAltura + ".");
            System.out.println("\nSexo e altura da pessoa mais baixa: " + sexoMenorAltura + " - " + menorAltura + ".");
            
            if (contadorMeninos > 0){
                mediaAlturaM = acumuladorMeninos/contadorMeninos;
                System.out.println("\nA média de altura dos meninos é " + mediaAlturaM + ".");
            }else{
                System.out.println("\nNão foram analisadas crianças do sexo Masculino!");
            }
            if (contadorMeninas > 0){
                mediaAlturaF = acumuladorMeninas/contadorMeninas;
                System.out.println("\nA média de altura das meninas é " + mediaAlturaF + ".");
            }else{
                System.out.println("\nNão foram analisadas crianças do sexo Feminino!");
            }

        }else {
            System.out.println("\nNão foi informada nenhuma altura e nenhum peso!");
        };

        sc.close();

        System.out.println("\n===============================================");
        System.out.println("FIM!");
        System.out.println("==============================================="); 
    }
}
