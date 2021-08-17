
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
public class Matkalaukku {
    
    private int maksimipaino;
    private ArrayList<Tavara> tavarat = new ArrayList<>();
    
    public Matkalaukku(int maksimipaino) {
        this.maksimipaino = maksimipaino;
    }
    
    public void lisaaTavara(Tavara tavara) {
        if (tavara.getPaino() + this.yhteispaino() <= this.maksimipaino) {
            this.tavarat.add(tavara);
        }
    }
    
    public void tulostaTavarat() {
        for (Tavara tavara : this.tavarat) {
            System.out.println(tavara);
        }
    }
    
    public int yhteispaino() {
        int yhteensa = 0;
        for (Tavara tavara : this.tavarat) {
            yhteensa += tavara.getPaino();
        }
        
        return yhteensa;
    }
    
    public Tavara raskainTavara() {
        if (this.tavarat.isEmpty()) {
            return null;
        }
        
        Tavara raskain = this.tavarat.get(0);
        for (Tavara tavara : this.tavarat) {
            if (tavara.getPaino() > raskain.getPaino()) {
                raskain = tavara;
            }
        }
        
        return raskain;
    }
    
    public String toString() {
        if (this.tavarat.isEmpty()) {
            return "ei tavaroita " + "(" + this.yhteispaino() + " kg)";
        }
        
        if (this.tavarat.size() == 1) {
            return "1 tavara " + "(" + this.yhteispaino() + " kg)";
        }
        
        return this.tavarat.size() + " tavaraa " + "(" + this.yhteispaino() + " kg)";
    }
}
