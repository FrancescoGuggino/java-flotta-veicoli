package org.lessons.java.veicoli.flotta;

import java.util.ArrayList;
import java.util.List;

public class GestoreFlotta {

    // attributi

    //meglio inizializzare nei construttori non inline
    private List<Veicoli> listaVeicoli;

    //costruttori

    // inizializzo la lista veicoli come lista vuota che è meglio di null
    public GestoreFlotta(){
        listaVeicoli = new ArrayList<>();
    }

    // getter setter


    // metodi
    // aggiungi veicolo alla flotta
    public void aggiungiVeicolo(Veicoli veicoli){
        // to do
        String targa = veicoli.getTarga();
        if (trovaVeicoloPerTarga(targa) != null){
            throw new IllegalArgumentException("veicolo con targa " + targa + " è presente nella lista!");
        }
        listaVeicoli.add(veicoli);
    }

    public int contaVeicoloPerTipo(String tipo) throws IllegalArgumentException {


        if (!tipo.equals("automobile") && !tipo.equals("motocicletta")) {
            throw new IllegalArgumentException("tipo non valido " + tipo);
        }

        // fare contatore auto e moto o un contatore unico così
        int count = 0;
        //itero su tutti i veicoli con for
        for (Veicoli veicoli : listaVeicoli) {
            switch (tipo) {
                case "automobile":
                    //conto le automobile
                    if (veicoli instanceof Automobile) {
                        count++;
                    }
                    break;
                case "motocicletta":
                    // conto motociclette
                    if (veicoli instanceof Motocicletta) {
                        count++;
                    }
                    break;
                default:
                    break;
            }
            return count;
        }


        //trovare un veicolo specifico tramite numero targa
        public Veicoli trovaVeicoloPerTarga (String targa){
            boolean trovato = false;
            int contatore = 0;
            Veicoli veicoloCercato = null;
            while (!trovato && contatore < listaVeicoli.size()) {
                if (targa.equals(listaVeicoli.get(contatore).getTarga())) {
                    //trovato!
                    veicoloCercato = listaVeicoli.get(contatore);
                    trovato = true;
                }
                contatore++;
            }
            return veicoloCercato;
        }
    }
