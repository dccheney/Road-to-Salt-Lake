/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.roadToSaltLake.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author David Cheney and Amy Staiger
 */
public enum Scene implements Serializable{
    
    /**
     * here is the enum of scenes
     */
    Nauvoo("swamp",Weather.rainGood,true);
    
    private String terrain;
    private Weather weather;
    private boolean store;
    
    
    Scene (String terrain, Weather weather, boolean store) {
        this.terrain = terrain;
        this.weather = weather;
        this.store = store;
    }



    public String getTerrain() {
        return terrain;
    }

    public Weather getWeather() {
        return weather;
    }

    public boolean getStore(){
        return store;
    }
}
