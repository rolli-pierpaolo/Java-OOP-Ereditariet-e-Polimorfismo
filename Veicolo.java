package veicolo;

public class Veicolo {
protected String marca;
protected int velocita;


public Veicolo(String marca, int velocita) {
    this.marca=marca;
    this.velocita=velocita;
    
    
}

public void descrizione() {
    System.out.println("Sono un veicolo");
    
}
}
