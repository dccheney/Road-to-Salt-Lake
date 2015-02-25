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
 * @author David
 */
public class GetQuantityView {
    private float numOxen = 0f;        // initializes the number of Oxen to be purchased
    private float numFood = 0f;        // ""    ""    ""     ""     Food ""    ""
    private float numClothing = 0f;    // ""    ""    ""     ""     Clothing ""    ""
    private float numAmmoBoxes = 0f;   // ""    ""    ""     ""     Ammo ""    ""
    private float numAxles = 0f;       // ""    ""    ""     ""     Axles ""    ""
    private float numCovers = 0f;      // ""    ""    ""     ""     Covers ""    ""
    private float numWheels = 0f;      // ""    ""    ""     ""     Wheels ""    ""
    
    // Sets cost of each item and can't be changed
    private final float costOxen = 30f;         
    private final float costFood = .20f;
    private final float costClothing = 2f;
    private final float costAmmoBox = .10f;
    private final float costAxlesWheels = 10f;
    private final float costCover = 5f;
    
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
            if (toFloat(input) < 1 && !isNumeric(input)) {
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
            float d = Float.parseFloat(input);  
        }  
        catch(NumberFormatException nfe)  
        {  
            return false;  
        }  
        return true; 
    }   
    
    
    public float buyOxen() {
        System.out.println("How many oxen would you like to purchase?"
                + "\n\nWe recommend at least 4.  They cost $30 per ox");
        
        System.out.println("*** buyOxen function called ***");
        return numOxen * costOxen;
    }

    public float buyFood() {
        System.out.println("*** buyFood function called ***");
        return numFood * costFood;
    }

    public float buyClothing() {
        System.out.println("*** buyClothing function called ***");
        return numFood * costFood;
    }

    public float buyAmmo() {
        System.out.println("*** buyAmmo function called ***");
        return numAmmoBoxes * costAmmoBox;
    }

    public float buyWagonSupplies() {
        System.out.println("*** buyWagonSupplies function called ***");
        return (((numAxles + numWheels) * costAxlesWheels) + (numCovers * costCover));
    }

    private float toFloat(String input) {
        return toFloat(input, 0.0f);
    }
    public static float toFloat(String str, float defaultValue) {
        if (str == null) {
            return defaultValue;
        }     
        try {
            return Float.parseFloat(str);
        } catch (NumberFormatException nfe) {
            return defaultValue;
        }
    }
}
