package Aula02;

public class Aula02 {

    public static void main(String args[]) {
        Caneta c1 = new Caneta();
        c1.modelo = "bic";
        c1.cor = "azul";
        //c1.tampa = true;
        c1.destampar();
        c1.status();
    }
}
