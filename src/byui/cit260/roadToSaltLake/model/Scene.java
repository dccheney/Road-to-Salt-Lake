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
public class Scene implements Serializable{
    
    private String terrain;
    private String weather;
    private String sickness;
    private String store;

    public Location[] getLocations() {
        return locations;
    }

    public void setLocations(Location[] locations) {
        this.locations = locations;
    }
    
    private Location[] locations;

    public Scene() {
    }

    public String getTerrain() {
        return terrain;
    }

    public void setTerrain(String terrain) {
        this.terrain = terrain;
    }

    public String getWeather() {
        return weather;
    }

    public void setWeather(String weather) {
        this.weather = weather;
    }

    public String getSickness() {
        return sickness;
    }

    public void setSickness(String sickness) {
        this.sickness = sickness;
    }

    public String getStore() {
        return store;
    }

    public void setStore(String store) {
        this.store = store;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + Objects.hashCode(this.terrain);
        hash = 79 * hash + Objects.hashCode(this.weather);
        hash = 79 * hash + Objects.hashCode(this.sickness);
        hash = 79 * hash + Objects.hashCode(this.store);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Scene other = (Scene) obj;
        if (!Objects.equals(this.terrain, other.terrain)) {
            return false;
        }
        if (!Objects.equals(this.weather, other.weather)) {
            return false;
        }
        if (!Objects.equals(this.sickness, other.sickness)) {
            return false;
        }
        if (!Objects.equals(this.store, other.store)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Scene{" + "terrain=" + terrain + ", weather=" + weather + ", sickness=" + sickness + ", store=" + store + '}';
    }
}
