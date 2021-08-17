
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author haha
 */
public class Arvosanarekisteri {
    
    private ArrayList<Integer> pisteet;
    private ArrayList<Integer> hyvaksytyt;
    private ArrayList<Integer> arvosanat;
    
    public Arvosanarekisteri() {
        this.pisteet = new ArrayList<>();
        this.hyvaksytyt = new ArrayList<>();
        this.arvosanat = new ArrayList<>();
    }
    
    public void lisaa(int pisteet) {
        if (pisteet >= 50) {
            this.hyvaksytyt.add(pisteet);
        }
        
        this.pisteet.add(pisteet);
        this.arvosanat.add(pisteetArvosanaksi(pisteet));
    }
    
    public int pisteetArvosanaksi(int pisteet) {
        int arvosana = 0;
        if (pisteet < 50) {
            arvosana = 0;
        } else if (pisteet < 60) {
            arvosana = 1;
        } else if (pisteet < 70) {
            arvosana = 2;
        } else if (pisteet < 80) {
            arvosana = 3;
        } else if (pisteet < 90) {
            arvosana = 4;
        } else {
            arvosana = 5;
        }

        return arvosana;
    }
    
    public int arvosananSaaneidenLkm(int arvosana) {
        int i = 0;
        for (int saatu : this.arvosanat) {
            if (saatu == arvosana) {
                i++;
            }
        }
        
        return i;
    }
    
    public double hyvaksymisprosentti() {
        return 100.0 * this.hyvaksytyt.size() / this.pisteet.size();
    }
    
    public double osallistujienKeskiarvo() {
        if (this.pisteet.isEmpty()) {
            return -1;
        }
        
        int summa = 0;
        for (Integer pisteet : this.pisteet) {
            summa += pisteet;
        }
        
        double keskiarvo = 1.0 * summa / this.pisteet.size();
        return keskiarvo;
    }
    
    public double hyvaksyttyjenKeskiarvo() {
        if (this.hyvaksytyt.isEmpty()) {
            return -1;
        }
        
        int summa = 0;
        for (Integer pisteet : this.hyvaksytyt) {
            summa += pisteet;
        }
        
        double keskiarvo = 1.0 * summa / this.hyvaksytyt.size();
        return keskiarvo;
    }
}
