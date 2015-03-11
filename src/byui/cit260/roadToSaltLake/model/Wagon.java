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
 * @author Amy Staiger
 */
public class Wagon implements Serializable{
    
    // class instance variables
    private int wheels;
    private int cover;
    private int axles;

    private Game game;
    private Player player;

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }
    
    public Wagon() {
    }

    
    
    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public int getCover() {
        return cover;
    }

    public void setCover(int cover) {
        this.cover = cover;
    }

    public int getAxles() {
        return axles;
    }

    public void setAxles(int axles) {
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
