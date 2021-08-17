
public class Raha {

    private final int euroa;
    private final int senttia;

    public Raha(int euroa, int senttia) {

        if (senttia > 99) {
            euroa = euroa + senttia / 100;
            senttia = senttia % 100;
        }

        this.euroa = euroa;
        this.senttia = senttia;
    }

    public int eurot() {
        return this.euroa;
    }

    public int sentit() {
        return this.senttia;
    }

    public String toString() {
        String nolla = "";
        if (this.senttia < 10) {
            nolla = "0";
        }

        return this.euroa + "." + nolla + this.senttia + "e";
    }
    
    public Raha plus(Raha lisattava) {
        return new Raha(this.euroa + lisattava.euroa, this.senttia + lisattava.senttia);
    }
    
    public boolean vahemman(Raha verrattava) {
        if (this.euroa > verrattava.euroa) {
            return false;
        }
        
        if (this.euroa == verrattava.euroa && this.senttia > verrattava.senttia) {
            return false;
        }
        
        return true;
    }
    
    public Raha miinus(Raha vahentaja) {        
        int eurot = this.euroa - vahentaja.eurot();
        int sentit = this.senttia - vahentaja.sentit();

        if (sentit < 0) {
            sentit += 100; // neg. senteistä saadaan oikea määrä lisäämällä 100
            eurot--; // miinustetaan ylimääräinen euro
        }
        
        if (eurot < 0) {
            return new Raha(0, 0);
        }
        
        return new Raha(eurot, sentit);
    }
}
