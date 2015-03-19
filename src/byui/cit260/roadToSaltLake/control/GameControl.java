/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.roadToSaltLake.control;

import byui.cit260.roadToSaltLake.model.Player;
import byui.cit260.roadToSaltLake.model.Game;
import byui.cit260.roadToSaltLake.model.Map;
import byui.cit260.roadToSaltLake.model.Scene;
import byui.cit260.roadToSaltLake.model.Wagon;
//import byui.cit260.roadToSaltLake.control.MapControl;
import java.util.HashMap;
import roadtosaltlake.RoadToSaltLake;

/**
 *
 * @author AmyLucille
 */
public class GameControl {
    private static Object MapControl;

    public static void createNewGame(Player player) {
        //System.out.println("\n*** createNewGame stub function called***");
        Game game = new Game(); // create new game
        RoadToSaltLake.setCurrentGame(game); //save in RoadToSaltLake
        
        game.setPlayer(); // save player in Game
                
        Wagon wagon = new Wagon(); // create new Wagon
        //game.setWagon(wagon); // save wagon in game 
        
        Scene scene = new Scene(); // create new scene
        game.setScene(scene); // save scene in game
       
        
        Map map = new Map(); //create and initialize new map
        game.setMap(map); // save map in game
        
        //MapControl.moveActorsToStartingLocation(map); // move actors to starting position in the map
        
        
        createResourceCostList(game);
        
        createPlayerResourceList(game);
    }
    
    private static void createResourceCostList(Game game){
        game.setResourceCost("Oxen", 30.0);
        game.setResourceCost("Food", .20); 
        game.setResourceCost("Clothing", 2.0);
        game.setResourceCost("Ammo", 2.0);
        game.setResourceCost("Axles", 10.0);
        game.setResourceCost("Wheels", 10.0);
        game.setResourceCost("Covers", 5.0);
    }
  
    public static double getDistanceTraveled (double [] milesTraveled) {
       double total = 0;
       
       for (int i=0; i < milesTraveled.length; i++) {
           total = total + milesTraveled[i]; 
       }
        return total;
    }
    
    private static void createPlayerResourceList(Game game){
        game.getPlayer().setResources("Oxen");
        game.getPlayer().setResources("Food");
        game.getPlayer().setResources("Clothing");
        game.getPlayer().setResources("Ammo");
        game.getPlayer().setResources("Axles");
        game.getPlayer().setResources("Wheels");
        game.getPlayer().setResources("Covers");
    }
}
