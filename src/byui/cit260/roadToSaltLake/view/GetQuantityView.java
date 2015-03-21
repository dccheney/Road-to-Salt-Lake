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
        if (null != item)switch (item) {
            case "Oxen":
                message = "How many oxen would you like to purchase?"
                        + "\n\nWe recommend at least 4.  They cost $"
                        + RoadToSaltLake.getCurrentGame().getResourceCostFormat(item)
                        + " per ox";
                break;
            case "Food":
                message = "How many pounds of food would you like to purchase?"
                        + "\n\nWe recommend at least 200.  Food costs $" + RoadToSaltLake.getCurrentGame().getResourceCostFormat(item) + " per pound";
                break;
            case "Clothing":
                message = "How many sets of Clothing would you like to purchase?"
                        + "\n\nWe recommend at least 2 per person.  Each set costs $" + RoadToSaltLake.getCurrentGame().getResourceCostFormat(item);
                break;
            case "Ammo":
                message = "How many boxes of ammunition would you like to purchase?"
                        + "\n\nThere are 20 rounds per box.  We recommend at least 3 boxes.  "
                        + "Each ammo box costs $" + RoadToSaltLake.getCurrentGame().getResourceCostFormat(item);
                break;
            case "Axles":
                message = "How many extra axles would you like to purchase?"
                        + "\n\nWe recommend at least 2.  Each axle costs $" + RoadToSaltLake.getCurrentGame().getResourceCostFormat(item);
                break;
            case "Wheels":
                message = "How many extra wheels would you like to purchase?"
                        + "\n\nWe recommend at least 2.  One wheel costs $" + RoadToSaltLake.getCurrentGame().getResourceCostFormat(item);
                break;
            case "Covers":
                message = "How many extra wagon covers would you like to purchase?"
                        + "\n\nWe recommend at least 2.  Each cover costs $" + RoadToSaltLake.getCurrentGame().getResourceCostFormat(item);
                break;
        }
        System.out.println(message);  // displays message specific to the item they chose to purchase
        quantity = toFloat(getInput());  // get quantity from user
        totItems = store.purchaseInventory(bankAmount, quantity, RoadToSaltLake.getCurrentGame().getResourceCost(item)); // calculates the totalCost after error checking
        if ("Ammo".equals(item))
            quantity *= 20;  // Player buys 1 box and gets 20 rounds of ammo.  Had to adjust the players inventory
        RoadToSaltLake.getPlayer().setResources(item,quantity); // sets amount of resources in player inventory
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
