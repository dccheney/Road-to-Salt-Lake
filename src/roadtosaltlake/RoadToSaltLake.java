/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package roadtosaltlake;

import byui.cit260.roadToSaltLake.model.Game;
import byui.cit260.roadToSaltLake.model.Player;
import byui.cit260.roadToSaltLake.view.StartProgramView;



/**
 *
 * @author David Cheney and Amy Staiger
 */
public class RoadToSaltLake {
    private static Game currentGame = null;
    private static Player player = null; 
    
 
    
   
    public static void main(String[] args) {
        StartProgramView startProgramView = new StartProgramView ();
        startProgramView.startProgram();
   
   }

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        RoadToSaltLake.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        RoadToSaltLake.player = player;
    }
    
}
