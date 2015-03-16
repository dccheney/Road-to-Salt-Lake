/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.roadToSaltLake.control;

import byui.cit260.roadToSaltLake.model.Player;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author AmyLucille
 */
public class GameControlTest {
    
    public GameControlTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of createNewGame method, of class GameControl.
     */
    //@Test
//    public void testCreateNewGame() {
//        System.out.println("createNewGame");
//        Player player = null;
//        GameControl.createNewGame(player);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of getDistanceTraveled method, of class GameControl.
     */
    @Test
    public void testGetDistanceTraveled() {
        System.out.println("getDistanceTraveled");
        double[] milesTraveled = {45, 20, 0, 36, 10};
        double expResult = 111.0;
        double result = GameControl.getDistanceTraveled(milesTraveled);
        assertEquals(expResult, result, 0.001);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
