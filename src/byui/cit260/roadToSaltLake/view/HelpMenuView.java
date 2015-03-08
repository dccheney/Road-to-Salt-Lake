/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.roadToSaltLake.view;

/**
 *
 * @author David
 */
public class HelpMenuView extends View{
    public HelpMenuView(){
        super("\n\n----------------------------------"
        +"\n Help Menu "
        +"\n----------------------------------"
        +"\nG - What is the goal of the game?"
        +"\nM - How is progress displayed?"
        +"\nS - How to get supplies"
        +"\nH - What hazards could I encounter"
        +"\nR - Return"
        +"\n----------------------------------");
    }
    
    @Override
    public boolean doAction(Object obj) {
        String value = obj.toString();
        char choice = value.charAt(0);
        switch (choice) {
            case 'G': // Continue on Trail	
                this.goal();
                break;
            case 'M': // Check Supplies
                this.progressDisplay();
                break;
            case 'S': // Change Pace
                this.howToGetSupplies();
                break;
            case 'H': // Change Food Rations
                this.potentialHazards();
                break;
            case 'R': // Buy Supplies
                System.out.println("*** Leaving Help Menu ***");
                return true;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }   
        return false;
    }
    
    private void goal() {
        System.out.println("*** goal function called ***");
    }

    private void progressDisplay() {
        System.out.println("*** progressDisplay function called ***");
    }

    private void howToGetSupplies() {
        System.out.println("*** howToGetSupplies function called ***");
    }

    private void potentialHazards() {
        System.out.println("*** potentialHazards function called ***");
    }
}
