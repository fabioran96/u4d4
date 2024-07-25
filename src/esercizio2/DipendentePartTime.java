package src.esercizio2;

public class DipendentePartTime extends Dipendente {
    private double pagaOraria;
    private int oreLavorate;

    public DipendentePartTime(String matricola, Dipartimento dipartimento, double pagaOraria, int oreLavorate) {
        super(matricola, dipartimento);
        this.pagaOraria = pagaOraria;
        this.oreLavorate = oreLavorate;
    }

    @Override
    public double calculateSalary() {
        return pagaOraria * oreLavorate;
    }
}

