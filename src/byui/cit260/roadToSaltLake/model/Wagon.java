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
 * @author als6
 */
public class Wagon implements Serializable{
    
    // class instance variables
    private String wheels;
    private String cover;
    private String axles;

    public Wagon() {
    }

    
    
    public String getWheels() {
        return wheels;
    }

    public void setWheels(String wheels) {
        this.wheels = wheels;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public String getAxles() {
        return axles;
    }

    public void setAxles(String axles) {
        this.axles = axles;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + Objects.hashCode(this.wheels);
        hash = 37 * hash + Objects.hashCode(this.cover);
        hash = 37 * hash + Objects.hashCode(this.axles);
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
        final Wagon other = (Wagon) obj;
        if (!Objects.equals(this.wheels, other.wheels)) {
            return false;
        }
        if (!Objects.equals(this.cover, other.cover)) {
            return false;
        }
        if (!Objects.equals(this.axles, other.axles)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Wagon{" + "wheels=" + wheels + ", cover=" + cover + ", axles=" + axles + '}';
    }
    
    
}
