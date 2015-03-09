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
 * @author David Cheney & AmyLucille
 */
public class GameMenuView extends View {
    
    private final String MENU = "\n"
        +"\n--------------------------------"
        +"\n Game Menu "
        +"\n--------------------------------"
        +"\nC - Continue on trail"
        +"\nS - Check Supplies"
        +"\nP - Change pace"
        +"\nF - Change food rations"
        +"\nB - Buy supplies"
        +"\nM - Main Menu"
        +"\n--------------------------------";
    
    void displayMenu() {
        char selection = ' ';
        do {
            System.out.println(MENU); //display the main menu
            
            String input = this.getInput(); // get the user's selection
            selection = toUpperCase(input.charAt(0)); // get first character of string
            
            this.doAction(selection); //do action based on selection
            
        } while (selection !='M');
    }
    
    void doAction(char choice)
    {
        switch (choice) {
            case 'C': // Continue on Trail	
                this.continueTrail();
                break;
            case 'S': // Check Supplies
                this.checkSupplies();
                break;
            case 'P': // Change Pace
                this.changePace();
                break;
            case 'F': // Change Food Rations
                this.changeRations();
                break;
            case 'B': // Buy Supplies
                this.buySupplies();
                break;
            case 'M': // Main Menu
                return;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        
    }



    private void continueTrail() {
        System.out.println("*** ContinueTrail function called");
    }

    private void checkSupplies() {
        System.out.println("*** CheckSupplies function called");
    }

    private void changePace() {
        ChangePaceView changePaceView = new ChangePaceView();
        changePaceView.displayMenu();
    }

    private void changeRations() {
        System.out.println("*** ChangeRations function called");
    }

    private void buySupplies() {
        StoreView store = new StoreView();
        store.displayMenu();
    }
}
