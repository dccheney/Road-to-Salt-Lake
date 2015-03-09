/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.roadToSaltLake.view;

import java.util.Scanner;
import static javafx.scene.input.KeyCode.Q;

/**
 *
 * @author AmyLucille
 */
public abstract class View implements ViewInterface {
    
    private String promptMessage;
    public View(String promptMessage) {
        this.promptMessage = promptMessage;
    }
    
    @Override
    public void dispaly() {
        String value; 
        
        do {System.out.println(this.promptMessage); //display the prompt
            value = this.getInput(); // get the user's selection
            this.doAction(value); // do action based on selection
                   
        } while (!value.equals(Q));
    }
    
    @Override
    public String getInput () {
        Scanner keyboard = new Scanner(System.in);
        boolean valid = false;
        String selection = null;
        
        //while a valid name has not been retrieved
        while (!valid) {
            
            //prompt for the player's name
            System.out.println("\t\nEnter your selection below:");
            
            //get the vaule entered from the keyboard
            selection = keyboard.nextLine();
            selection = selection.trim();
            
            if (selection.length() < 1 ){ //blank vaule entered
                System.out.println("n\*** Invalid selection *** Try again");
                continue;
                
            }
            
            break;
        }
        
        return selection; //return the name
    }

    public String getPromptMessage() {
        return promptMessage;
    }

    public void setPromoptMessage(String promptMessage) {
        this.promptMessage = promptMessage;
    }

   
