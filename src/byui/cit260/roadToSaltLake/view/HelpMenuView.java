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
public class HelpMenuView extends View {

    public HelpMenuView() {
        super("\n\n----------------------------------"
                + "\n Help Menu "
                + "\n----------------------------------"
                + "\nG - What is the goal of the game?"
                + "\nM - How is progress displayed?"
                + "\nS - How to get supplies?"
                + "\nH - What hazards could I encounter?"
                + "\nR - Return"
                + "\n----------------------------------\n");
    }

    @Override
    public boolean doAction(Object obj) {
        String value = obj.toString();
        char choice = value.charAt(0);

        switch (choice) {
            case 'G': // Display goal of the game
                this.goal();
                break;
            case 'M': // Display how progress is determined
                this.progressDisplay();
                break;
            case 'S': // Explain how to get supplies
                this.howToGetSupplies();
                break;
            case 'H': // Display list of potential hazards
                this.potentialHazards();
                break;
            case 'R': // return
                return true;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        return false;
    }

    private void goal() {
        System.out.println("\n\n\nThe goal of this game is to travel accross the plains\n"
                + "to the promised land away from persecution in 90 days.\n"
                + "this is a difficult task as you could get lost, or\n"
                + "sickness could slow you down. Other hazards may thwart\n"
                + "your attempt to complete the trek.");
    }

    private void progressDisplay() {
        System.out.println("\n\n\nA map will show you where you have been, how far you\n"
                + "have come, roughly how much further the journey is.\n"
                + "The map display will also show you how many days you\n"
                + "you have traveled.");
    }

    private void howToGetSupplies() {
        System.out.println("\n\n\nSupplies can be purchased at stores when you are at a\n"
                + "settlement.  You can also hunt for perishable food\n"
                + "Skill will play a large roll in this");
    }

    private void potentialHazards() {
        System.out.println("\n\n\nThe potential hazards that could befall your wagon team\n"
                + "include, but are not limited to,:\n"
                + "Extreme Heat\n"
                + "Extreme Cold\n"
                + "Storms\n"
                + "Illness\n"
                + "etc.");
    }
}
