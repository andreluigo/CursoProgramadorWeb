package restart;
import java.util.Scanner;

public class NumeroMaior {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("\n==========================================");
        System.out.println("VERIFICAÇÃO DE NÚMEROS");
        System.out.println("==========================================");
        System.out.print("Digite o primeiro número: ");
        int n1 = sc.nextInt();
        System.out.print("\nDigite o segundo número: ");
        int n2 = sc.nextInt();
        System.out.print("\nDigite o terceiro número: ");
        int n3 = sc.nextInt();
        if (n1 > n2) {
            if (n1 > n3) {
                System.out.println("\nO maior número digitado é " + n1);                
            } else{
                System.out.println("\nO maior número digitado é " + n3);                
            }            
        } else {
            if (n2 > n3){
                System.out.println("\nO maior número digitado é " + n2);
            } else{
                System.out.println("\nO maior número digitado é " + n3);
            }
        }
        sc.close();
        System.out.println("==========================================");
    }
}
