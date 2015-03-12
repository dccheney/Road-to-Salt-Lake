/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.roadToSaltLake.model;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Objects;

/**
 *
 * @author David Cheney and Amy Staiger
 */
public class Player implements Serializable{
    // class instance variables
    private String occupation;
    private String name;
    private String gender;
    private String health;
    private int age;
    private float skill;
    private double money;
    private int userPace;
    private int userMinutes;
    private HashMap <String, Double> resources;
    
    private Game game;
    private Wagon wagon;
    // methods

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public Wagon getWagon() {
        return wagon;
    }

    public void setWagon(Wagon wagon) {
        this.wagon = wagon;
    }

    public Player() {
        
    }

    
    
    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getHealth() {
        return health;
    }

    public void setHealth(String health) {
        this.health = health;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getSkill() {
        return skill;
    }

    public void setSkill(float skill) {
        this.skill = skill;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public int getUserPace() {
        return userPace;
    }

    public void setUserPace(int userPace) {
        this.userPace = userPace;
    }

    public int getUserMinutes() {
        return userMinutes;
    }

    public void setUserMinutes(int userMinutes) {
        this.userMinutes = userMinutes;
    }

    public HashMap<String, Double> getResources() {
        return resources;
    }
    
    public Double getResources(String item) {
        return resources.get(item);
    }

    public void setResources(String item, Double quantity) {
        this.resources.put(item, resources.get(item) + quantity);
        //Need to figure out how to add to instead of change value.
    }
   

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.occupation);
        hash = 29 * hash + Objects.hashCode(this.name);
        hash = 29 * hash + Objects.hashCode(this.gender);
        hash = 29 * hash + Objects.hashCode(this.health);
        hash = 29 * hash + this.age;
        hash = 29 * hash + Float.floatToIntBits(this.skill);
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.money) ^ (Double.doubleToLongBits(this.money) >>> 32));
        hash = 29 * hash + this.userPace;
        hash = 29 * hash + this.userMinutes;
        hash = 29 * hash + Objects.hashCode(this.resources);
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
        final Player other = (Player) obj;
        if (!Objects.equals(this.occupation, other.occupation)) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.gender, other.gender)) {
            return false;
        }
        if (!Objects.equals(this.health, other.health)) {
            return false;
        }
        if (this.age != other.age) {
            return false;
        }
        if (Float.floatToIntBits(this.skill) != Float.floatToIntBits(other.skill)) {
            return false;
        }
        if (Double.doubleToLongBits(this.money) != Double.doubleToLongBits(other.money)) {
            return false;
        }
        if (this.userPace != other.userPace) {
            return false;
        }
        if (this.userMinutes != other.userMinutes) {
            return false;
        }
        if (!Objects.equals(this.resources, other.resources)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Player{" + "occupation=" + occupation + ", name=" + name + ", gender=" + gender + ", health=" + health + ", age=" + age + ", skill=" + skill + ", money=" + money + ", userPace=" + userPace + ", userMinutes=" + userMinutes + ", resources=" + resources + '}';
    }
}
