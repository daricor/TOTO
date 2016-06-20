/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gps;

/**
 *
 * @author mcfly
 */
public class TITI {

   /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    
        Telephone tel = new Telephone();
        CapteurGPS c = new GSM();
        CapteurGPS cl = new Satellite();
        
        c.addObserver(tel);
        new Thread(c).start();
        
        cl.addObserver(tel);
        new Thread(cl).start();
    
}
}