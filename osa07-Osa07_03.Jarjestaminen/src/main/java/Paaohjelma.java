
import java.util.Arrays;

public class Paaohjelma {

    public static void main(String[] args) {
        // tee testikoodia tänne
        int[] taulukko = {3, 1, 5, 99, 3, 12};
        // indeksit:   0  1  2  3  4
        //int[] luvut = {6, 5, 8, 7, 11};
        // indeksit:    0  1  2  3   4
        //int[] luvut = {-1, 6, 9, 8, 12};

/*        
        System.out.println("Pienin: " + Paaohjelma.pienin(luvut));
        System.out.println("Pienimmän indeksi: " + Paaohjelma.pienimmanIndeksi(luvut));
        
        System.out.println(Paaohjelma.pienimmanIndeksiAlkaen(luvut, 0));
        System.out.println(Paaohjelma.pienimmanIndeksiAlkaen(luvut, 1));
        System.out.println(Paaohjelma.pienimmanIndeksiAlkaen(luvut, 2));
        
        System.out.println(Arrays.toString(luvut));

        Paaohjelma.vaihda(luvut, 1, 0);
        System.out.println(Arrays.toString(luvut));

        Paaohjelma.vaihda(luvut, 0, 3);
        System.out.println(Arrays.toString(luvut));
*/        
        int[] luvut = {8, 3, 7, 9, 1, 2, 4};
        Paaohjelma.jarjesta(luvut);
    }
    
    public static int pienin(int[] taulukko) {
        int pienin = taulukko[0];
        for (int i = 0; i < taulukko.length; i++) {
            if (pienin > taulukko[i]) {
                pienin = taulukko[i];
            }
        }
        
        return pienin;
    }
    
    public static int pienimmanIndeksi(int[] taulukko) {
        int pienin = Paaohjelma.pienin(taulukko);
        for (int i = 0; i < taulukko.length; i++) {
            if (taulukko[i] == pienin) {
                return i;
            }
        }
        
        return -1;
    }
    
    public static int pienimmanIndeksiAlkaen(int[] taulukko, int aloitusIndeksi) {
        int pienimmanIndeksi = aloitusIndeksi;
        for (int i = aloitusIndeksi; i < taulukko.length; i++) {
            if (taulukko[pienimmanIndeksi] > taulukko[i]) {
                pienimmanIndeksi = i;
            }
        }
        
        return pienimmanIndeksi;
    }
    
    public static void vaihda(int[] taulukko, int indeksi1, int indeksi2) {
        int temp = taulukko[indeksi2];
        taulukko[indeksi2] = taulukko[indeksi1];
        taulukko[indeksi1] = temp;
    }
    
    public static void jarjesta(int[] taulukko) {
        System.out.println(Arrays.toString(taulukko));
        
        for (int i = 0; i < taulukko.length; i++) {
            Paaohjelma.vaihda(taulukko, Paaohjelma.pienimmanIndeksiAlkaen(taulukko, i), i);
            System.out.println(Arrays.toString(taulukko));
        }
    }
}
