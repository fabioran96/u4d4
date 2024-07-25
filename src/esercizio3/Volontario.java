package src.esercizio3;

public class Volontario implements Checkin {
    private String nome;
    private int eta;

    public Volontario(String nome, int eta) {
        this.nome = nome;
        this.eta = eta;
    }

    public String getNome() {
        return nome;
    }

    public int getEta() {
        return eta;
    }

    @Override
    public void checkin() {
        System.out.println("Volontario " + nome + " ha iniziato il servizio.");
    }
}
