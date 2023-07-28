package restart;

public class Variaveis {
    public static void main(String[] args) {
        System.out.println("\n==================================================");
        System.out.println("EXERCITANDO VARIÁVEIS");
        System.out.println("==================================================");

        double precoProduto = 115.0;
        
        System.out.println("O preço do produto é de " + precoProduto + " reais!");

        double percentualDesconto = 5.0;

        System.out.println("O desconto será de " + percentualDesconto + "%!");

        double desconto = precoProduto * percentualDesconto / 100;
        double  precoComDesconto = precoProduto - desconto;
        
        System.out.println("Com desconto, o produto sai " + "por R$ " + precoComDesconto + ".");
        System.out.println("==================================================");
        System.out.println("FIM!");
        System.out.println("==================================================");        
    }
}