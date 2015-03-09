/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.roadToSaltLake.view;

/**
 *
 * @author David Cheney & AmyLucille
 */
public class GameMenuView extends View {

    //private final String MENU = "\n"
    public GameMenuView() {
        super("\n\n--------------------------------"
            + "\n Game Menu "
            + "\n--------------------------------"
            + "\nC - Continue on trail"
            + "\nS - Check Supplies"
            + "\nP - Change pace"
            + "\nF - Change food rations"
            + "\nB - Buy supplies"
            + "\nM - Main Menu"
            + "\n--------------------------------\n");
    }
    
    @Override
    public boolean doAction(Object obj) {
        String value = obj.toString();
        char choice = value.charAt(0);
        switch (choice) {
            case 'C': // Continue on Trail	
                this.continueTrail();
                break;
            case 'S': // Check Supplies
                this.checkSupplies();
                break;
            case 'P': // Change Pace
                this.changePace();
                break;
            case 'F': // Change Food Rations
                this.changeRations();
                break;
            case 'B': // Buy Supplies
                this.buySupplies();
                break;
            case 'M': // Main Menu
                return true;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        return false;
    }
    private void continueTrail() {
        System.out.println("*** ContinueTrail function called");
    }

    private void checkSupplies() {
        System.out.println("*** CheckSupplies function called");
    }

    private void changePace() {
        ChangePaceView changePaceView = new ChangePaceView();
        changePaceView.display();
    }

    private void changeRations() {
        ChangeRationsView changeRationsView = new ChangeRationsView();
        changeRationsView.display();
    }

    private void buySupplies() {
        StoreView store = new StoreView();
        store.display();
    }
}
    
