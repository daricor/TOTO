/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gps;

import java.util.Observable;
import java.util.concurrent.ThreadLocalRandom;


/**
 *
 * @author mcfly
 */
public abstract class CapteurGPS extends Observable implements Runnable{
    
    private double longitude;
    private double latittude;
    
    abstract public String donneCoord();

    double random(int P_min,int P_max){
        
       
        double randomValue = ThreadLocalRandom.current().nextDouble(P_min, P_max);
        
        return randomValue;
    }
    
    @Override
    public void run(){
        
        while(true){
        
        try {
            
            Thread.sleep(1000);
            
          double longNew = random(-180, +180);
          double latNew = random(-90, +90);
          
           
            
            if((longNew != longitude) || (latNew != latittude)){
                
            longitude = longNew;
            latittude = latNew;
            
           
            setChanged();
            
            notifyObservers();
                
                
            }
            
        } catch (Exception e) {
            
            e.getMessage();
        }
        
    }
    }
    
    
    /**
     * @return the longitude
     */
    public double getLongitude() {
        return longitude;
    }

    /**
     * @param longitude the longitude to set
     */
    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    /**
     * @return the latittude
     */
    public double getLatittude() {
        return latittude;
    }

    /**
     * @param latittude the latittude to set
     */
    public void setLatittude(double latittude) {
        this.latittude = latittude;
    }
    
}
