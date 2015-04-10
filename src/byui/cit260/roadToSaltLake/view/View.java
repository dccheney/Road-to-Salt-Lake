/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.roadToSaltLake.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.Character.toUpperCase;
import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import roadtosaltlake.RoadToSaltLake;

/**
 *
 * @author David
 */
public abstract class View implements ViewInterface{
    private String promptMessage;
    protected final BufferedReader keyboard = RoadToSaltLake.getInFile();
    protected final PrintWriter console = RoadToSaltLake.getOutFile();
    

    public View(String promptMessage)
    {
        this.promptMessage = promptMessage;
    }
    public String getPromptMessage() {
        return promptMessage;
    }

    public void setPromptMessage(String promptMessage) {
        this.promptMessage = promptMessage;
    }
    
    @Override
    public void display() {
        boolean done = false;
        char selection = ' ';
        DecimalFormat df = new DecimalFormat("0.00");
        DecimalFormat i = new DecimalFormat("0");
        do {
            this.console.println(this.promptMessage); //display the main menu
            
            String input = this.getInput(); // get the user's selection
            selection = toUpperCase(input.charAt(0)); // get first character of string
            
            done = this.doAction(selection); //do action based on selection
            
        } while (!done);
    }
    
    @Override
    public String getInput() {
        boolean valid = false; // indicates if the name has been retrieved
        String input = null;
        Scanner keyboard = new Scanner(System.in);
                
        while(!valid) { // while a valid menu item has not been retrieved
            
            //prompt for the menu selection
            System.out.println("Enter in your selection:");

            // get the selection from the keyboard and trim off the blanks
            input = keyboard.nextLine();

            input = input.trim();
            
            //if the name is invalid (less than two characters in length
            if (input.length() != 1 || View.isNumeric(input)) {
                System.out.println("Invalid entry - the entry must not be blank");
                continue; //and repeat again
            }
            break;
        }
        return input; // return the name.
    }
    
    public static boolean isNumeric(String input) {
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
}
