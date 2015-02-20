/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.roadToSaltLake.view;

/**
 *
 * @author AmyLucille
 */
public class MainMenuView {

    private final String MENU = "\n"
                +"\n----------------------"
                +"\n Main Menu "
                +"\n----------------------"
                +"\nC - Continue on Trail"
                +"\nK - Check Supplies"
                +"\nP - Change Pace"
                +"\nF - Change Food Rations"
                +"\nR - Stop to rest"
                +"\nB - Buy Supplies"
                +"\nE - Exit game"
                +"\nS - Save game"
                +"\n------------------------------";
    
    
    public void displayMenu() {
        char selection = ' ';
        do {
            System.out.println(MENU); //display the main menu
            
            String input = this.getInput(); // get the user's selection
            selection = input.charAt(0); // get first character of string
            
            this.doAction(selection); //do action based on selection
            
        } while (selection !='E');
        }

    private void doAction(char selection) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private String getInput() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
                
    }
    
