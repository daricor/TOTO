/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gps;

import static java.lang.Double.max;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import javafx.beans.InvalidationListener;
import javafx.beans.Observable;

/**
 *
 * @author mcfly
 */
public class GSM extends CapteurGPS {

    private int precision = 100;

    ArrayList<Telephone> observateurs;

    @Override
    public String donneCoord() {
        
        return "Lat : "+getLatittude()+" Long : "+getLongitude()+" precision 100m";
    }


}
