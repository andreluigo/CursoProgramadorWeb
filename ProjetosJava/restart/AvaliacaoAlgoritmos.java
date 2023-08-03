package restart;

import java.util.Scanner;

public class AvaliacaoAlgoritmos {
    public static void main(String[] args) {
        
        Scanner leituraScanner = new Scanner(System.in);
        System.out.println("\n==============================================================");
        System.out.println("AVALIAÇÃO DE ALGORÍTMOS E LÓGICA DE PROGRAMAÇÃO!");
        System.out.println("==============================================================");
        float tempC;
        float tempF;
        boolean continuar = true;
        while(continuar){
            System.out.print("\n- Informe a temperatura em graus Celsius ou 0 para sair: ");
            tempC = leituraScanner.nextFloat();
            if (tempC == 0) {
                continuar = false;
            } else {
                tempF = ((tempC * 9)/5) + 32;
                System.out.printf("\n=> %.2f °C correspondem a %.2f °F!\n", tempC, tempF);              
            }
        }
        leituraScanner.close();
        System.out.println("\n==============================================================");
        System.out.println("FIM!");
        System.out.println("==============================================================");
    }
}