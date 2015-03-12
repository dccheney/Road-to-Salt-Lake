/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.roadToSaltLake.view;

import byui.cit260.roadToSaltLake.control.Store;
import java.util.Scanner;
import roadtosaltlake.RoadToSaltLake;
/**
 *
 * @author David
 */
public class GetQuantityView  {
    Store store = new Store();

    private double quantity = 0.0; // initializes the number of Items to be purchased

    private double totItems = 0.0;
    
    private String message = "";
    
    public String getInput() {
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
            double d = Float.parseFloat(input);  
        }  
        catch(NumberFormatException nfe)  
        {  
            return false;  
        }  
        return true; 
    }   
    
    
    public double buyItem(String item, double bankAmount) {
        if ("Oxen".equals(item)){
            message = "How many oxen would you like to purchase?"
                + "\n\nWe recommend at least 4.  They cost $" + resourceCost.get(item) + " per ox";
        }
        else if ("Food".equals(item)){
            message = "How many pounds of food would you like to purchase?"
                + "\n\nWe recommend at least 200.  Food costs $" + resourceCost.get(item) + " per pound";
        }
        else if ("Clothing".equals(item)){
            message = "How many sets of Clothing would you like to purchase?"
                + "\n\nWe recommend at least 2 per person.  Each set costs $" + resourceCost.get(item);
        }
        else if ("Ammo".equals(item)){
            message = "How many boxes of ammunition would you like to purchase?"
                + "\n\nThere are 20 rounds per box.  We recommend at least 3 boxes.  "
                + "Each ammo box costs $" + resourceCost.get(item);
        }
        else if ("Axles".equals(item)){
            message = "How many extra axles would you like to purchase?"
                    + "\n\nWe recommend at least 2.  Each axle costs $" + resourceCost.get(item);
        }
        else if ("Wheels".equals(item)){
            message = "How many extra wheels would you like to purchase?"
                    + "\n\nWe recommend at least 2.  One wheel costs $" + resourceCost.get(item);
        }
        else if ("Covers".equals(item)){
            message = "How many extra wagon covers would you like to purchase?"
                    + "\n\nWe recommend at least 2.  Each cover costs $" + resourceCost.get(item);
        }
        System.out.println(message);
        quantity = toFloat(getInput());
        totItems = store.purchaseInventory(bankAmount, quantity, resourceCost.get(item));
        RoadToSaltLake.getPlayer().setResources(item,quantity);
        return totItems;
    }

    private double toFloat(String input) {
        return toFloat(input, 0.0);
    }
    
    public static double toFloat(String str, double defaultValue) {
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
