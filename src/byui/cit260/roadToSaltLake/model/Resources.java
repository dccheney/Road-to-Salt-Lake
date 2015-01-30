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
 * @author Amy Staiger and David Cheney
 */
public class Resources implements Serializable{
    //class instance variables
    private int consumables;
    private int clothing;
    private int ammo;
    private int[] wagonSupplies;
    private int oxen;

    public Resources() {
    }

    
    
    public int getConsumables() {
        return consumables;
    }

    public void setConsumables(int consumables) {
        this.consumables = consumables;
    }

    public int getClothing() {
        return clothing;
    }

    public void setClothing(int clothing) {
        this.clothing = clothing;
    }

    public int getAmmo() {
        return ammo;
    }

    public void setAmmo(int ammo) {
        this.ammo = ammo;
    }

    public int[] getWagonSupplies() {
        return wagonSupplies;
    }

    public void setWagonSupplies(int[] wagonSupplies) {
        this.wagonSupplies = wagonSupplies;
    }

    public int getOxen() {
        return oxen;
    }

    public void setOxen(int oxen) {
        this.oxen = oxen;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + Objects.hashCode(this.consumables);
        hash = 67 * hash + Objects.hashCode(this.clothing);
        hash = 67 * hash + Objects.hashCode(this.ammo);
        hash = 67 * hash + Objects.hashCode(this.wagonSupplies);
        hash = 67 * hash + Objects.hashCode(this.oxen);
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
        final Resources other = (Resources) obj;
        if (!Objects.equals(this.consumables, other.consumables)) {
            return false;
        }
        if (!Objects.equals(this.clothing, other.clothing)) {
            return false;
        }
        if (!Objects.equals(this.ammo, other.ammo)) {
            return false;
        }
        if (!Objects.equals(this.wagonSupplies, other.wagonSupplies)) {
            return false;
        }
        if (!Objects.equals(this.oxen, other.oxen)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Resources{" + "consumables=" + consumables + ", clothing=" + clothing + ", ammo=" + ammo + ", wagonSupplies=" + wagonSupplies + ", oxen=" + oxen + '}';
    }
    
    
    
    
}
