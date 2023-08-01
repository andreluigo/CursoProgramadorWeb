package restart;

import java.util.Scanner;

public class EstruturasDeRepeticao {
    public static void main(String[] args) {
        
        Scanner leituraScanner = new Scanner(System.in);
        
        System.out.println("\n==========================================");
        System.out.println("ESTRUTURAS DE DECISÃO");
        System.out.println("==========================================");

        System.out.print("Informe o preço do produto: ");
        double precoDoProduto = leituraScanner.nextDouble();
        boolean produtoAltoValor = precoDoProduto >= 100;
        double percenturalDesconto = 0.0;
        
        if (produtoAltoValor){
            percenturalDesconto = 5.0;
        } else{
            System.out.println("Não será aplicado desconto algum!");
        }
        
        double desconto = (precoDoProduto *percenturalDesconto) / 100;
        double precoComDesconto = precoDoProduto - desconto;

        System.out.printf("O produto sairá por R$ %.2f!", precoComDesconto);

        System.out.println("\n==========================================");
        System.out.println("FIM!");
        System.out.println("==========================================");

        leituraScanner.close();
    }
}