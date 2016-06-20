/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gps;

import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author mcfly
 */
public class Telephone implements Observer{

    @Override
    public void update(Observable o, Object arg) {
        
        System.out.println(((CapteurGPS)o).donneCoord());  
        
    }
    
    
    
    
}
