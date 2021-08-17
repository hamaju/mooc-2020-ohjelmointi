
public class Asunto {

    private int huoneita;
    private int nelioita;
    private int neliohinta;

    public Asunto(int huoneita, int nelioita, int neliohinta) {
        this.huoneita = huoneita;
        this.nelioita = nelioita;
        this.neliohinta = neliohinta;
    }
    
    public boolean suurempi(Asunto verrattava) {
        if (this.nelioita > verrattava.nelioita) {
            return true;
        }
        
        return false;
    }

    public int hinta() {
        return this.nelioita * this.neliohinta;
    }
    
    public int hintaero(Asunto verrattava) {
        return Math.abs(this.hinta() - verrattava.hinta());
    }
    
    public boolean kalliimpi(Asunto verrattava) {
        if (this.hinta() > verrattava.hinta()) {
            return true;
        }
        
        return false;
    }
}
