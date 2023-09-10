package aula04;

public class Caneta {
    
    public String modelo;
    private float ponta;
    private String cor;
    private boolean tampada;
    
    public Caneta(String modelo, float ponta, String cor){
        this.modelo = modelo;
        this.ponta = ponta;
        this.cor = cor;
        tampar();
                
    }

    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
        
    public float getPonta() {
        return ponta;
    }
    public void setPonta(float ponta) {
        this.ponta = ponta;
    }

    public void setCor(String cor){
        this.cor = cor;
    }
    
    public String getCor(){
        return cor;
    }
    
    public boolean tampar(){
        return this.tampada = true;
    }

    public boolean destampar(){
        return this.tampada = false;
    }

    public String statusTampa (){
        if (this.tampada){
            return "Sim";
        } else {
            return "Não";
        }
    }

    public void status(){
        System.out.println("\n=============================");
        System.out.println("Informações da Caneta:");
        System.out.println("Modelo: " + modelo);
        System.out.println("Ponta: " + ponta);
        System.out.println("Cor da Caneta: " + cor);
        System.out.println("Caneta Tampada? " + statusTampa());
        System.out.println("=============================");
    }

}
