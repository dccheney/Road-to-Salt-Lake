/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.roadToSaltLake.view;

import byui.cit260.roadToSaltLake.control.GameControl;
import roadtosaltlake.RoadToSaltLake;

/**
 *
 * @author AmyLucille and David Cheney
 */
public class MainMenuView extends View {

    // private final String MENU = "\n"
    public MainMenuView() {
        super("\n\n----------------------"
            + "\n Main Menu "
            + "\n----------------------"
            + "\nN - Start new game"
            + "\nC - Continue a saved game"
            + "\nH - Get help on how to play the game"
            + "\nS - Save Game"
            + "\nE - Exit Game"
            + "\n------------------------------");
    }

    @Override
    public void doAction(Object obj) {
        String value = obj.toString();
        System.out.print("Value is " + value);
        char choice = value.charAt(0);
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
        occupation.display();

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
