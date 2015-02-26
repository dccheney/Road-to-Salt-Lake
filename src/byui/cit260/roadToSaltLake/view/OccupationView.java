/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.roadToSaltLake.view;

import byui.cit260.roadToSaltLake.model.Player;
import static java.lang.Character.toUpperCase;
import java.util.Scanner;
import roadtosaltlake.RoadToSaltLake;

/**
 *
 * @author David
 */
public class OccupationView {
    public void displayOptions(){
        System.out.println("\n\nPlease choose your occupation:"
            + "\n\nB - Banker"
            + "\nC - Carpenter"
            + "\nF - Farmer"
            + "\nI - Info about each occupation");
        this.getPlayerOccupation(RoadToSaltLake.getPlayer());
        }
        
    public void getPlayerOccupation(Player player){
            char selection = ' ';
            String input = this.getInput(); // get the user's selection
            selection = toUpperCase(input.charAt(0)); // get first character of string
            
            this.doAction(selection, player); //do action based on selection
    }
    
    public String getInput(){
        boolean valid = false; // indicates if the occupation has been retrieved
        String playersOccupation = null;
        Scanner keyboard = new Scanner(System.in);  // keyboard input stream
        
        while(!valid) { // while a valid name has not been retrieved
            
            // prompt for the player's name
            System.out.println("Enter the player's occupation below:");
                       
            // get the name from the keyboard and trim off the blanks
            playersOccupation = keyboard.nextLine();
            playersOccupation = playersOccupation.trim();
            
            // if the name is invalid (less than two characters in length
            if (playersOccupation.length() != 1 && isNumeric(playersOccupation)) {
                System.out.println("Invalid name - the occupation must not be blank");
                this.displayOptions();
                continue; // and repeat again
            }
            break;
        }
        return playersOccupation;
    }
    
    void doAction(char choice, Player player)
    {
        switch (choice) {
            case 'B': // Buy Oxen	
                player.setOccupation("Banker");
                player.setSkill(2);
                player.setMoney(1600);
                break;
            case 'C': // Buy Food
                player.setOccupation("Carpenter");
                player.setSkill(6);
                player.setMoney(800);
                break;
            case 'F': // buy Clothing
                player.setOccupation("Farmer");
                player.setSkill(10);
                player.setMoney(400);
                break;
            case 'I': // Change Food Rations
                System.out.println("\nMore info about occupations");
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
    }
    private boolean isNumeric(String input) {
        try  
        {  
            float d = Float.parseFloat(input);  
        }  
        catch(NumberFormatException nfe)  
        {  
            return false;  
        }  
        return true; 
    }
}
