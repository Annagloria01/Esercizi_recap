package Animale;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Animale> animali = new ArrayList<>();

        Animale leone = new Leone();
        Animale elefante = new Elefante();
        Animale serpente = new Serpente();

        animali.add(leone);
        animali.add(serpente);
        animali.add(elefante);

        for(Animale elemento : animali){
            elemento.emettiVerso();
        }

    }
}
