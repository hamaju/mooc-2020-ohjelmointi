
public class Main {

    public static void main(String[] args) {

        // Kokeile luokkaasi täällä
        Viestipalvelu vp = new Viestipalvelu();
        Viesti viesti = new Viesti("lahettaja", "viesti");
        vp.lisaa(viesti);
        System.out.println(vp.getViestit());
    }
}
