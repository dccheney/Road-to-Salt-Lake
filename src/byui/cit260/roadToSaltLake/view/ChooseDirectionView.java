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
public class ChooseDirectionView extends View{
     public ChooseDirectionView(){
        super("\n\n--------------------------------------"
            + "\n Please choose your direction"
            + "\n--------------------------------------"
            + "\nO - No travelling"
            + "\nN - Northwest"
            + "\nW - West"
            + "\nS - Southwest"
            + "\n--------------------------------------"
            + "\nE - Exit"
            + "\n--------------------------------------\n");
    }

    @Override
    public boolean doAction(Object obj) {
        String value = obj.toString();
        char choice = value.charAt(0);
        switch (choice) {
            case 'O': // no travelling - 0 miles per hour
            case '0':
                this.noTravelling();
                break;
            case 'N': // steady pace - 2.5 miles per hour
                this.moveNorthWest();
                break;
            case 'W': // strenuous pace - 2.75 miles per hour
                this.moveWest();
                break;
            case 'S': // gruelling pace - 5 miles per hour
                this.moveSouthWest();
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
        System.out.println("Rest for a day");
    }

    private void moveNorthWest() {
        System.out.println("Move Northwest");
    }

    private void moveWest() {
        System.out.println("Move West");
    }

    private void moveSouthWest() {
        System.out.println("Move Southwest");
    }
}
