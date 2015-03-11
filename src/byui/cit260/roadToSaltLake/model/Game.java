/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.roadToSaltLake.model;
import java.io.Serializable;


/**
 *
 * @author David Cheney and Amy Staiger
 */
public class Game implements Serializable{
    private double totTime;
    private double totDistance;

    private Map map;

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }
    
    public Game() {
    }

    public double getTotTime() {
        return totTime;
    }

    public void setTotTime(double totTime) {
        this.totTime = totTime;
    }

    public double getTotDistance() {
        return totDistance;
    }

    public void setTotDistance(double totDistance) {
        this.totDistance = totDistance;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.totTime) ^ (Double.doubleToLongBits(this.totTime) >>> 32));
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.totDistance) ^ (Double.doubleToLongBits(this.totDistance) >>> 32));
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
        final Game other = (Game) obj;
        if (Double.doubleToLongBits(this.totTime) != Double.doubleToLongBits(other.totTime)) {
            return false;
        }
        if (Double.doubleToLongBits(this.totDistance) != Double.doubleToLongBits(other.totDistance)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Game{" + "totTime=" + totTime + ", totDistance=" + totDistance + '}';
    }
    
    
}
