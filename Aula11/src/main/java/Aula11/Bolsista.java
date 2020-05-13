package Aula11;

public class Bolsista extends Aluno {
    private int bolsa;
    
    public void renovarBolsa(){
        System.out.println("renovando bolsa de " +this.getNome());
    }
    
    @Override
    public void pagarMens(){
        System.out.println(this.getNome() + " é bolsista! Pagamento efetuado!");
    }
    
}
