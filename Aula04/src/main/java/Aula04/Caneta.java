package Aula04;
public class Caneta {
    public String modelo;
    private float ponta;
    private boolean tampa;
    private String cor;
    
    public Caneta(String m, String c, float p){
        this.modelo = m;
        this.cor = c;
        this.ponta = p;
        this.tampar();
    }    
    public String getModelo(){
        return this.modelo;
    }
    public void setModelo(String m){
        this.modelo = m;        
    }
    public float getPonta(){
        return this.ponta;
    }
    public void setPonta(float p){
        this.ponta = p;
    }
    public void tampar(){
    this.tampa = true;
    }
    public void destampar(){
    this.tampa = false;
    }
    public void status(){
        System.out.println("Modelo: " +this.modelo);
        System.out.println("Ponta: " +this.ponta);
        System.out.println("Tampada: " +this.tampa);
        System.out.println("Cor: " +this.cor);
    }
}
