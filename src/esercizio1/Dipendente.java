package src.esercizio1;

public class Dipendente {
    private String matricola;
    private double stipendio;
    private Dipartimento dipartimento;

    public enum Dipartimento {
        PRODUZIONE,
        AMMINISTRAZIONE,
        VENDITE
    }

    // Costruttore
    public Dipendente(String matricola, double stipendio, Dipartimento dipartimento) {
        this.matricola = matricola;
        this.stipendio = stipendio;
        this.dipartimento = dipartimento;
    }

    // Getter per matricola
    public String getMatricola() {
        return matricola;
    }

    // Getter per stipendio
    public double getStipendio() {
        return stipendio;
    }

    // Getter per dipartimento
    public Dipartimento getDipartimento() {
        return dipartimento;
    }

    // Setter per dipartimento
    public void setDipartimento(Dipartimento dipartimento) {
        this.dipartimento = dipartimento;
    }
}

