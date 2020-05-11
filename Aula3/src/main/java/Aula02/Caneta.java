package Aula02;
public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampa;
    
    public void status(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Tampa: " + this.tampa);
        
    }    
    public void rabiscar(){
        if (this.tampa == true){
            System.out.println("ERRO");
        }else{
            System.out.println("Estou rabiscando.");
        }  
    }
    public void tampar(){
        this.tampa = true;
    }
    public void destampar(){
        this.tampa = false;        
    }    
}
