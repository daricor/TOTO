/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gps;

import java.util.ArrayList;


/**
 *
 * @author mcfly
 */
public class Satellite extends CapteurGPS{


    private int precision = 8;

        ArrayList<Telephone> observateurs;

    @Override
    public String donneCoord() {
       
        return "Lat : "+getLatittude()+" Long : "+getLongitude()+" precision 8m";
    }
    
}
