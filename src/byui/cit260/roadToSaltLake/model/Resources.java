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
    private float consumables;
    private float clothing;
    private float ammo;
    private float extraAxles;
    private float extraWheels;
    private float extraCovers;
    private float oxen;

    private Player player;

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }
    
    public Resources() {
    }
    
    public float getConsumables() {
        return consumables;
    }

    public void setConsumables(float consumables) {
        this.consumables = consumables;
    }

    public float getClothing() {
        return clothing;
    }

    public void setClothing(float clothing) {
        this.clothing = clothing;
    }

    public float getAmmo() {
        return ammo;
    }

    public void setAmmo(float ammo) {
        this.ammo = ammo;
    }

    public float getExtraAxles() {
        return extraAxles;
    }

    public void setExtraAxles(float extraAxles) {
        this.extraAxles = extraAxles;
    }

    public float getExtraWheels() {
        return extraWheels;
    }

    public void setExtraWheels(float extraWheels) {
        this.extraWheels = extraWheels;
    }

    public float getExtraCovers() {
        return extraCovers;
    }

    public void setExtraCovers(float extraCovers) {
        this.extraCovers = extraCovers;
    }

    public float getOxen() {
        return oxen;
    }

    public void setOxen(float oxen) {
        this.oxen = oxen;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 19 * hash + Float.floatToIntBits(this.consumables);
        hash = 19 * hash + Float.floatToIntBits(this.clothing);
        hash = 19 * hash + Float.floatToIntBits(this.ammo);
        hash = 19 * hash + Float.floatToIntBits(this.extraAxles);
        hash = 19 * hash + Float.floatToIntBits(this.extraWheels);
        hash = 19 * hash + Float.floatToIntBits(this.extraCovers);
        hash = 19 * hash + Float.floatToIntBits(this.oxen);
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