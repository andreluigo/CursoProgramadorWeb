package restart;

import java.util.Scanner;

public class EstruturaDeDecisaoSwitch {
    public static void main(String[] args) {
        Scanner leituraScanner = new Scanner(System.in);

        System.out.println("\n==============================================");
        System.out.println("ESTRUTURA DE DECISÃO: SWITCH!");
        System.out.println("==============================================");
        System.out.print("Informe o dia da semana (número): ");
        int diaDaSemana = leituraScanner.nextInt();
        String nomeDoDiaDaSemana = " ";
        switch(diaDaSemana){
            case 1: nomeDoDiaDaSemana = "Domingo";
                break;
            case 2: nomeDoDiaDaSemana = "Segunda-feira";
                break;
            case 3: nomeDoDiaDaSemana = "Terça-feira";
                break;
            case 4: nomeDoDiaDaSemana = "Quarta-feira";
                break;
            case 5: nomeDoDiaDaSemana = "Quinta-feira";
                break;
            case 6: nomeDoDiaDaSemana = "Sexta-feira";
                break;
            case 7: nomeDoDiaDaSemana = "Sábado";
                break;
            default: nomeDoDiaDaSemana = "[Não encontrado!]";            
        }
        System.out.println("O dia da semana é " + nomeDoDiaDaSemana + ".");
        leituraScanner.close();

        System.out.println("==============================================");
        System.out.println("FIM!");
        System.out.println("==============================================");
    }
}