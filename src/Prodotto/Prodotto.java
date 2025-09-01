package Prodotto;

public class Prodotto {

    private String nome;
    private int codiceProdotto;
    private static int CONTATORE_PRODOTTI;

    public Prodotto(String nome) {
        this.nome = nome;
        this.codiceProdotto = CONTATORE_PRODOTTI;
        CONTATORE_PRODOTTI++;
    }

    public static int getNumeroProdottiCreati() {
        return CONTATORE_PRODOTTI;
    }

    public void infoProdotto() {
        System.out.println("Nome prodotto: " + nome + " il codice del prodotto è: " + codiceProdotto);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodiceProdotto() {
        return codiceProdotto;
    }

    public void setCodiceProdotto(int codiceProdotto) {
        this.codiceProdotto = codiceProdotto;
    }

}
