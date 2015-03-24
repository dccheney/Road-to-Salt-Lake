/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.roadToSaltLake.view;

import java.text.DecimalFormat;
import roadtosaltlake.RoadToSaltLake;

/**
 *
 * @author David Cheney & Amy Staiger
 */
public class StoreView extends View {
    //holds the amount of money that
    private double totOxenCost = 0.0;
    private double totFoodCost = 0.0;
    private double totClothingCost = 0.0;
    private double totAmmoCost = 0.0;
    private double totAxleCost = 0.0;
    private double totWheelCost = 0.0;
    private double totCoverCost = 0.0;
    private double bankAmount = RoadToSaltLake.getPlayer().getMoney();
    private double total = 0.0;
    private final DecimalFormat i = new DecimalFormat("0.00");

    GetQuantityView getQuantity = new GetQuantityView();

    public StoreView(){
        super("");
        printStore();
    }
    
    public void printStore(){
        System.out.println("\n\n------------------------------------------------------"
                        +  "\n Store"
                        +  "\n------------------------------------------------------\n"
                        +  "\nWhat would you like to buy?" 
                        +  "\nItem\t\t\t\t\tTotal\n----\t\t\t\t\t-----"
                        +  "\nO - Oxen\t\t\t\t$" + i.format(totOxenCost)
                        +  "\nF - Food\t\t\t\t$" + i.format(totFoodCost)
                        +  "\nC - Clothing\t\t\t\t$" + i.format(totClothingCost)
                        +  "\nA - Ammo\t\t\t\t$" + i.format(totAmmoCost)
                        +  "\nX - Extra Axles\t\t\t\t$" + i.format(totAxleCost)
                        +  "\nW - Extra Wheels\t\t\t$" + i.format(totWheelCost)
                        +  "\nV - Extra Wagon Covers\t\t\t$" + i.format(totCoverCost)
                        +  "\n------------------------------------------------------"
                        +  "\n\t\t\tTotal:\t\t$" + i.format(total)
                        +  "\n\nAmount you have:\t$" + i.format(bankAmount)
                        +  "\nE - Exit Store"
                        +  "\n------------------------------------------------------\n");
    }
    
    @Override
    public boolean doAction(Object obj) {
        String value = obj.toString();
        char choice = value.charAt(0);
        switch (choice) {
            case 'O': // Buy Oxen	
                totOxenCost = getQuantity.buyItem("Oxen",bankAmount);
                getTotal();
                break;
            case 'F': // Buy Food
                totFoodCost = getQuantity.buyItem("Food",bankAmount);
                getTotal();
                break;
            case 'C': // buy Clothing
                totClothingCost = getQuantity.buyItem("Clothing",bankAmount);
                getTotal();
                break;
            case 'A': // Change Food Rations
                totAmmoCost = getQuantity.buyItem("Ammo",bankAmount);
                getTotal();
                break;
            case 'X': // Buy Wagon Supplies
                totAxleCost = getQuantity.buyItem("Axles",bankAmount);
                getTotal();
                break;
            case 'W':
                totWheelCost = getQuantity.buyItem("Wheels",bankAmount);
                getTotal();
                break;
            case 'V':
                totCoverCost = getQuantity.buyItem("Covers",bankAmount);
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

        total = totOxenCost + totFoodCost + totClothingCost + totAmmoCost + 
                totAxleCost + totWheelCost + totCoverCost;
        
        bankAmount -= total;
        if (total + bankAmount != RoadToSaltLake.getPlayer().getMoney()) {
            bankAmount = RoadToSaltLake.getPlayer().getMoney() - total;
        }
        printStore();
    }

    private void checkError() {
        if (totOxenCost == -1 || totFoodCost == -1 || totClothingCost == -1
                || totAmmoCost == -1 || totAxleCost == -1 || totWheelCost == -1
                || totCoverCost == -1) {
            System.out.println("You don't have enough money for that. Please try"
                    + "again.");
            this.display();
        } else if (totOxenCost == -2 || totFoodCost == -2 || totClothingCost == -2
                || totAmmoCost == -2 || totAxleCost == -2 || totWheelCost == -2
                || totCoverCost == -2) {
            System.out.println("The item quantity must be greater than 0. Please"
                    + "try again.");
            this.display();
        } else if (totOxenCost == -3 || totFoodCost == -3 || totClothingCost == -3
                || totAmmoCost == -3 || totAxleCost == -3 || totWheelCost == -3
                || totCoverCost == -3) {
            System.out.println("The item price was less than 0. Please try again.");
            this.display();
        } else if (totOxenCost == -4 || totFoodCost == -4 || totClothingCost == -4
                || totAmmoCost == -4 || totAxleCost == -4 || totWheelCost == -4
                || totCoverCost == -4) {
            System.out.println("You don't have enough money for that. Please try"
                    + "again.");
            this.display();
        }
    }
}