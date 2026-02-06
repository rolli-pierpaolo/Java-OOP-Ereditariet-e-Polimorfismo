package veicolo;

public class Auto extends Veicolo {
    private int numeroPorte;
    public Auto(String marca, int velocita, int numeroPorte) {
        
        super(marca,velocita);
        this.numeroPorte=numeroPorte;
    }
    public void descrizione() {
        System.out.println("Sono un auto di marca : "+ marca+ " ed ho "+ numeroPorte+" porte");
    }

}
