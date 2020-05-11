package Aula05;
public class Aula05 {
    public static void main(String args[]) {
       ContaBanco p1 = new ContaBanco();
       p1.setNumConta(123456789);
       p1.setDono("Luiz");
       p1.abrirConta("cc");
       p1.estadoAtual();
       
       ContaBanco p2 = new ContaBanco();
       p2.setNumConta(987654321);
       p2.setDono("Marco");
       p2.abrirConta("cp");
       
       p1.estadoAtual();
       p2.estadoAtual();
    }
}
