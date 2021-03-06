/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.roadToSaltLake.model;
import java.io.Serializable;
import java.text.DecimalFormat;
import java.util.HashMap;


/**
 *
 * @author David Cheney and Amy Staiger
 */
public class Game implements Serializable{
    private double totTime;
    private double totDistance;
    HashMap <String, Double> resourceCost = new HashMap <String, Double>();
    private double [] dayDistance = new double [90];
    private Map map;
    private Player player;
    public Player getPlayer() { return player;};
    private DecimalFormat df = new DecimalFormat("0.00");
    
    public Game() {
    }
    
    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
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

    public HashMap<String, Double> getResourceCost() {
        return resourceCost;
    }
    
    public Double getResourceCost(String item) {
        return resourceCost.get(item);
    }
    
    public String getResourceCostFormat(String item){
        return df.format(resourceCost.get(item));
    }

    public void setResourceCost(HashMap<String, Double> resourceCost) {
        this.resourceCost = resourceCost;
    }

    public double[] getDayDistance() {
        return dayDistance;
    }

    public void setDayDistance(double[] dayDistance) {
        this.dayDistance = dayDistance;
    }
    
    public void setResourceCost(String item, Double cost) {
        this.resourceCost.put(item, cost);
    }
    
    public void setScene(Scene scene){
        //stuff;
    }
    
    public void setPlayer(Player player) {
        this.player = player;
    }

//    public void setWagon(Wagon wagon) {
//        player.wagon = wagon;
//    }
    

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
