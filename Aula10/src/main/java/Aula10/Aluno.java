package Aula10;

public class Aluno extends Pessoa {

    private String curso;
    private int matricula;

    public void cancelarMatricula() {
        System.out.println("Matricula cancelada!");
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

}
