package restart;

public class OperadoresRelacionais {
    public static void main(String[] args) {
        System.out.println("\n================================================================");
        System.out.println("OPERADORES RELACIONAIS");
        System.out.println("================================================================");
        int primeiraVariavel = 1;
        int segundaVariavel = 1;
        System.out.println("O valor da primeira variável é " + primeiraVariavel + " e o da segunda variável é " + segundaVariavel + ".");
        boolean primeiraVariavelEMaiorQueASegunda = primeiraVariavel > segundaVariavel;
        System.out.println("Primeira variável é maior que a segunda? " + primeiraVariavelEMaiorQueASegunda);
        boolean primeiraVariavelEMenorQueASegunda = primeiraVariavel < segundaVariavel;
        System.out.println("Primeira variável é menor que a segunda? " + primeiraVariavelEMenorQueASegunda);
        boolean primeiraVariavelEMaiorIgualASegunda = primeiraVariavel >= segundaVariavel;
        System.out.println("Primeira variável é maior ou igual a segunda? " + primeiraVariavelEMaiorIgualASegunda);
        boolean primeiraVariavelEMenorIgualASegunda = primeiraVariavel <= segundaVariavel;
        System.out.println("Primeira variável é menor ou igual a segunda? " + primeiraVariavelEMenorIgualASegunda);        
        System.out.println("================================================================");
    }
}