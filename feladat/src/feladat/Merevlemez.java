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
public class Merevlemez extends Adathordozo{
    private int fordulatszam;

    public Merevlemez(int kapacitas, int fordulatszam) {
        super("Merevlemez", kapacitas);
        this.fordulatszam = fordulatszam;
    }
    
    @Override
    public String toString() {
        return super.toString() + " " + fordulatszam;
    }
    
    
}
