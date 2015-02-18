/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.roadToSaltLake.control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author AmyLucille
 */
public class TravelTest {
    
    public TravelTest() {
    }

    /**
     * Test of mapDistance method, of class Travel.
     */
    @Test
    public void testMapDistance() {
       // test 1 mapDistance invalid userPace
        
        System.out.println("mapDistance test 1");
        int userPace = 5;
        double userMinutes = 360.0;
        Travel instance = new Travel();
        double expResult = -1;
        double result = instance.mapDistance(userPace, userMinutes);
        assertEquals(expResult, result, 0.0);
   
       // test 2 mapDistance invalid userMinutes
        
        System.out.println("mapDistance test 2");
        userPace = 2;
        userMinutes = 550.0;
        instance = new Travel();
        expResult = -2;
        result = instance.mapDistance(userPace, userMinutes);
        assertEquals(expResult, result, 0.0);
    
       // test 3 mapDistance invalid userMinutes
        
        System.out.println("mapDistance test 3");
        userPace = 2;
        userMinutes = -12;
        instance = new Travel();
        expResult = -2;
        result = instance.mapDistance(userPace, userMinutes);
        assertEquals(expResult, result, 0.0);
    
       // test 4 mapDistance invalid userPace
        
        System.out.println("mapDistance test 4");
        userPace = -1;
        userMinutes = 360.0;
        instance = new Travel();
        expResult = -1;
        result = instance.mapDistance(userPace, userMinutes);
        assertEquals(expResult, result, 0.0);
    }
}
