
public class Paivays {

    private int paiva;
    private int kuukausi;
    private int vuosi;

    public Paivays(int paiva, int kuukausi, int vuosi) {
        this.paiva = paiva;
        this.kuukausi = kuukausi;
        this.vuosi = vuosi;
    }

    @Override
    public String toString() {
        return this.paiva + "." + this.kuukausi + "." + this.vuosi;
    }

    public boolean aiemmin(Paivays verrattava) {
        if (this.vuosi < verrattava.vuosi) {
            return true;
        }

        if (this.vuosi == verrattava.vuosi && this.kuukausi < verrattava.kuukausi) {
            return true;
        }

        if (this.vuosi == verrattava.vuosi && this.kuukausi == verrattava.kuukausi &&
                 this.paiva < verrattava.paiva) {
            return true;
        }

        return false;
    }
    
    public void etene() {                        
        if (this.kuukausi == 12 && this.paiva == 30) {
            this.paiva = 1;
            this.kuukausi = 1;
            this.vuosi++;
        } else if (this.paiva == 30) {
            this.paiva = 1;
            this.kuukausi++;
        } else {
            this.paiva++;
        }
    }
    
    public void etene(int montakoPaivaa) {
        for (int i = 0; i < montakoPaivaa; i++) {
            this.etene();
        }
    }
    
    public Paivays paivienPaasta(int paivia) {
        Paivays paivays = new Paivays(this.paiva, this.kuukausi, this.vuosi);
        paivays.etene(paivia);
        return paivays;
    }
}
