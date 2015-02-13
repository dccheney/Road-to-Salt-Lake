/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.roadToSaltLake.control;

/**
 *
 * @author AmyLucille
 */
public class Travel {
    
    
    double mapDistance (int userPace, double userMinutes)
    {
        double distanceTraveled;
        
        if (userPace <= 0 || userPace > 4)
        {
            return -1;
        }
        
        if (userMinutes < 0 || userMinutes > 480) 
        {
            return -2;
        }
       
        distanceTraveled = userMinutes/60 * userPace;
        
        return distanceTraveled;
    }   
       
}