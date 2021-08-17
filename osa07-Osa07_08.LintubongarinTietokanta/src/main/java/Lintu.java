/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author haha
 */
public class Lintu {
    
    private String nimi;
    private String latinankielinenNimi;
    private int havainnot;
    
    public Lintu(String nimi, String latinankielinenNimi) {
        this.nimi = nimi;
        this.latinankielinenNimi = latinankielinenNimi;
        this.havainnot = 0;
    }
    
    public String getNimi() {
        return this.nimi;
    }
    
    public String getLatinankielinenNimi() {
        return this.latinankielinenNimi;
    }
    
    public void havainto() {
        this.havainnot++;
    }
    
    @Override
    public String toString() {
        return this.nimi + " (" + this.latinankielinenNimi + "): " + this.havainnot + " havaintoa";
    }
}
