package Inheritance;

public class Caine {
    String nume, rasa;

    public Caine(String x, String y) {
        nume=x;
        rasa=y;
    }

    public void setter(String x, String y) {
        this.nume=x;
        this.rasa=y;
    }

    public static void main(String[] args) {
        Caine caine1 = new Caine("Lucky", "Shitzu");
        Caine caine2 = new Caine("Ace", "Rottweiler");
        System.out.println(caine1.nume + " " + caine1.rasa);
        System.out.println(caine2.nume + " " + caine2.rasa);
        caine1.setter("Gina", "Doberman");
        System.out.println(caine1.nume + " " + caine1.rasa);
    }
}
