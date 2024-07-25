package src.esercizio3;

public class Main {
    public static void main(String[] args) {
        Dipendente[] dipendenti = {
                new DipendenteFullTime("D001", Dipendente.Dipartimento.PRODUZIONE, 2500.00),
                new DipendentePartTime("D002", Dipendente.Dipartimento.AMMINISTRAZIONE, 20.00, 120),
                new Dirigente("D003", Dipendente.Dipartimento.VENDITE, 3000.00, 1000.00)
        };

        Volontario[] volontari = {
                new Volontario("Mario Rossi", 35),
                new Volontario("Giulia Bianchi", 28)
        };

        Checkin[] persone = new Checkin[dipendenti.length + volontari.length];
        System.arraycopy(dipendenti, 0, persone, 0, dipendenti.length);
        System.arraycopy(volontari, 0, persone, dipendenti.length, volontari.length);

        for (Checkin persona : persone) {
            persona.checkin();
        }
    }
}
