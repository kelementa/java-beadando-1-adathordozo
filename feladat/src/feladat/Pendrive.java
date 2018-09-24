/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feladat;

/**
 *
 * @author kelement
 */
public class Pendrive extends Adathordozo {
    private int verzio;

    public Pendrive(int kapacitas, int verzio) {
        super("Pendrive", kapacitas);
        this.verzio = verzio;
    }
    
    @Override
    public String toString() {
        return super.toString() + " " + verzio;
    }
    
    
    
}
