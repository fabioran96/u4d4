package src.esercizio3;

public class DipendenteFullTime extends Dipendente {
    private double stipendioMensile;

    public DipendenteFullTime(String matricola, Dipartimento dipartimento, double stipendioMensile) {
        super(matricola, dipartimento);
        this.stipendioMensile = stipendioMensile;
    }

    @Override
    public double calculateSalary() {
        return stipendioMensile;
    }
}

