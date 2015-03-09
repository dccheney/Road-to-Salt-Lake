/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.roadToSaltLake.view;

import byui.cit260.roadToSaltLake.control.Store;
import byui.cit260.roadToSaltLake.model.Resources;
import java.util.Scanner;
/**
 *
 * @author David
 */
public class GetQuantityView extends View {
    Store store = new Store();
    Resources resource = new Resources();

    private float quantity = 0f;
    private float numAxles = 0f;       // initializes the number of Axles to be purchased
    private float numCovers = 0f;      // ""    ""    ""     ""     Covers   ""    ""
    private float numWheels = 0f;      // ""    ""    ""     ""     Wheels   ""    ""
    
    // Sets cost of each item and can't be changed
    private final float costOxen = 30f;         
    private final float costFood = .20f;
    private final float costClothing = 2f;
    private final float costAmmoBox = .10f;
    private final float costAxlesWheels = 10f;
    private final float costCover = 5f;  
    
    private float totOxen = 0f;
    private float totFood = 0f;
    private float totClothing = 0f;
    private float totAmmo = 0f;
    private float totAxles = 0f;
    private float totWheels = 0f;
    private float totCovers = 0f;
    
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
    
    
    public float buyOxen(float bankAmount) {
        System.out.println("How many oxen would you like to purchase?"
                + "\n\nWe recommend at least 4.  They cost $" + costOxen + " per ox");
        quantity = toFloat(getInput());
        totOxen = store.purchaseInventory(bankAmount, quantity, costOxen);
        resource.setOxen(quantity);
        return totOxen;
    }

    public float buyFood(float bankAmount) {
        System.out.println("How many pounds of food would you like to purchase?"
                + "\n\nWe recommend at least 200.  Food costs $" + costFood + " per pound");
        quantity = toFloat(getInput());
        totFood = store.purchaseInventory(bankAmount, quantity, costFood);
        resource.setConsumables(quantity);
        return totFood;
    }

    public float buyClothing(float bankAmount) {
        System.out.println("How many sets of Clothing would you like to purchase?"
                + "\n\nWe recommend at least 2 per person.  Each set costs $" + costClothing);
        quantity = toFloat(getInput());
        totClothing = store.purchaseInventory(bankAmount, quantity, costClothing);
        resource.setClothing(quantity);
        return totClothing;
    }

    public float buyAmmo(float bankAmount) {
        System.out.println("How many boxes of ammunition would you like to purchase?"
                + "\n\nThere are 20 rounds per box.  We recommend at least 3 boxes.  "
                + "Each ammo box costs $" + costAmmoBox);
        quantity = toFloat(getInput());
        totAmmo = store.purchaseInventory(bankAmount, quantity, costAmmoBox);
        resource.setAmmo(quantity);
        return totAmmo;
    }

    public float buyWagonSupplies(float bankAmount) {
        System.out.println("How many extra axles would you like to purchase?"
                + "\n\nWe recommend at least 2.  Each axle costs $" + costAxlesWheels);
        numAxles = toFloat(getInput());
        totAxles =  store.purchaseInventory(bankAmount, numAxles, costAxlesWheels);
        resource.setExtraAxles(numAxles);
        
        System.out.println("How many extra wheels would you like to purchase?"
                + "\n\nWe recommend at least 2.  One wheel costs $" + costAxlesWheels);
        numWheels = toFloat(getInput());
        totWheels =  store.purchaseInventory(bankAmount, numWheels, costAxlesWheels);
        resource.setExtraWheels(numWheels);
        
        System.out.println("How many extra wagon covers would you like to purchase?"
                + "\n\nWe recommend at least 2.  Each cover costs $" + costCover);
        numCovers = toFloat(getInput());
        totCovers =  store.purchaseInventory(bankAmount, numCovers, costCover);
        resource.setExtraCovers(numCovers);
        
        return (totAxles + totWheels + totCovers);
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