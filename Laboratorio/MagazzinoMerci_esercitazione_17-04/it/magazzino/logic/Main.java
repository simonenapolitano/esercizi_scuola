import java.util.Scanner;

public class Main {
    public Main(){
        Scanner scanner = new Scanner(System.in);
        Pila pila = new Pila();
        String codice, descrizione;
        Double peso;
        while(true){
            System.out.println("[1]Registra un nuovo pacco\n[2]Preleva un pacco\n[3]Conta i pacchi in magazzino\n[4]Stampa i dati del pacco in cima\n[5]Stampa il peso totale dei pacchi spediti fino ad adesso\n[6]Cerca un pacco\n[7]Conta i pacchi oltre una certa soglia di peso\n[0]Esci");
            int scelta = scanner.nextInt();
            scanner.nextLine();
            switch (scelta) {
                case 0:
                    System.exit(0);
                    scanner.close();
                case 1:
                    System.out.println("Inserisci il codice del pacco: ");
                    codice = scanner.nextLine();
                    System.out.println("Inserisci la descrizione del pacco: ");
                    descrizione = scanner.nextLine();
                    System.out.println("Inserisci il peso del pacco");
                    peso = scanner.nextDouble();
                    scanner.nextLine();
                    pila.push(new Pacco(codice, descrizione, peso));
                    break;
                case 2:
                    System.out.println("Pacco spedito:\n" + pila.pop());
                    break;
                case 3:
                    System.out.println("Ci sono " + pila.contaPacchi() + " pacchi in magazzino");
                    break;
                case 4:
                    System.out.println("Il pacco in cima: " + pila.stampaTop());
                    break;
                case 5:
                    System.out.println("Peso dei pacchi spediti fino ad adesso: " + pila.getPesoTotale());
                    break;
                case 6:
                    System.out.println("Inserisci il codice del pacco: ");
                    codice = scanner.nextLine();
                    System.out.println("Il pacco e' " + pila.cercaPacco(codice));
                    break;
                case 7:
                    System.out.println("Inserisci la soglia di peso: ");
                    peso = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.println("Ci sono " + pila.contaPacchiPesanti(peso) + " pacchi oltre la soglia di peso");
                    break;
                default:
                    System.out.println("<!>Scelta |" + scelta + "| non valida<!>");
                    break;
            }
        }
    }

    public static void main(String[] args) {
        new Main();
    }
}
