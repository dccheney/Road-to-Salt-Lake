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
 * @author David Cheney & AmyLucille
 */
public class GameMenuView {
    
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
    
    private void startNewGame()
    {
        GameControl.createNewGame(RoadToSaltLake.getPlayer());
        
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayMenu();
    }
    
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

    private void continueTrail() {
        System.out.println("*** ContinueTrail function called");
    }

    private void checkSupplies() {
        System.out.println("*** CheckSupplies function called");
    }

    private void changePace() {
        ChangePaceView changePaceView = new ChangePaceView();
        changePaceView.changePace();
    }

    private void changeRations() {
        System.out.println("*** ChangeRations function called");
    }

    private void buySupplies() {
        StoreView store = new StoreView();
        store.displayMenu();
    }
}
