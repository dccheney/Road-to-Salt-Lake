/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.roadToSaltLake.view;

import byui.cit260.roadToSaltLake.control.Store;
import java.util.HashMap;
import java.util.Scanner;
import roadtosaltlake.RoadToSaltLake;
/**
 *
 * @author David
 */
public class GetQuantityView {
    Store store = new Store();

    private double quantity = 0;
    private double numAxles = 0;       // initializes the number of Axles to be purchased
    private double numCovers = 0;      // ""    ""    ""     ""     Covers   ""    ""
    private double numWheels = 0;      // ""    ""    ""     ""     Wheels   ""    ""
    
    // Sets cost of each item and can't be changed
    HashMap <String, Double> resourceCost = new HashMap <String, Double>();
    public GetQuantityView(){
        resourceCost.put("Oxen", 30.0);
        resourceCost.put("Food", .20); 
        resourceCost.put("Clothing", 2.0);
        resourceCost.put("Ammo", 2.0);
        resourceCost.put("AxlesWheels", 10.0);
        resourceCost.put("Covers", 5.0);
        
    }
    
    private double totOxen = 0;
    private double totFood = 0;
    private double totClothing = 0;
    private double totAmmo = 0;
    private double totAxles = 0;
    private double totWheels = 0;
    private double totCovers = 0;
    
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
    
    
    public double buyOxen(double bankAmount) {
        System.out.println("How many oxen would you like to purchase?"
                + "\n\nWe recommend at least 4.  They cost $" + resourceCost.get("Oxen") + " per ox");
        quantity = toFloat(getInput());
        totOxen = store.purchaseInventory(bankAmount, quantity, resourceCost.get("Oxen"));
        RoadToSaltLake.getPlayer().getResources().put("Oxen",quantity);
        return totOxen;
    }

    public double buyFood(double bankAmount) {
        System.out.println("How many pounds of food would you like to purchase?"
                + "\n\nWe recommend at least 200.  Food costs $" + resourceCost.get("Food") + " per pound");
        quantity = toFloat(getInput());
        totFood = store.purchaseInventory(bankAmount, quantity, resourceCost.get("Food"));
        RoadToSaltLake.getPlayer().getResources().put("Food",quantity);
        return totFood;
    }

    public double buyClothing(double bankAmount) {
        System.out.println("How many sets of Clothing would you like to purchase?"
                + "\n\nWe recommend at least 2 per person.  Each set costs $" + resourceCost.get("Clothing"));
        quantity = toFloat(getInput());
        totClothing = store.purchaseInventory(bankAmount, quantity, resourceCost.get("Clothing"));
        RoadToSaltLake.getPlayer().getResources().put("Clothing",quantity);
        return totClothing;
    }

    public double buyAmmo(double bankAmount) {
        System.out.println("How many boxes of ammunition would you like to purchase?"
                + "\n\nThere are 20 rounds per box.  We recommend at least 3 boxes.  "
                + "Each ammo box costs $" + resourceCost.get("Ammo"));
        quantity = toFloat(getInput());
        totAmmo = store.purchaseInventory(bankAmount, quantity, resourceCost.get("Ammo"));
        RoadToSaltLake.getPlayer().getResources().put("Ammo",quantity);
        return totAmmo;
    }

    public double buyWagonSupplies(double bankAmount) {
        System.out.println("How many extra axles would you like to purchase?"
                + "\n\nWe recommend at least 2.  Each axle costs $" + resourceCost.get("AxlesWheels"));
        numAxles = toFloat(getInput());
        totAxles =  store.purchaseInventory(bankAmount, numAxles, resourceCost.get("AxlesWheels"));
        RoadToSaltLake.getPlayer().getResources().put("Alxes",numAxles);
        
        System.out.println("How many extra wheels would you like to purchase?"
                + "\n\nWe recommend at least 2.  One wheel costs $" + resourceCost.get("AxlesWheels"));
        numWheels = toFloat(getInput());
        totWheels =  store.purchaseInventory(bankAmount, numWheels, resourceCost.get("AxlesWheels"));
        RoadToSaltLake.getPlayer().getResources().put("Wheels",numWheels);
        
        System.out.println("How many extra wagon covers would you like to purchase?"
                + "\n\nWe recommend at least 2.  Each cover costs $" + resourceCost.get("Covers"));
        numCovers = toFloat(getInput());
        totCovers =  store.purchaseInventory(bankAmount, numCovers, resourceCost.get("Covers"));
        RoadToSaltLake.getPlayer().getResources().put("Covers",numCovers);
        
        return (totAxles + totWheels + totCovers);
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