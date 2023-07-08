package aula04;

public class Aula04 {
    public static void main(String[] args) {
        Caneta c1 = new Caneta ("Uniball", 1.0f, "Vermelha");
        
        //c1.setModelo("Energel");
        //c1.setPonta(0.7f);
        c1.destampar();

        Caneta c2 = new Caneta("Pentel", 0.5f, "Preta");

        c1.status();
        c2.status();

    }

}
    


