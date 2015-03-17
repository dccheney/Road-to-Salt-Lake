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
        
        
        
        createResourceCostList(game.getResourceCost());
        createPlayerResourceList(RoadToSaltLake.getPlayer().getResources());
    }
    
    private static void createResourceCostList(HashMap resourceCost){
        RoadToSaltLake.getCurrentGame().setResourceCost("Oxen", 30.0);
        RoadToSaltLake.getCurrentGame().setResourceCost("Food", .20); 
        RoadToSaltLake.getCurrentGame().setResourceCost("Clothing", 2.0);
        RoadToSaltLake.getCurrentGame().setResourceCost("Ammo", 2.0);
        RoadToSaltLake.getCurrentGame().setResourceCost("Axles", 10.0);
        RoadToSaltLake.getCurrentGame().setResourceCost("Wheels", 10.0);
        RoadToSaltLake.getCurrentGame().setResourceCost("Covers", 5.0);
    }
    
    private static void createPlayerResourceList(HashMap resources){
        RoadToSaltLake.getCurrentGame().getPlayer().setResources("Oxen");
        RoadToSaltLake.getCurrentGame().getPlayer().setResources("Food");
        RoadToSaltLake.getCurrentGame().getPlayer().setResources("Clothing");
        RoadToSaltLake.getCurrentGame().getPlayer().setResources("Ammo");
        RoadToSaltLake.getCurrentGame().getPlayer().setResources("Axles");
        RoadToSaltLake.getCurrentGame().getPlayer().setResources("Wheels");
        RoadToSaltLake.getCurrentGame().getPlayer().setResources("Covers");
    }
    
    
}
