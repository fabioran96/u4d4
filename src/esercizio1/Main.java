package src.esercizio1;

public class Main {
    public static void main(String[] args) {
        // Creazione di tre istanze di Dipendente
        Dipendente dipendente1 = new Dipendente("D001", 2500.00, Dipendente.Dipartimento.PRODUZIONE);
        Dipendente dipendente2 = new Dipendente("D002", 3000.00, Dipendente.Dipartimento.AMMINISTRAZIONE);
        Dipendente dipendente3 = new Dipendente("D003", 2700.00, Dipendente.Dipartimento.VENDITE);

        // Creazione di un array di dipendenti
        Dipendente[] dipendenti = {dipendente1, dipendente2, dipendente3};

        // Iterazione su ogni dipendente e stampa della matricola
        for (Dipendente dipendente : dipendenti) {
            System.out.println("Matricola: " + dipendente.getMatricola());
        }
    }
}

