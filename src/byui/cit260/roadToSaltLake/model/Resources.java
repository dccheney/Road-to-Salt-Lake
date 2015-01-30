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
    private int extraAxles;
    private int extraWheels;
    private int extraCovers;
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

    public int getExtraAxles() {
        return extraAxles;
    }

    public void setExtraAxles(int extraAxles) {
        this.extraAxles = extraAxles;
    }

    public int getExtraWheels() {
        return extraWheels;
    }

    public void setExtraWheels(int extraWheels) {
        this.extraWheels = extraWheels;
    }

    public int getExtraCovers() {
        return extraCovers;
    }

    public void setExtraCovers(int extraCovers) {
        this.extraCovers = extraCovers;
    }

    public int getOxen() {
        return oxen;
    }

    public void setOxen(int oxen) {
        this.oxen = oxen;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + this.consumables;
        hash = 17 * hash + this.clothing;
        hash = 17 * hash + this.ammo;
        hash = 17 * hash + this.extraAxles;
        hash = 17 * hash + this.extraWheels;
        hash = 17 * hash + this.extraCovers;
        hash = 17 * hash + this.oxen;
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
        if (this.consumables != other.consumables) {
            return false;
        }
        if (this.clothing != other.clothing) {
            return false;
        }
        if (this.ammo != other.ammo) {
            return false;
        }
        if (this.extraAxles != other.extraAxles) {
            return false;
        }
        if (this.extraWheels != other.extraWheels) {
            return false;
        }
        if (this.extraCovers != other.extraCovers) {
            return false;
        }
        if (this.oxen != other.oxen) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Resources{" + "consumables=" + consumables + ", clothing=" + clothing + ", ammo=" + ammo + ", extraAxles=" + extraAxles + ", extraWheels=" + extraWheels + ", extraCovers=" + extraCovers + ", oxen=" + oxen + '}';}
}