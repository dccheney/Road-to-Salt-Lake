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
public class StoreView extends View {

    //holds the amount of money that
    private double totOxenCost = 0;
    private double totFoodCost = 0;
    private double totClothingCost = 0;
    private double totAmmoCost = 0;
    private double totWagonPartsCost = 0;

    private double bankAmount = RoadToSaltLake.getPlayer().getMoney();

    private double total = 0;

    GetQuantityView getQuantity = new GetQuantityView();

    public StoreView() {
        super("");
    }

    @Override
    public void display() {

        char selection = ' ';
        do {
            System.out.println("\n\n------------------------------------------------------"
                            +  "\n Store"
                            +  "\n------------------------------------------------------"
                            +  "\nWhat would you like to buy?"
                            +  "\nItem\t\t\t\t\tTotal\nO - Oxen\t\t\t\t$" + totOxenCost
                            +  "\nF - Food\t\t\t\t$" + totFoodCost
                            +  "\nC - Clothing\t\t\t\t$" + totClothingCost
                            +  "\nA - Ammo\t\t\t\t$" + totAmmoCost
                            +  "\nW - Wagon Supplies\t\t\t$" + totWagonPartsCost
                            +  "\n------------------------------------------------------"
                            +  "\n\t\t\tTotal:\t\t$" + total
                            +  "\n\nAmount you have:\t$" + bankAmount
                            +  "\n\nE - Exit Store"
                            +  "\n------------------------------------------------------\n"); //display the main menu 

            String input = this.getInput(); // get the user's selection
            selection = toUpperCase(input.charAt(0)); // get first character of string

            this.doAction(selection); //do action based on selection

        } while (selection != 'E');
    }

    @Override
    public boolean doAction(Object obj) {
        String value = obj.toString();
        char choice = value.charAt(0);
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
                RoadToSaltLake.getPlayer().setMoney(bankAmount);
                return true;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        return false;
    }

    private void getTotal() {
        this.checkError();

        total = totOxenCost + totFoodCost + totClothingCost + totAmmoCost + totWagonPartsCost;

        bankAmount -= total;
        if (total + bankAmount != RoadToSaltLake.getPlayer().getMoney()) {
            bankAmount = RoadToSaltLake.getPlayer().getMoney() - total;
        }
    }

    private void checkError() {
        if (totOxenCost == -1 || totFoodCost == -1 || totClothingCost == -1
                || totAmmoCost == -1 || totWagonPartsCost == -1) {
            System.out.println("You don't have enough money for that. Please try"
                    + "again.");
            this.display();
        } else if (totOxenCost == -2 || totFoodCost == -2 || totClothingCost == -2
                || totAmmoCost == -2 || totWagonPartsCost == -2) {
            System.out.println("The item quantity must be greater than 0. Please"
                    + "try again.");
            this.display();
        } else if (totOxenCost == -3 || totFoodCost == -3 || totClothingCost == -3
                || totAmmoCost == -3 || totWagonPartsCost == -3) {
            System.out.println("The item price was less than 0. Please try again.");
            this.display();
        } else if (totOxenCost == -4 || totFoodCost == -4 || totClothingCost == -4
                || totAmmoCost == -4 || totWagonPartsCost == -4) {
            System.out.println("You don't have enough money for that. Please try"
                    + "again.");
            this.display();
        }
    }
}
