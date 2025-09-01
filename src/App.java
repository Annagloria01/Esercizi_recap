
import Prodotto.Prodotto;

public class App {
    public static void main(String[] args) {

        Prodotto shampoo = new Prodotto("Elvive");
        Prodotto cremaSolare= new Prodotto("Bilboa");
        Prodotto phon = new Prodotto("Bellaoggi");

        shampoo.infoProdotto();
        cremaSolare.infoProdotto();
        phon.infoProdotto();
        System.out.println(Prodotto.getNumeroProdottiCreati());

        System.out.println(shampoo.toString());

       
    }
}
