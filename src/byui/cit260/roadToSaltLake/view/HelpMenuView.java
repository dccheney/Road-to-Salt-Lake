/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.roadToSaltLake.view;

import static java.lang.Character.toUpperCase;
import java.util.Scanner;

/**
 *
 * @author David
 */
public class HelpMenuView {
    private final String MENU = "\n"
        +"\n----------------------------------"
        +"\n Help Menu "
        +"\n----------------------------------"
        +"\nG - What is the goal of the game?"
        +"\nM - How is progress displayed?"
        +"\nS - How to get supplies"
        +"\nH - What hazards could I encounter"
        +"\nR - Return"
        +"\n----------------------------------";
    
    void displayMenu() {
        char selection = ' ';
        do {
            System.out.println(MENU); //display the main menu
            
            String input = this.getInput(); // get the user's selection
            selection = input.charAt(0); // get first character of string
            
            this.doAction(selection); //do action based on selection
            
        } while (selection !='R');
    }
    
    void doAction(char choice)
    {
        switch (toUpperCase(choice)) {
            case 'G': // Continue on Trail	
                this.goal();
                break;
            case 'M': // Check Supplies
                this.progressDisplay();
                break;
            case 'S': // Change Pace
                this.howToGetSupplies();
                break;
            case 'H': // Change Food Rations
                this.potentialHazards();
                break;
            case 'R': // Buy Supplies
                System.out.println("*** Leaving Help Menu ***");
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

    private void goal() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void progressDisplay() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void howToGetSupplies() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void potentialHazards() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
