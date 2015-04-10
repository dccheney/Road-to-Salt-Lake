/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.roadToSaltLake.view;

import java.io.PrintWriter;
import roadtosaltlake.RoadToSaltLake;

/**
 *
 * @author David
 */
public class ErrorView {

    private static final PrintWriter errorFile = RoadToSaltLake.getOutFile();
    private static final PrintWriter logFile = RoadToSaltLake.getLogFile();

    public static void display(String className, String errorMessage) {
        errorFile.println(
                "-----------------------------------------------------"
                + "\n- ERROR - " + errorMessage
                + "\n-----------------------------------------------------");
        
        logFile.println(className + " - " + errorMessage);
    }
}
