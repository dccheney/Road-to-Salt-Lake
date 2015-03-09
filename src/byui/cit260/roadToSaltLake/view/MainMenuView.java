/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.roadToSaltLake.view;

import byui.cit260.roadToSaltLake.control.GameControl;
import static java.lang.Character.toUpperCase;
import roadtosaltlake.RoadToSaltLake;

/**
 *
 * @author AmyLucille and David Cheney
 */
public class MainMenuView extends View {

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



    private void startNewGame() {
        // create a new game
        GameControl.createNewGame(RoadToSaltLake.getPlayer());
        
        // gets occupation from user
        OccupationView occupation = new OccupationView();
        occupation.displayOptions();
        
        // display the game menu
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

    @Override
    public void display() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void doAction(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

