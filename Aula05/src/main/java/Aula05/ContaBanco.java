package Aula05;

public class ContaBanco {

    //Atributos
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    //Metodos
    public void estadoAtual(){
        System.out.println("-----------------------------");
        System.out.println("Conta: " +this.getNumConta());
        System.out.println("Tipo: " +this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
    
    }
    
    public void abrirConta(String t) {
        this.setTipo(t);
        this.setStatus(true);
        if (t == "cc") {
            this.setSaldo(50);
        } else if (t == "cp") {
            this.setSaldo(150);
        }
    }

    public void fecharConta() {
        if (saldo > 0){
            System.out.println("Dinheiro na conta! Não pode ser fechada!");
        } else if (saldo < 0){
            System.out.println("Conta em debito! Não pode ser fechada!");
        } else {
            this.setStatus(false);
            System.out.println("Conta fechada com Sucesso!");
        }
    }

    public void sacar(float v) {
        if(status == true){
            if(saldo > v){
                saldo = saldo - v;
                System.out.println("Saldo atual: " +getSaldo());
            }else{
                System.out.println("Saldo insuficiente!");
            }
        }else{
            System.out.println("Impossivel sacar! conta fechada!");
        }
    }

    public void depositar(float v) {
        if (status == true){
            this.setSaldo(getSaldo() + v);
            System.out.println("Saldo atual: " +getSaldo());
        }else{
            System.out.println("Impossivel depositar");
        }

    }

    public void pagarMensal() {
        int v = 0;
        if (this.getTipo() == "cc"){
            v = 20;
        }else if (this.getTipo() == "cp"){
            v = 12;
        }
        if (this.getStatus() == true){
            if(this.getSaldo() > v){
                saldo = saldo - v;
                System.out.println("Mensalidade paga!");
            }else{
                System.out.println("Saldo insuficiente!");
            }
        }
    }

    //Especiais
    public ContaBanco() {
        this.saldo = 0;
        this.status = false;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

}
