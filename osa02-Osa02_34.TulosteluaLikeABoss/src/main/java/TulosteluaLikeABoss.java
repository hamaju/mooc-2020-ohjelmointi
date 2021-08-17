
public class TulosteluaLikeABoss {

    public static void tulostaTahtia(int maara) {
        // tehtävän osa 1
        int i = 0;
        while (i < maara) {
            System.out.print("*");
            i++;
        }
        
        System.out.println("");
    }

    public static void tulostaTyhjaa(int maara) {
        // tehtävän osa 1
        int i = 0;
        while (i < maara) {
            System.out.print(" ");
            i++;
        }
    }
    
    public static void tulostaKolmio(int koko) {
        // tehtävän osa 2
        int i = 1;
        while (i <= koko) {
            tulostaTyhjaa(koko - i);
            tulostaTahtia(i);
            i++;
        }
    }
    
    public static void jouluKuusi(int korkeus) {
        // tehtävän osa 3 
        int i = 1;
        while (i <= korkeus) {
            // tyhjää tulostetaan korkeus - rivinumero
            tulostaTyhjaa(korkeus - i);
            // tähtiä tulostetaan rivinumero * 2 - 1
            tulostaTahtia(i * 2 - 1);
            i++;
        }
        
        // jalka
        tulostaTyhjaa(korkeus - 2);
        tulostaTahtia(3);
        tulostaTyhjaa(korkeus - 2);
        tulostaTahtia(3);
    }

    public static void main(String[] args) {
        // Testit eivät katso main-metodia, voit muutella tätä vapaasti.

        tulostaKolmio(5);
        System.out.println("---");
        jouluKuusi(4);
        System.out.println("---");
        jouluKuusi(10);
    }
}
