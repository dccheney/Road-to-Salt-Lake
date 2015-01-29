/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package roadtosaltlake;

import byui.cit260.roadToSaltLake.model.Player;
import byui.cit260.roadToSaltLake.model.Wagon;

/**
 *
 * @author David
 */
public class RoadToSaltLake {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Wagon wagon = new Wagon();
        
        wagon.setAxles("Four");
        wagon.setCover("Canvas");
        wagon.setWheels("Good");
        
        String wagonInfo = wagon.toString();
        
        Player playerOne = new Player();
        
        playerOne.setOccupation("Banker");
        playerOne.setAge(30);
        playerOne.setGender("Male");
        playerOne.setHealth("Good");
        playerOne.setSkill(10);
        playerOne.setName("Brigham Young");
        
        String playerOneInfo = playerOne.toString();
        
        System.out.println(wagonInfo);
        System.out.println(playerOneInfo);
   }
    
}
