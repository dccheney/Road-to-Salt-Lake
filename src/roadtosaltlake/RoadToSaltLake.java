/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package roadtosaltlake;

import byui.cit260.roadToSaltLake.model.Game;
import byui.cit260.roadToSaltLake.model.Player;
import byui.cit260.roadToSaltLake.view.StartProgramView;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 *
 * @author David Cheney and Amy Staiger
 */
public class RoadToSaltLake {

    private static Game currentGame = null;
    private static Player player = null;

    private static PrintWriter outFile = null;
    private static BufferedReader inFile = null;
    private static PrintWriter logFile = null;

    public static void main(String[] args) {
        try {
            
            // open character stream files for end user input and output
            RoadToSaltLake.inFile
                    = new BufferedReader(new InputStreamReader(System.in));
            RoadToSaltLake.outFile = new PrintWriter(System.out, true);
            
            // open log file
            String filePath = "log.txt";
            RoadToSaltLake.logFile = new PrintWriter(filePath);

            StartProgramView startProgramView = new StartProgramView();
            startProgramView.startProgram();
        } catch (Throwable e) {
            System.out.println("Exception: " + e.toString()
                    + "\nCause: " + e.getCause()
                    + "\nMessage: " + e.getMessage());
            e.printStackTrace();
        }
        
        finally {
            try {
                if (RoadToSaltLake.inFile != null)
                    RoadToSaltLake.inFile.close();
                if (RoadToSaltLake.outFile != null)
                    RoadToSaltLake.outFile.close();
                if (RoadToSaltLake.logFile != null)
                    RoadToSaltLake.logFile.close();
            } catch (IOException ex){
                System.out.println("Error closing files");
                return;
            }
        }
    }

    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        RoadToSaltLake.outFile = outFile;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInFile(BufferedReader inFile) {
        RoadToSaltLake.inFile = inFile;
    }

    public static PrintWriter getLogFile() {
        return logFile;
    }
    
    public static void setLogFile(PrintWriter logFile) {
        RoadToSaltLake.logFile = logFile;
    }
    
    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        RoadToSaltLake.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        RoadToSaltLake.player = player;
    }

}
