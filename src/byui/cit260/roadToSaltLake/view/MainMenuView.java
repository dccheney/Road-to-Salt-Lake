/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.roadToSaltLake.view;

import java.util.Scanner;

/**
 *
 * @author AmyLucille
 */
public class MainMenuView {

    private final String MENU = "\n"
                +"\n----------------------"
                +"\n Main Menu "
                +"\n----------------------"
                +"\nN - Start new game"
                +"\nG - Get and start a saved game"
                +"\nH - Get help on how to play the game"
                +"\nS - Save Game"
                +"\nE - Exit Game"
                +"\n------------------------------";
    
    
    public void displayMenu() {
        char selection = ' ';
        do {
            System.out.println(MENU); //display the main menu
            
            String input = this.getInput(); // get the user's selection
            selection = input.charAt(0); // get first character of string
            
            this.doAction(selection); //do action based on selection
            
        } while (selection !='E');
    }

    private void doAction(char selection) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
           if (input.length() == 1) {
                System.out.println("Invalid entry - the entry must not be blank");
                continue; //and repeat again
            }
            break;
        }
        return input; // return the name.
    }               
}
    
