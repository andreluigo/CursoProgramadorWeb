package algoritmoIdade;

import java.util.Scanner;

/**
 * idade
 */
public class idade {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        double altura = 0;
        //double alturaMedia;
        double alturaMenor = 1000;
        double alturaMaior = 0;
        double somaAltM = 0;
        double somaAltF = 0;
        String sexo = "";
        String sexoMenor = "";
        String sexoMaior = "";
        int meninos = 0;
        int meninas = 0;
        
        System.out.println("Digite a altura do aluno: ");
        altura = sc.nextDouble();
        
        while (altura != 0) {
            System.out.println("Digite o sexo do aluno: ");
            sexo = sc.next();
            if (altura < alturaMenor) {
                alturaMenor = altura;
                if (sexo.equalsIgnoreCase("M")) {
                    meninos = meninos + 1;
                    sexoMenor = sexo;
                    somaAltM = somaAltM + altura;               
                } else {
                    meninas = meninas + 1;
                    sexoMenor = sexo;
                    somaAltF = somaAltF + altura;                        
                }                
            } 
            if (altura > alturaMaior) {
                alturaMaior = altura;
                if (sexo.equalsIgnoreCase("M")) {
                            meninos = meninos + 1;
                            sexoMaior = sexo;
                            somaAltM = somaAltM + altura;               
                        } else {
                            meninas = meninas + 1;
                            sexoMaior = sexo;
                            somaAltF = somaAltF + altura;                        
                        }
            }
            System.out.println("Digite a altura do aluno: ");
            altura = sc.nextDouble();            
        }
        sc.close();
        if (sexo != "") {
            System.out.println("Aluno mais alto é do sexo " + sexoMaior + " e mede " + alturaMaior + "!");
            System.out.println("Aluno mais baixo é do sexo " + sexoMenor + " e mede " + alturaMenor + "!");
            System.out.println("Altura média dos meninos é " + somaAltM/meninos + "!");
            System.out.println("Altura média das meninas é " + somaAltF/meninas + "!");
            
            
            //String.format("Aluno mais alto é do sexo %s e mede %d!", sexoMaior, alturaMaior);
            //String.format("Aluno mais baixo é do sexo %s e mede %d!", sexoMenor, alturaMenor);
            //String.format("Altura média dos meninos é %d!", somaAltM/meninos);
            //String.format("Altura média das meninas é %d!", somaAltF/meninas);
            
            
        } else {
            System.out.println("Não foram registradas medidas!");
            
        }
    }
}