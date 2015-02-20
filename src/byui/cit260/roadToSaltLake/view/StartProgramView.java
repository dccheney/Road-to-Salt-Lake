/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.roadToSaltLake.view;

import byui.cit260.roadToSaltLake.control.ProgramControl;
import byui.cit260.roadToSaltLake.model.Player;
import java.util.Scanner;

/**
 *
 * @author David Cheney & Amy Staiger
 */
public class StartProgramView {
    public StartProgramView(){
    }
    public void startProgram() {
    
        //Display the banner screen    
        this.displayBanner();
        
        //prompt the player to enter theri name Retrieve the name of the player
        String playersName = this.getPlayersName();
        
        //Create and save the player object
        Player player = ProgramControl.createPlayer(playersName);
        
        //Display a personalized welcome message
        this.displayWelcomeMessage(player);
        
        //Display the Main Menu
        MainMenuView mainMenu = new MainMenuView();
        mainMenu.displayMenu();
    
    }
    
    
    

    private void displayBanner() {
        System.out.println("\n*******************************************************************************");
        
        System.out.println("*                                                                               *"
                       + "\n* Welcome to the Road to the Great Salt Lake.  In this game you will            *"
                       + "\n* be taking on the role as one of the leaders in a wagon team in 1847.          *"
                       + "\n* You and your family will depart with Brigham Young or one of the              *"
                       + "\n* Apostles sometime in April or May and should reach the destination            *"
                       + "\n* in July or August.  The Church of Jesus Christ of Latter-day Saints has       *"
                       + "\n* been persecuted for their beliefs and has decided to cross the plains and     *"
                       + "\n* mountains to find refuge in the West.  The Saints have already traveled from  *"
                       + "\n* hardship to hardship from New York to Ohio and are praying for strength       *"
                       + "\n* as they prepare for the journey to their 'Promised Land.'                     *");
        
        System.out.println("*                                                                               *"
                       + "\n* The game begins in Winter Quarters, Nebraska.  During the game                *"
                       + "\n* you will need to purchase supplies, hunt for food, deal with random           *"
                       + "\n* diseases, and cross the plains, rivers and mountains until Brigham            *"
                       + "\n* Young declares 'This is the Place'.                                           *" );
        
         System.out.println("\n******************************************************************************");
        
    }

    public String getPlayersName() {
        boolean valid = false; // indicaes if the name has been retrieved
        String playersName = null;
        Scanner keyboard = new Scanner(System.in);  //keyboard input stream
        
        while(!valid) { // while a valid name has not been retrieved
            
            //prompt for teh player's name
            System.out.println("Enter the player's name below:");
            
            
            // get the name from the keyboard and trim off the blanks
            playersName = keyboard.nextLine();
            playersName = playersName.trim();
            
            //if the name is invalid (less than two characters in length
            if (playersName.length() < 2) {
                System.out.println("Invalid name - the name must not be blank");
                continue; //and repeat again
            }
            break;
        
        }
        return playersName; // return the name
        
                
                
                }

    public void displayWelcomeMessage(Player player) {
        System.out.println("\n\n==========================");
        System.out.println("\tWelcome to the game " +player.getName());
        System.out.println("\tWe hope you have a lot of fun!");
        System.out.println("==========================");
    
    
    }
}
