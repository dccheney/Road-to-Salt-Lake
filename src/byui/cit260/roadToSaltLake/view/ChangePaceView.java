/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.roadToSaltLake.view;

import static java.lang.Character.toUpperCase;
import static java.lang.System.out;
import java.util.Scanner;

/**
 *
 * @author AmyLucille
 */
public class ChangePaceView extends View{
// Travel travel = new Travel();
    public ChangePaceView(){
        super("\n\n**************************"
            + "\n*  Please choose your pace.                        *"
            + "\n*1 - No travelling - 0 miles per hour              *"
            + "\n*2 - Steady Pace - 2.5 miles per hour              *"
            + "\n*3 - Strenuous Pace - 2.75 miles per hour          *"
            + "\n*4 - Gruelling Pace - 5 miles per hour             *"
            + "\n*E - Exit to Game Menu                             *"
            + "\n****************************");
    }
    
    @Override
    public boolean doAction(Object obj) {
        String value = obj.toString();
        char choice = value.charAt(0);
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
            case 'E': // exit to main menu
                return true;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        return false;
    }

    private void noTravelling() {
            System.out.println(" No Travelling function called");
    }

    private void strenuousPace() {
            System.out.println(" No Strenuous Pace function called");
            //double distanceTravelled = travel.mapDistance(2.75, getMinutes())
    }

    private void gruellingPace() {
            System.out.println(" No Gruelling Pace function called");
    }

    private void steadyPace() {
            System.out.println(" No Steady Pace function called");
    }


}
