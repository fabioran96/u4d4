package src.esercizio3;

public abstract class Dipendente implements Checkin {
    private String matricola;
    private Dipartimento dipartimento;

    public enum Dipartimento {
        PRODUZIONE,
        AMMINISTRAZIONE,
        VENDITE
    }

    public Dipendente(String matricola, Dipartimento dipartimento) {
        this.matricola = matricola;
        this.dipartimento = dipartimento;
    }

    public String getMatricola() {
        return matricola;
    }

    public Dipartimento getDipartimento() {
        return dipartimento;
    }

    public void setDipartimento(Dipartimento dipartimento) {
        this.dipartimento = dipartimento;
    }

    public abstract double calculateSalary();

    @Override
    public void checkin() {
        System.out.println("Dipendente " + matricola + " ha iniziato il turno di lavoro.");
    }
}


