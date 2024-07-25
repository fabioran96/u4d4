package src.esercizio3;

public class Dirigente extends Dipendente {
    private double stipendioMensile;
    private double bonus;

    public Dirigente(String matricola, Dipartimento dipartimento, double stipendioMensile, double bonus) {
        super(matricola, dipartimento);
        this.stipendioMensile = stipendioMensile;
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return stipendioMensile + bonus;
    }
}

