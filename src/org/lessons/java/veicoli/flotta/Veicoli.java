package org.lessons.java.veicoli.flotta;

public abstract class Veicoli {


   private String targa;

   private int annoImm;


    public Veicoli(String targa, int annoImm) {
        this.targa = targa;
        this.annoImm = annoImm;
    }

    public String getTarga() {
        return targa;
    }


    public int getAnnoImm() {
        return annoImm;
    }


    @Override
    public String toString() {
        return "targa='" + targa + '\'' +
                ", annoImm=" + annoImm +
                '}';
    }
}

