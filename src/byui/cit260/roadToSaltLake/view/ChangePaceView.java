/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.roadToSaltLake.view;

import static java.lang.System.out;

/**
 *
 * @author AmyLucille
 */
public class ChangePaceView {
    
    public ChangePaceView() {
    }
    public void changePace() {
        //Display the menu 
        this.displayMenu();
        
        //prompt the player to enter their selection of pace
        
        
        //prompt the player to enter their minutes travelled
        
        
        //display the options the player chose
                
        //move ahead in the game
                
        //display to the player how long they travelled and how far they went
        
        
    }

    public void displayMenu() {
        System.out.println("\n****************************");
        
        System.out.println("*                                           *"
                + "\n* When travelling along the trail                  *"
                + "\n* the travellers encounterd many different         *"
                + "\n* conditions that affected their pace.  Choose     *"
                + "\n* wisely and take into account how many rations    *"
                + "\n* you have and the health of your party members.   *");
        
        System.out.println("****************************");
   
    }
    
    public double paceTravelled () {
        System.out.println("\n**************************");
        
        System.out.println("*                                           *"
                + "\n*  Please choose your pace.                        *"
                + "\n*1 - No travelling - 0 miles per hour              *"
                + "\n*2 - Steady Pace - 2.5 miles per hour              *"
                + "\n*3 - Strenuous Pace - 2.75 miles per hour          *"
                + "\n*4 - Gruelling Pace - 5 miles per hour             *");
        
        System.out.println("****************************");
     
    void doAction(char choice)    {
        switch (choice) {
            case '1': // no travelling - 0 miles per hour	
                this.noTravelling();
                break;
            case '2': // steady pace - 2.5 miles per hour
                this.steadyPace();
                break;
            case '3': // strenuos pace - 2.75 miles per hour
                this.strenuousPace();
                break;
            case '4': // gruelling pace - 5 miles per hour
                this.gruellingPace();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }    
    }
     
        
     public double minutesTravelled () {
        System.out.println("\n**************************");
        
        System.out.println("*                                           *"
                + "\n*  Please indicate the number of minutes travelled.*");
        
        System.out.println("****************************");   
   
    }

    private void noTravelling() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void strenuousPace() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void gruellingPace() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void steadyPace() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

        