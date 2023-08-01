package restart;

public class OperadoresLogicos {
    public static void main(String[] args) {
        
        System.out.println("\n========================================================================================");
        System.out.println("OPERADORES LÓGICOS");
        System.out.println("========================================================================================");
        
        boolean usuarioVip = true;
        boolean comprasAltoValor = true;
        boolean menorDeIdade = true;
        boolean temBebidaAlcoolicaNoCarrinho = true;
        System.out.println("Usuário é VIP?" + usuarioVip);
        System.out.println("A compra tem um valor alto? " + comprasAltoValor);
        System.out.println("Cliente é menor de Idade? " + menorDeIdade);
        System.out.println("Tem bebida alcóolica no carrinho? " + temBebidaAlcoolicaNoCarrinho);
        System.out.println("========================================================================================");
        
        boolean aplicarDesconto = usuarioVip && comprasAltoValor;
        
        System.out.println("O desconto deve ser aplicado? " + "(usuarioVIP && comprasAltoValor):" + aplicarDesconto);
        aplicarDesconto = usuarioVip || comprasAltoValor;
        System.out.println("O desconto deve ser aplicado? " + "(usuarioVIP || comprasAltoValor):" + aplicarDesconto);
        boolean permiteConcluirCompra = !menorDeIdade || !temBebidaAlcoolicaNoCarrinho;
        System.out.println("Pode conculir a compra? " + "(!menorDeIdade || !naoTemBebidaAlcoolicaNoCarrinho):" + permiteConcluirCompra);
        
        System.out.println("========================================================================================");
        System.out.println("FIM!");
        System.out.println("========================================================================================");        
    }
}
