
public class Tulostin {

    public static void main(String[] args) {
        // Tässä voit testata metodia
        int[] taulukko = {5, 1, 3, 4, 2};
        tulostaTaulukkoTahtina(taulukko);
    }

    public static void tulostaTaulukkoTahtina(int[] taulukko) {
        // Kirjoita tulostuskoodi tänne
        int i = 0;
        while (i < taulukko.length) {
            int tahtia = taulukko[i];
            int j = 0;
            while (j < tahtia) {
                System.out.print("*");
                j++;
            }

            System.out.println("");
            i++;
        }
    }

}
