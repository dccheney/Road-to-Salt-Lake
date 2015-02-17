/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package roadtosaltlake;

import byui.cit260.roadToSaltLake.model.Actor;
import byui.cit260.roadToSaltLake.model.Game;
import byui.cit260.roadToSaltLake.model.Location;
import byui.cit260.roadToSaltLake.model.Map;
import byui.cit260.roadToSaltLake.model.Player;
import byui.cit260.roadToSaltLake.model.Resources;
import byui.cit260.roadToSaltLake.model.Scene;
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
        playerOne.setMoney(400);
        playerOne.setUserPace(40);
        playerOne.setUserMinutes(360);
        
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
        
        actor.setName("John Taylor");
        actor.setGender("Male");
        actor.setHealth("Good");
        actor.setAge(35);
        
        String actorInfo = actor.toString();
        
        Game game = new Game();
        game.setTotDistance(200);
        game.setTotTime(10);
        
        String gameInfo = game.toString();
        
        Map map = new Map();
        map.setColCount(2);
        map.setRowCount(2);
        
        String mapInfo = map.toString();
        
        Location location = new Location();
        location.setCol(3);
        location.setRow(3);
        location.setVisited(2);
       
        String locationInfo = location.toString();
        
        Scene scene = new Scene();
        scene.setSickness("none");
        scene.setTerrain("Plains");
        scene.setWeather("Hot");
        scene.setStore("none");
        
        String sceneInfo = scene.toString();
        
        System.out.println(wagonInfo);
        System.out.println(playerOneInfo);
        System.out.println(resourcesInfo);
        System.out.println(actorInfo);
        System.out.println(gameInfo);
        System.out.println(locationInfo);
        System.out.println(mapInfo);
        System.out.println(sceneInfo);
        
   }
    
}
