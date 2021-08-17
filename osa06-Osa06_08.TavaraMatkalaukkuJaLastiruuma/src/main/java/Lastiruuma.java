
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
public class Lastiruuma {
    
    private int maksimipaino;
    private ArrayList<Matkalaukku> matkalaukut = new ArrayList<>();
    
    public Lastiruuma(int maksimipaino) {
        this.maksimipaino = maksimipaino;
    }
    
    public void lisaaMatkalaukku(Matkalaukku laukku) {        
        if (yhteispaino() + laukku.yhteispaino() <= this.maksimipaino) {
            this.matkalaukut.add(laukku);
        }
    }

    public int yhteispaino() {
        int yhteensa = 0;
        for (Matkalaukku matkalaukku : this.matkalaukut) {
            yhteensa += matkalaukku.yhteispaino();
        }
        
        return yhteensa;
    }
    
    public void tulostaTavarat() {
        for (Matkalaukku tavara : this.matkalaukut) {
            tavara.tulostaTavarat();
        }
    }
    
    public String toString() {
        if (this.matkalaukut.isEmpty()) {
            return "ei matkalaukkuja " + "(" + this.yhteispaino() + " kg)";
        }
        
        if (this.matkalaukut.size() == 1) {
            return "1 matkalaukku " + "(" + this.yhteispaino() + " kg)";
        }
        
        return matkalaukut.size() + " matkalaukkua " + "(" + this.yhteispaino() + " kg)";
    }
}
