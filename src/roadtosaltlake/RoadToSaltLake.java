/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package roadtosaltlake;

import byui.cit260.roadToSaltLake.model.Actor;
import byui.cit260.roadToSaltLake.model.Player;
import byui.cit260.roadToSaltLake.model.Resources;
import byui.cit260.roadToSaltLake.model.Wagon;

/**
 *
 * @author David Cheney and Amy Staiger
 */
public class RoadToSaltLake {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         
        Wagon wagon = new Wagon();
        
        wagon.setAxles(4);
        wagon.setCover(2);
        wagon.setWheels(4);
        
        String wagonInfo = wagon.toString();
        
        Player playerOne = new Player();
        
        playerOne.setOccupation("Banker");
        playerOne.setAge(30);
        playerOne.setGender("Male");
        playerOne.setHealth("Good");
        playerOne.setSkill(10);
        playerOne.setName("Brigham Young");
        
        String playerOneInfo = playerOne.toString();
        
        Resources resources = new Resources();
        
        resources.setConsumables(5);
        resources.setClothing(5);
        resources.setAmmo(10);
        resources.setExtraAxles(0);
        resources.setExtraCovers(0);
        resources.setExtraWheels(0);
        resources.setOxen(3);
        
        String resourcesInfo = resources.toString();
        
        Actor actor = new Actor();
        
        actor.setGender("Male");
        actor.setHealth("Good");
        actor.setAge(35);
        
        String actorInfo = actor.toString();
        
        
        System.out.println(wagonInfo);
        System.out.println(playerOneInfo);
        System.out.println(resourcesInfo);
        System.out.println(actorInfo);
   }
    
}
