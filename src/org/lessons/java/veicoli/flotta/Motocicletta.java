package org.lessons.java.veicoli.flotta;

public class Motocicletta extends Veicoli {

    private boolean cavalletto;

    public Motocicletta(String targa, int annoImm, boolean cavalletto ) {
        super(targa, annoImm);
        this.cavalletto = cavalletto;
    }

    public boolean isCavalletto(){

        return cavalletto;
    }

    public String cavallettoToString(){
        if (cavalletto){
            return "con cavalletto";
        } else {
            return "senza cavalletto";
        }
    }

    @Override
    public String toString() {
        return super.toString() +
                "cavalletto=" + cavalletto +
                '}';
    }
}
