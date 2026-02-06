package veicolo;

public class Moto extends Veicolo{

    public Moto(String marca, int velocita) {
        super(marca,velocita);
    }
    public void descrizione() {
        System.out.println("Questa moto é di marca : "+ marca);
        
        
    }
}
