/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.roadToSaltLake.view;

import byui.cit260.roadToSaltLake.control.GameControl;
import static java.lang.Character.toUpperCase;
import java.util.Scanner;
import roadtosaltlake.RoadToSaltLake;

/**
 *
 * @author AmyLucille and David Cheney
 */
public class MainMenuView {

    private final String MENU = "\n"
                +"\n----------------------"
                +"\n Main Menu "
                +"\n----------------------"
                +"\nN - Start new game"
                +"\nC - Continue a saved game"
                +"\nH - Get help on how to play the game"
                +"\nS - Save Game"
                +"\nE - Exit Game"
                +"\n------------------------------";
    
    
    public void displayMenu() {
        char selection = ' ';
        do {
            System.out.println(MENU); //display the main menu
            
            String input = this.getInput(); // get the user's selection
            selection = toUpperCase(input.charAt(0)); // get first character of string
            
            this.doAction(selection); //do action based on selection
            
        } while (selection !='E');
    }

    private void doAction(char choice) {
        switch (choice) {
            case 'N': // create and start a new game	
                    this.startNewGame();
                    break;
            case 'C': // get and start an existing game	
                    this.startExistingGame();
                    break;
            case 'H': // display the help menu
                    this.displayHelpMenu();
                    break;
            case 'S': //save the current game	
                    this.saveGame();
                    break;
            case 'E': // exit the program
                    return;
            default:
                    System.out.println("\n*** Invalid selection *** Try again");
                    break;
        }
    }

    private String getInput() {
        boolean valid = false; // indicates if the name has been retrieved
        String input = null;
        Scanner keyboard = new Scanner(System.in);  //keyboard input stream
        
        while(!valid) { // while a valid menu item has not been retrieved
            
            //prompt for the menu selection
            System.out.println("Enter in your selection:");

            // get the selection from the keyboard and trim off the blanks
            input = keyboard.nextLine();
            input = input.trim();
            
            //if the name is invalid (less than two characters in length
            if (input.length() != 1 && isNumeric(input)) {
                System.out.println("Invalid entry - the entry must not be blank");
                continue; //and repeat again
            }
            break;
        }
        return input; // return the name.
    }               

    private boolean isNumeric(String input) {
        try  
        {  
            double d = Double.parseDouble(input);  
        }  
        catch(NumberFormatException nfe)  
        {  
            return false;  
        }  
        return true; 
    }


    private void startNewGame() {
        // create a new game
        GameControl.createNewGame(RoadToSaltLake.getPlayer());
        
        //display the game menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayMenu();
    }

    private void startExistingGame() {
        System.out.println("*** startExistingGame function called ***");
    }

    private void displayHelpMenu() {
            HelpMenuView helpMenu = new HelpMenuView();
            
            helpMenu.displayMenu();
    }

    private void saveGame() {
                System.out.println("*** saveGame function called ***");
    }
}

