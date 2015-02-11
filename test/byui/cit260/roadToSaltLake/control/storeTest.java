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
 * @author David
 */
public class storeTest {
    
    public storeTest() {
    }

    /**
     * Test of purchaseInventory method, of class store.
     */
    @Test
    public void testPurchaseInventory() {
        /*************************
         * Test Case #1
         */
        
        System.out.println("purchaseInventory");
        
        System.out.println("\tTest Case #1");
        double funds = 800.00;
        int item = 1;
        double itemQuantity = 4;
        double itemPrice = 30.00;
        store instance = new store();
        double expResult = 120.00;
        double result = instance.purchaseInventory(funds, item, itemQuantity, itemPrice);
        assertEquals(expResult, result, 0.00);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
        
         /*************************
         * Test Case #2
         */
        
        System.out.println("purchaseInventory");
        
        System.out.println("\tTest Case #2");
        funds = 800.00;
        item = 2;
        itemQuantity = 10;
        itemPrice = 2.0;
        expResult = 20.00;
        result = instance.purchaseInventory(funds, item, itemQuantity, itemPrice);
        assertEquals(expResult, result, 0.00);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
        
         /*************************
         * Test Case #3
         */
        
        System.out.println("purchaseInventory");
        
        System.out.println("\tTest Case #3");
        funds = 800.00;
        item = 3;
        itemQuantity = 4;
        itemPrice = 5.0;
        expResult = 20.00;
        result = instance.purchaseInventory(funds, item, itemQuantity, itemPrice);
        assertEquals(expResult, result, 0.00);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
        
         /*************************
         * Test Case #4
         */
        
        System.out.println("purchaseInventory");
        
        System.out.println("\tTest Case #4");
        funds = 800.00;
        item = 4;
        itemQuantity = 6;
        itemPrice = 15.0;
        expResult = 90.00;
        result = instance.purchaseInventory(funds, item, itemQuantity, itemPrice);
        assertEquals(expResult, result, 0.00);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
        
         /*************************
         * Test Case #5
         */
        
        System.out.println("purchaseInventory");
        
        System.out.println("\tTest Case #5");
        funds = 800.00;
        item = 5;
        itemQuantity = 3;
        itemPrice = 50.0;
        expResult = 150.00;
        result = instance.purchaseInventory(funds, item, itemQuantity, itemPrice);
        assertEquals(expResult, result, 0.00);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
        
         /*************************
         * Test Case #6
         * Invalid
         */
        
        System.out.println("purchaseInventory");
        
        System.out.println("\tTest Case #6");
        funds = 800.00;
        item = 0;
        itemQuantity = 6;
        itemPrice = 15.0;
        expResult = -2;
        result = instance.purchaseInventory(funds, item, itemQuantity, itemPrice);
        assertEquals(expResult, result, 0.00);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
        
                 /*************************
         * Test Case #7
         * Invalid
         */
        
        System.out.println("purchaseInventory");
        
        System.out.println("\tTest Case #7");
        funds = 800.00;
        item = 1;
        itemQuantity = 6;
        itemPrice = 0.0;
        expResult = -4;
        result = instance.purchaseInventory(funds, item, itemQuantity, itemPrice);
        assertEquals(expResult, result, 0.00);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
        
         /*************************
         * Test Case #8
         * Invalid
         */
        
        System.out.println("purchaseInventory");
        
        System.out.println("\tTest Case #8");
        funds = 0.00;
        item = 2;
        itemQuantity = 10;
        itemPrice = 6.0;
        expResult = -1;
        result = instance.purchaseInventory(funds, item, itemQuantity, itemPrice);
        assertEquals(expResult, result, 0.00);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
        
         /*************************
         * Test Case #9
         * Invalid
         */
        
        System.out.println("purchaseInventory");
        
        System.out.println("\tTest Case #9");
        funds = 800.00;
        item = 3;
        itemQuantity = -6;
        itemPrice = 89.0;
        expResult = -3;
        result = instance.purchaseInventory(funds, item, itemQuantity, itemPrice);
        assertEquals(expResult, result, 0.00);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
        
        /*************************
         * Test Case #10
         * Invalid
         */
        
        System.out.println("purchaseInventory");
        
        System.out.println("\tTest Case #10");
        funds = 30.00;
        item = 4;
        itemQuantity = 1;
        itemPrice = 40.0;
        expResult = -5;
        result = instance.purchaseInventory(funds, item, itemQuantity, itemPrice);
        assertEquals(expResult, result, 0.00);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
        
    }
    
    
}
