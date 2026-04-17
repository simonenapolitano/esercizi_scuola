public class Pila {
    private Pacco first;
    private Double pesoSpedito;
    
    public Pila(){
        this.first = null;
        this.pesoSpedito = 0.0;
    }

    public void push(Pacco p){
        if(first == null){
            first = p;
        } else{
            p.setNext(first);
            first = p;
        }
    }

    public String pop(){
        Pacco p;
        if(first == null){
            return "<!>Il magazzino e' vuoto<!>";
        }
        p = first;
        first = p.getNext();
        this.pesoSpedito = p.getPeso();
        return p.toString();
    }

    public String stampaTop(){
        if(first == null){
            return "<!>Il magazzino e' vuoto<!>";
        }
        return first.toString();
    }

    public int contaPacchi(){
        int nPacchi = 0;
        Pacco p = first;
        while(p != null){
            nPacchi++;
            p = p.getNext();
        }
        return nPacchi;
    }
    
    public Double getPesoTotale(){
        return pesoSpedito;
    }

    public String cercaPacco(String codiceRicercato){
        if(first == null){
            return "<!>Il magazzino e' vuoto<!>";
        }
        Pacco p = first;
        while(p != null){
            if(p.getCodice().equals(codiceRicercato)){
                return "Il pacco e' presente in magazzino";
            }
            p = p.getNext();
        }
        return "Il pacco non e' presente in magazzino";
    }

    public int contaPacchiPesanti(Double sogliaPeso){
        if(first == null){
            return -1;
        }
        Pacco p = first;
        int nPacchiPesanti = 0;
        while(p != null){
            if(p.getPeso() > sogliaPeso){
                nPacchiPesanti++;
            }
            p = p.getNext();
        }
        return nPacchiPesanti;
    }

    @Override
    public String toString() {
        String s = "";
        Pacco p = first;
        if(first == null){
            s = "Il magazzino e' vuoto";
        }
        while(p != null){
            s += p.toString();
            p = p.getNext();
        }
        return s;
    }
}
