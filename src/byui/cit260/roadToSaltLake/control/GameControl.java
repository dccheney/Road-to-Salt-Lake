/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.roadToSaltLake.control;

import byui.cit260.roadToSaltLake.model.Player;
import byui.cit260.roadToSaltLake.model.Game;
import java.util.HashMap;

/**
 *
 * @author AmyLucille
 */
public class GameControl {

    public static void createNewGame(Player player) {
        System.out.println("\n*** createNewGame stub function called***");
        Game game = new Game();
        createResourceCostList(game.getResourceCost());
    }
    private static void createResourceCostList(HashMap resourceCost){
        resourceCost.put("Oxen", 30.0);
        resourceCost.put("Food", .20); 
        resourceCost.put("Clothing", 2.0);
        resourceCost.put("Ammo", 2.0);
        resourceCost.put("Axles", 10.0);
        resourceCost.put("Wheels", 10.0);
        resourceCost.put("Covers", 5.0);
    }
}
