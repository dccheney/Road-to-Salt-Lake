/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.roadToSaltLake.control;

import byui.cit260.roadToSaltLake.model.Player;
import roadtosaltlake.RoadToSaltLake;

/**
 *
 * @author David Cheney and Amy Staiger
 */
public class ProgramControl {
    public static Player createPlayer(String name)
    {
        if (name == null) {
            return null;
        }
        
        Player player = new Player ();
        player.setName(name);
        
        RoadToSaltLake.setPlayer(player); //save the player
        
        return player;
        
    }
    
}
