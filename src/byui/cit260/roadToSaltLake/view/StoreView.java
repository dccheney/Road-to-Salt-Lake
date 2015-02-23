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
 * @author David Cheney & Amy Staiger
 */
public class StoreView {
    private final String MENU = "\n"
        +"\n--------------------------------"
        +"\n Store"
        +"\n--------------------------------"
        +"\nWhat would you like to buy?"
        +"\nO - Oxen"
        +"\nF - Food"
        +"\nC - Clothing"
        +"\nA - Ammo"
        +"\nW - Wagon Supplies"
        +"\nE - Exit Store"
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
            
        } while (selection !='E');
    }
    
    void doAction(char choice)
    {
        switch (choice) {
            case 'O': // Buy Oxen	
                this.buyOxen();
                break;
            case 'F': // Buy Food
                this.buyFood();
                break;
            case 'C': // buy Clothing
                this.buyClothing();
                break;
            case 'A': // Change Food Rations
                this.buyAmmo();
                break;
            case 'W': // Buy Wagon Supplies
                this.buyWagonSupplies();
                break;
            case 'M':
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

    private void buyOxen() {
        System.out.println("*** buyOxen function called ***");
    }

    private void buyFood() {
        System.out.println("*** buyFood function called ***");
    }

    private void buyClothing() {
        System.out.println("*** buyClothing function called ***");
    }

    private void buyAmmo() {
        System.out.println("*** buyAmmo function called ***");
    }

    private void buyWagonSupplies() {
        System.out.println("*** buyWagonSupplies function called ***");
    }

    
}
