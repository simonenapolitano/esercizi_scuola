public class Main{
    Prodotto[] prodotti = new Prodotto[10];
    public Main(){
        prodotti[0] = new Prodotto("A0", "Patatine", 2.50, 3);
        prodotti[1] = new Prodotto("A1", "Biscotti", 1.99, 2);
        prodotti[2] = new Prodotto("A2", "Crackers", 1.50, 4);
        prodotti[3] = new Prodotto("B0", "Cioccolato", 3.50, 7);
        prodotti[4] = new Prodotto("B1", "Tramezzino", 5.50, 6);
        prodotti[5] = new Prodotto("B2", "Barretta", 3.20, 4);
        prodotti[6] = new Prodotto("C0", "Coca-Cola", 2.99, 1);
        prodotti[7] = new Prodotto("C1", "Acqua", 1.99,8);
        prodotti[8] = new Prodotto("C2", "Fanta", 2.99, 5);
        prodotti[9] = new Prodotto("D0", "Croissant", 1.99, 7);
        for (int i = 0; i < prodotti.length; i++) {
            System.out.println("Prodotto " + prodotti[i].getCodiceProdotto() + ":   " + prodotti[i].getNomeProdotto() + "   " + prodotti[i].getPrezzo() + " euro    " + prodotti[i].getQuantita());
        }
    }
    public static void main(String[] args){
        new Main();
    }
}