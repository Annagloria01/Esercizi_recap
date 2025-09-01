package Canzone;

public class Main {
    public static void main(String[] args) {
        Canzone canzone = new Canzone("Italodisco",130);
        Canzone canzone2 = new Canzone("La noia",125);
        Canzone canzone3 = new Canzone("Sara",300);

        Playlist playlist = new Playlist();
        playlist.aggiungiCanzone(canzone);
        playlist.aggiungiCanzone(canzone2);
        playlist.aggiungiCanzone(canzone3);

        playlist.stampaPlaylist();

        playlist.rimuoviCanzone("La noia");

        System.out.println("------------");
        playlist.stampaPlaylist();

        System.out.println("La durata totale è: " + playlist.calcolaDurataTotale());
    }
}
