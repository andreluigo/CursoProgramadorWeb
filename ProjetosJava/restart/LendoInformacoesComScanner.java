package restart;
import java.util.Scanner;

public class LendoInformacoesComScanner {
    public static void main(String[] args) {
        
        System.out.println("\n==============================================");
        System.out.println("EXERCITANDO ENTRADA DE DADOS PELO USUARIO");
        System.out.println("==============================================");
        
        Scanner leituraScanner = new Scanner(System.in);

        System.out.print("Digite uma distância: ");
        double distanciaPercorrida = leituraScanner.nextDouble();
        System.out.println("\nA distância percorrida foi de " + distanciaPercorrida + " KM!");
        System.out.print("\nDigite o tempo gasto: ");
        double tempoGasto = leituraScanner.nextDouble();
        //int horas = ((int)tempoGasto);
        System.out.println("\nO tempo gasto foi de " + tempoGasto + " horas !");
        System.out.printf("\nA velocidade média foi de %.2f Km/h!\n", distanciaPercorrida/tempoGasto);
        leituraScanner.close();
        System.out.println("==============================================");
    }
}