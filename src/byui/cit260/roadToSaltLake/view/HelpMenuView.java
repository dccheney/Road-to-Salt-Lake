/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.roadToSaltLake.view;

import static java.lang.Character.toUpperCase;


/**
 *
 * @author David
 */
public class HelpMenuView extends View {
    private final String MENU = "\n"
        +"\n----------------------------------"
        +"\n Help Menu "
        +"\n----------------------------------"
        +"\nG - What is the goal of the game?"
        +"\nM - How is progress displayed?"
        +"\nS - How to get supplies"
        +"\nH - What hazards could I encounter"
        +"\nR - Return"
        +"\n----------------------------------";
    
    void displayMenu() {
        char selection = ' ';
        do {
            System.out.println(MENU); //display the main menu
            
            String input = this.getInput(); // get the user's selection
            selection = toUpperCase(input.charAt(0)); // get first character of string
            
            this.doAction(selection); //do action based on selection
            
        } while (selection !='R');
    }
    
     void doAction(char choice)
    {
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
                return;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        
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

    @Override
    public void display() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void doAction(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
