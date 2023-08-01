package org.lessons.java.veicoli.flotta;

public class Automobile extends Veicoli{

    private int portiere;

    public Automobile(String targa , int annoImm, int portiere){
        // invoco costruttore con parametri della superclasse Veicolo
        super( targa ,annoImm);
        // assegno valore agli attributi propri di Automobile
        this.portiere = portiere;
    }

    public int getPortiere(){
        return portiere;
    }

    //super.toString per richiamare i metodi di veicoli
    @Override
    public String toString() {
        return super.toString() + "portiere=" + portiere +
                '}';
    }
}
