
import java.util.ArrayList;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author haha
 */
public class Vitsipankki {
    
    private ArrayList<String> vitsit;
    
    public Vitsipankki() {
        this.vitsit = new ArrayList<>();
    }
    
    public void lisaaVitsi(String vitsi) {
        this.vitsit.add(vitsi);
    }
    
    public String arvoVitsi() {
        if (!vitsit.isEmpty()) {
            Random arpa = new Random();
            int i = arpa.nextInt(vitsit.size());
            
            return vitsit.get(i);            
        }

        return "Vitsit vähissä.";
    }
    
    public void tulostaVitsit() {
        for (String vitsi : this.vitsit) {
            System.out.println(vitsi);
        }
    }
}
