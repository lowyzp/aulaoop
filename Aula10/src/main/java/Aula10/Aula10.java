package Aula10;
public class Aula10 {

    public static void main(String args[]) {
        
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();
        
        p1.setNome("Marco");
        p2.setNome("Luiz");
        p3.setNome("Ale");
        p4.setNome("Cib");
        
        p2.setCurso("Engenharia");
        p3.setSalario(1400.4f);
        p4.setSetor("Estoque");
        
    }

    
}
