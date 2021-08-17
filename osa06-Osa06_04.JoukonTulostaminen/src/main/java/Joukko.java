
import java.util.ArrayList;

public class Joukko {

    private String nimi;
    private ArrayList<String> alkiot;

    public Joukko(String nimi) {
        this.nimi = nimi;
        this.alkiot = new ArrayList<>();
    }

    public void lisaa(String alkio) {
        this.alkiot.add(alkio);
    }

    public ArrayList<String> getAlkiot() {
        return this.alkiot;
    }

    public String toString() {
        if (this.alkiot.isEmpty()) {
            return "Joukko " + nimi + " on tyhjä.";
        }

        if (this.alkiot.size() == 1) {
            return "Joukossa " + this.nimi + " on 1 alkio:\n" + alkiot.get(0); 
        }
        
        String joukonAlkiot = "";
        for (int i = 0; i < alkiot.size(); i++) {
            joukonAlkiot += "\n" + alkiot.get(i);
        }
        
        return "Joukossa " + this.nimi + " on " + this.alkiot.size() + " alkiota:" + joukonAlkiot;
    }
}
