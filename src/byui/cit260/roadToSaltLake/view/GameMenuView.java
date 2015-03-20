/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.roadToSaltLake.view;

import byui.cit260.roadToSaltLake.control.GameControl;
import byui.cit260.roadToSaltLake.model.Game;
import roadtosaltlake.RoadToSaltLake;

/**
 *
 * @author David Cheney & AmyLucille
 */
public class GameMenuView extends View {
    private Object mapView;
    private Object viewMap;

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
            + "\nV - View location on map"
            + "\nD - View distance traveled"
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
            case 'V': // view locatin on map
                this.viewMap();
                break;
            case 'D': // view distance traveled
                this.viewDistanceTraveled();
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
        CheckSuppliesView checkSuppliesView = new CheckSuppliesView();
        checkSuppliesView.display();
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

    private void viewMap() {
        ViewMapView viewMapView = new ViewMapView();
        //viewMap.display();
        }

    private void viewDistanceTraveled() {
        Game game = RoadToSaltLake.getCurrentGame();
        double totalMilesTraveled = GameControl.getDistanceTraveled(game.getDayDistance());
        System.out.println("The Total Miles Traveled is " + totalMilesTraveled);
               
    }
}
    
