package Aula11;
public class Aula11 {
    public static void main(String args[]) {
        Aluno a1 = new Aluno();
        a1.setNome("Luiz");
        a1.setMatricula(123123);
        a1.setCurso("informatica");
        a1.setIdade(23);
        a1.setSexo("M");
        a1.pagarMens();
        
        Bolsista b1 = new Bolsista();
        b1.setNome("Marco");
        b1.setMatricula(456456);
        b1.setCurso("Engenharia");
        b1.setIdade(20);
        b1.setSexo("M");
        b1.pagarMens();
        
        
    }
}
