/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.roadToSaltLake.control;

/**
 *
 * @author David Cheney and Amy Staiger
 */
public class store {    
    
    double purchaseInventory(double funds, int item, double itemQuantity, double itemPrice)
    {   
        double totalCost;
        
        if (funds <= 0)
        {
            return -1;
        }
        else if (item <= 0 || item > 5)
        {
            return -2;
        }
        else if (itemQuantity <= 0)
        {
            return -3;
        }
        else if (itemPrice <= 0)
        {
            return -4;
        }
        else if (itemQuantity * itemPrice > funds)
        {
            return -5;
        }
        else
        {
            totalCost = itemQuantity * itemPrice;
        }
       
        return totalCost;
    }
}
