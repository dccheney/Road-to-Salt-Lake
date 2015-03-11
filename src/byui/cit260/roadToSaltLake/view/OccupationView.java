/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.roadToSaltLake.view;

import byui.cit260.roadToSaltLake.model.Player;
import roadtosaltlake.RoadToSaltLake;

/**
 *
 * @author David
 */
public class OccupationView extends View{
    public OccupationView(){
        super("\n\n----------------------------------"
            + "\n Please choose your occupation:"
            + "\n----------------------------------"
            + "\n\nB - Banker"
            + "\nC - Carpenter"
            + "\nF - Farmer"
            + "\nI - Info about each occupation"
            + "\n----------------------------------\n");
    }
    
    @Override
    public boolean doAction(Object obj)
    {
        Player player = RoadToSaltLake.getPlayer();
        String value = obj.toString();        
        char choice = value.charAt(0);
        switch (choice) {
            case 'B': // Banker	
                player.setOccupation("Banker");
                player.setSkill(2);
                player.setMoney(1600.0);
                break;
            case 'C': // Carpenter
                player.setOccupation("Carpenter");
                player.setSkill(6);
                player.setMoney(800.0);
                break;
            case 'F': // Farmer
                player.setOccupation("Farmer");
                player.setSkill(10);
                player.setMoney(400.0);
                break;
            case 'I': // Info about Occupations
                System.out.println("\nMore info about occupations");
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                return false;
        }
        
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
        return true;
    }
    
}
