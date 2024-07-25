package src.esercizio2;

public class Main {
    public static void main(String[] args) {
        Dipendente[] dipendenti = {
                new DipendenteFullTime("D001", Dipendente.Dipartimento.PRODUZIONE, 2500.00),
                new DipendentePartTime("D002", Dipendente.Dipartimento.AMMINISTRAZIONE, 20.00, 120),
                new Dirigente("D003", Dipendente.Dipartimento.VENDITE, 3000.00, 1000.00)
        };

        double totaleStipendi = 0;

        for (Dipendente dipendente : dipendenti) {
            System.out.println("Matricola: " + dipendente.getMatricola() + ", Stipendio: " + dipendente.calculateSalary());
            totaleStipendi += dipendente.calculateSalary();
        }

        System.out.println("Totale stipendi: " + totaleStipendi);
    }
}

