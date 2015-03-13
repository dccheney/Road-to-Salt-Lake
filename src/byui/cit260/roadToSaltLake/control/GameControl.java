/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.roadToSaltLake.control;

import byui.cit260.roadToSaltLake.model.Player;
import byui.cit260.roadToSaltLake.model.Game;
import byui.cit260.roadToSaltLake.model.Map;
import byui.cit260.roadToSaltLake.model.Wagon;
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
        
        game.setPlayer(player); // save player in Game
                
        Wagon wagon = new Wagon(); // create new Wagon
        game.setWagon(wagon); // save wagon in game 
        
        Scene scene = new Scene(); // create new scene
        game.setScene (scene); // save scene in game
       
        
        Map map = MapControl.createMap(); //create and initialize new map
        game.setMap(map); // save map in game
        
        MapControl.moveActorsToStartingLocation(map); // move actors to starting position in the map
                
        createResourceCostList(game.getResourceCostList(resourceCost));
    }
    private void createResourceCostList(HashMap resourceCost){
        resourceCost.put("Oxen", 30.0);
        resourceCost.put("Food", .20); 
        resourceCost.put("Clothing", 2.0);
        resourceCost.put("Ammo", 2.0);
        resourceCost.put("Axles", 10.0);
        resourceCost.put("Wheels", 10.0);
        resourceCost.put("Covers", 5.0);
    }
    
    
}
