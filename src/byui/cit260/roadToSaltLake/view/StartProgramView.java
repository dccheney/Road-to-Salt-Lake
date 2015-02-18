/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.roadToSaltLake.view;

/**
 *
 * @author David Cheney & Amy Staiger
 */
public class StartProgramView {
    public StartProgramView()
    {
    }
    public void startProgram()
    {
            this.displayBanner();
    }

    private void displayBanner() {
        System.out.println("\n\n*******************************************************************");
        System.out.println("*                                                                     *"
                       + "\n* Welcome to the Road to the Great Salt Lake.  In this game you will  *"
                       + "\n*"
        );
    }
}
