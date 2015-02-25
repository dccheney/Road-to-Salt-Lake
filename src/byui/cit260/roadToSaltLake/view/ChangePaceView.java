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
public class ChangePaceView {

    private final String MENU = "\n"
            + "\n**************************"
            + "\n*  Please choose your pace.                        *"
            + "\n*1 - No travelling - 0 miles per hour              *"
            + "\n*2 - Steady Pace - 2.5 miles per hour              *"
            + "\n*3 - Strenuous Pace - 2.75 miles per hour          *"
            + "\n*4 - Gruelling Pace - 5 miles per hour             *"
            + "\n*E -  Exit to Game Menu                             *"
            + "\n****************************";

    void displayMenu() {
        char selection = ' ';
        do {
            System.out.println("\n****************************");

            System.out.println("*                                           *"
                    + "\n* When travelling along the trail                  *"
                    + "\n* the travellers encounterd many different         *"
                    + "\n* conditions that affected their pace.  Choose     *"
                    + "\n* wisely and take into account how many rations    *"
                    + "\n* you have and the health of your party members.   *");

            System.out.println("****************************");

            System.out.println(MENU); //display the main menu

            String input = this.getInput(); // get the user's selection
            selection = toUpperCase(input.charAt(0)); // get first character of string

            this.doAction(selection); //do action based on selection

        } while (selection != 'E');
    
    

    private String getInput() {
        boolean valid = false; // indicates if the name has been retrieved
        String input = null;
        Scanner keyboard = new Scanner(System.in);  //keyboard input stream

        while (!valid) { // while a valid menu item has not been retrieved

            //prompt for the menu selection
            System.out.println("Enter in your selection:");

            // get the selection from the keyboard and trim off the blanks
            input = keyboard.nextLine();
            input = input.trim();

            //if the name is invalid (less than two characters in length
            if (input.length() != 1) {
                System.out.println("Invalid entry - the entry must not be blank");
                continue; //and repeat again
            }
            break;
        }
        return input; // return the name.
    }

    void doAction(char choice) {
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
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
    }

    private void noTravelling() {
            System.out.println(" No Travelling function called");
    }

    private void strenuousPace() {
            System.out.println(" No Strenuous Pace function called");
    }

    private void gruellingPace() {
            System.out.println(" No Gruelling Pace function called");
    }

    private void steadyPace() {
            System.out.println(" No Steady Pace function called");
    }
}
}
