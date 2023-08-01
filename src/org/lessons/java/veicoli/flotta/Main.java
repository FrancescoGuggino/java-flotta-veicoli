package org.lessons.java.veicoli.flotta;

public class Main {
    public static void main(String[] args) {
        Automobile a1 = new Automobile("aaa100qw", 2020, 5);
        Automobile a2 = new Automobile("bfi756ew", 2018, 4);
        Automobile a3 = new Automobile("abr543ps", 2000, 2);

        Motocicletta m1 = new Motocicletta("kst639sf", 2012, true);
        Motocicletta m2 = new Motocicletta("gfd476ik", 2011, false);
        Motocicletta m3 = new Motocicletta("mat628pq", 2019, true);

        //creo gestore flotta
        GestoreFlotta gestoreFlotta = new GestoreFlotta();
        gestoreFlotta.aggiungiVeicolo(a1);
        gestoreFlotta.aggiungiVeicolo(a2);
        gestoreFlotta.aggiungiVeicolo(a3);
        gestoreFlotta.aggiungiVeicolo(m1);
        gestoreFlotta.aggiungiVeicolo(m2);

        System.out.println("automobili: " + gestoreFlotta.contaVeicoliPerTipo("automobile"));
        System.out.println("motocicletta: " + gestoreFlotta.contaVeicoliPerTipo("motocicletta"));


    }
}
