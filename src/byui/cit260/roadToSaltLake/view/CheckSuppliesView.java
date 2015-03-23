/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.roadToSaltLake.view;
import roadtosaltlake.RoadToSaltLake;

/**
 *
 * @author David
 */
public class CheckSuppliesView extends View{
    
    public CheckSuppliesView(){
        
        super( "\n\n------------------------------------------------------"
            +  "\n Your Supplies"
            +  "\n------------------------------------------------------"
            +  "\nItem\t\t\t\t\tQuantity\nOxen \t\t\t\t\t" + RoadToSaltLake.getCurrentGame().getPlayer().getResources("Oxen")
            +  "\nPounds of Food\t\t\t\t" + RoadToSaltLake.getCurrentGame().getPlayer().getResources("Food")
            +  "\nSets of ClothingClothing\t\t" + RoadToSaltLake.getCurrentGame().getPlayer().getResources("Clothing")
            +  "\nAmmo\t\t\t\t\t" + RoadToSaltLake.getCurrentGame().getPlayer().getResources("Ammo")
            +  "\nExtra Axles\t\t\t\t" + RoadToSaltLake.getCurrentGame().getPlayer().getResources("Axles")
            +  "\nExtra Wheels\t\t\t\t" + RoadToSaltLake.getCurrentGame().getPlayer().getResources("Wheels")
            +  "\nExtra Wagon Covers\t\t\t" + RoadToSaltLake.getCurrentGame().getPlayer().getResources("Covers")
            +  "\nMoney left:\t\t\t\t$" + RoadToSaltLake.getCurrentGame().getPlayer().getMoneyFormat()
            +  "\n------------------------------------------------------"
            +  "\nE - Exit"
            +  "\n------------------------------------------------------\n");
        
    }
    
    @Override
    public boolean doAction(Object obj) {
        String value = obj.toString();
        char choice = value.charAt(0);
        
        if (choice == 'E')
            return true;
        else
            return false;
    }
}
