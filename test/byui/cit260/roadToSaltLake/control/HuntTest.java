/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.roadToSaltLake.control;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author David
 */
public class HuntTest {
    Hunt instance;
    public HuntTest() {
    }
    @Before
    public void setup(){
      instance = new Hunt();   
    }

    /**
     * Test of hunting method, of class Hunt.
     */
    @Test
    public void testHunting1() {
        System.out.println("\tTest Case #1");
        int ammo = 10;
        int ammoToUse = 5;
        int skill = 5;
        int expResult = skill * 5;
        int result = instance.hunting(ammo, ammoToUse, skill);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testHunting2() {
        System.out.println("\tTest Case #2");
        int ammo = 0;
        int ammoToUse = 5;
        int skill = 5;
        int expResult = -2;
        int result = instance.hunting(ammo, ammoToUse, skill);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testHunting3() {
        System.out.println("\tTest Case #3");
        int ammo = 10;
        int ammoToUse = 0;
        int skill = 5;
        int expResult = -1;
        int result = instance.hunting(ammo, ammoToUse, skill);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testHunting4() {
        System.out.println("\tTest Case #4");
        int ammo = 10;
        int ammoToUse = 5;
        int skill = 0;
        int expResult = -3;
        int result = instance.hunting(ammo, ammoToUse, skill);
        assertEquals(expResult, result);
    }
    
}
