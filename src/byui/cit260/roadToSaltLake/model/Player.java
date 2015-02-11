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
public class Player implements Serializable{
    // class instance variables
    private String occupation;
    private String name;
    private String gender;
    private String health;
    private int age;
    private float skill;
    private float money;

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

    public float getMoney() {
        return money;
    }

    public void setMoney(float money) {
        this.money = money;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + Objects.hashCode(this.occupation);
        hash = 29 * hash + Objects.hashCode(this.name);
        hash = 29 * hash + Objects.hashCode(this.gender);
        hash = 29 * hash + Objects.hashCode(this.health);
        hash = 29 * hash + this.age;
        hash = 29 * hash + Float.floatToIntBits(this.skill);
        hash = 29 * hash + Float.floatToIntBits(this.money);
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
        if (Float.floatToIntBits(this.money) != Float.floatToIntBits(other.money)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Player{" + "occupation=" + occupation + ", name=" + name + ", gender=" + gender + ", health=" + health + ", age=" + age + ", skill=" + skill + ", money=" + money + '}';
    }

    public void SetMoney(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
    

    