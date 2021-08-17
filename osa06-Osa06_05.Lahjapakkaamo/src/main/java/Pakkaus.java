
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
public class Pakkaus {
    
    private ArrayList<Lahja> lahjat;
    
    public Pakkaus() {
        this.lahjat = new ArrayList<>();
    }
    
    public void lisaaLahja(Lahja lahja) {
        this.lahjat.add(lahja);
    }
    
    public int yhteispaino() {
        int yhteensa = 0;
        for (Lahja lahja: this.lahjat) {
            yhteensa += lahja.getPaino();
        }
        
        return yhteensa;
    }
}
