package Aula07;
public class Aula07 {

    public static void main(String args[]) {
        Lutador l[] = new Lutador[6];
        
        //Lutador 1//
        l[0] = new Lutador("Pretty Boy", "França", 31, 1.75f, 68.9f, 11, 2, 1);
        
        //Lutador 2//
        l[1] = new Lutador("Putscript", "Brasil", 29, 1.68f, 57.8f, 14, 2, 3);
        
        //Lutador 3//
        l[2] = new Lutador("Snapshadow", "EUA", 35, 1.65f, 80.9f, 12, 2, 1);
        
        //Lutador 4//
        l[3] = new Lutador("Dead Code", "Austrália", 28, 1.93f, 81.6f, 13, 0, 2);
        
        //Lutador 5//
        l[4] = new Lutador("UFOCobol", "Brasil", 37, 1.70f, 119.3f, 5, 4, 3);
        
        //Lutador 6//
        l[5] = new Lutador("Nerdaart", "EUA", 30, 1.81f, 105.7f, 12, 2, 4);
        
        Luta luta1 = new Luta();
        luta1.marcarLuta(l[0], l[1]);        
        luta1.lutar();
        l[0].status();
        l[1].status();
    }
}
