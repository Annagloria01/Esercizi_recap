package Canzone;

import java.util.ArrayList;
import java.util.List;

public class Playlist {

    private List<Canzone> listaCanzoni = new ArrayList<>();

    public void aggiungiCanzone(Canzone canzone) {
        listaCanzoni.add(canzone);
    }

    public void rimuoviCanzone(String titolo) {
        for (Canzone elemento : listaCanzoni) {
            if (titolo.equals(elemento.getTitolo())) {
                listaCanzoni.remove(elemento);
            }
        }
    }

    public void stampaPlaylist() {
        for (Canzone elemento : listaCanzoni) {
            System.out.println(elemento.toString());
        }
    }

    public int calcolaDurataTotale(){
        int durataTotale = 0;
        for (Canzone elemento : listaCanzoni) {
            durataTotale+=elemento.getDurata();
        }
        return durataTotale;

    }
}
