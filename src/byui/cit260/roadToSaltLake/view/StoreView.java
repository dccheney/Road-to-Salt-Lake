/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.roadToSaltLake.view;

import static java.lang.Character.toUpperCase;
import java.util.Scanner;
import roadtosaltlake.RoadToSaltLake;

/**
 *
 * @author David Cheney & Amy Staiger
 */
public class StoreView {    
    //holds the amount of money that
    private float totOxenCost = 0f;
    private float totFoodCost = 0f;
    private float totClothingCost = 0f;
    private float totAmmoCost = 0f;
    private float totWagonPartsCost = 0f;
 
    private float bankAmount = RoadToSaltLake.getPlayer().getMoney();
    
    private float total = 0f;
    
    GetQuantityView getQuantity = new GetQuantityView();
    
    
    void displayMenu() {
        char selection = ' ';
        do {
            System.out.println("\n"
            + "\n------------------------------------------------------"
            + "\n Store"
            + "\n------------------------------------------------------"
            + "\nWhat would you like to buy?"
            + "\nItem\t\t\t\t\tTotal"
            + "\nO - Oxen\t\t\t\t$" + totOxenCost
            + "\nF - Food\t\t\t\t$" + totFoodCost
            + "\nC - Clothing\t\t\t\t$" + totClothingCost
            + "\nA - Ammo\t\t\t\t$" + totAmmoCost
            + "\nW - Wagon Supplies\t\t\t$" + totWagonPartsCost 
            + "\n------------------------------------------------------"
            + "\n\t\t\tTotal:\t\t$" + total
            + "\n\nAmount you have:\t$" + bankAmount
            + "\n\nE - Exit Store"
            + "\n------------------------------------------------------"); //display the main menu
            
            String input = this.getInput(); // get the user's selection
            selection = toUpperCase(input.charAt(0)); // get first character of string
            
            this.doAction(selection); //do action based on selection
            
        } while (selection !='E');
    }
    
    void doAction(char choice)
    {
        switch (choice) {
            case 'O': // Buy Oxen	
                totOxenCost = getQuantity.buyOxen(bankAmount);
                getTotal();
                break;
            case 'F': // Buy Food
                totFoodCost = getQuantity.buyFood(bankAmount);
                getTotal();
                break;
            case 'C': // buy Clothing
                totClothingCost = getQuantity.buyClothing(bankAmount);
                getTotal();
                break;
            case 'A': // Change Food Rations
                totAmmoCost = getQuantity.buyAmmo(bankAmount);
                getTotal();
                break;
            case 'W': // Buy Wagon Supplies
                totWagonPartsCost = getQuantity.buyWagonSupplies(bankAmount);
                getTotal();
                break;
            case 'E':
                
                RoadToSaltLake.getPlayer().setMoney(-total);
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
            float d = Float.parseFloat(input);  
        }  
        catch(NumberFormatException nfe)  
        {  
            return false;  
        }  
        return true; 
    }   

    private void getTotal() {
        total = totOxenCost + totFoodCost + totClothingCost + totAmmoCost + totWagonPartsCost;
        bankAmount -= total;
        if (total + bankAmount != RoadToSaltLake.getPlayer().getMoney())
        {
            bankAmount = RoadToSaltLake.getPlayer().getMoney() - total;
        }
    }
}