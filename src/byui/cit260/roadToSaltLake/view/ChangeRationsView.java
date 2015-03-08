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
public class ChangeRationsView extends View{
    public ChangeRationsView(){
        super("\n\n----------------------------------"
        +"\n Change Rations "
        +"\n----------------------------------"
        +"\nF - Filling"
        +"\nM - Meager"
        +"\nB - Bare Bones"
        +"\n----------------------------------\n");
    }
    
    @Override
    public boolean doAction(Object obj) {
        String value = obj.toString();
        char choice = value.charAt(0);
        switch (choice) {
            case 'F': // create and start a new game	
                System.out.println("You have chosen Filling");
                break;
            case 'M': // get and start an existing game	
                System.out.println("You have chosen Meager");
                break;
            case 'B': // display the help menu
                System.out.println("You have chosen Meager");
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                return false;
        }
        return true;
    }
    
}
