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
public class StoreTest {
    Store instance;
    public StoreTest() {
    }
    @Before
    public void setup(){
      instance = new Store();   
    }

    /**
     * Test of purchaseInventory method, of class Store.
     */
    @Test
    public void testPurchaseInventory1() {
        /*************************
         * Test Case #1
         */
        
              
        System.out.println("\tTest Case #1");
        float funds = 800.00f;
        float itemQuantity = 4f;
        float itemPrice = 30.00f;      
        float expResult = 120.00f;
        float result = instance.purchaseInventory(funds, itemQuantity, itemPrice);
        assertEquals(expResult, result, 0.00);
    }
    @Test
    public void testPurchaseInventory2() {
        /*************************
         * Test Case #2
         */
        
        System.out.println("\tTest Case #2");
        float funds = 800.00f;
        float itemQuantity = 10f;
        float itemPrice = 2.0f;
        float expResult = 20.00f;
        float result = instance.purchaseInventory(funds, itemQuantity, itemPrice);
        assertEquals(expResult, result, 0.00);
    }
         
    @Test
    public void testPurchaseInventory3() {    
         /*************************
         * Test Case #3
         */
        
        System.out.println("\tTest Case #3");
        float funds = 800.00f;
        float itemQuantity = 4f;
        float itemPrice = 5.0f;
        float expResult = 20.00f;
        float result = instance.purchaseInventory(funds, itemQuantity, itemPrice);
        assertEquals(expResult, result, 0.00);
    }
        
    @Test
    public void testPurchaseInventory4() {
        /*************************
         * Test Case #4
         */       
        
        System.out.println("\tTest Case #4");
        float funds = 800.00f;
        float itemQuantity = 6f;
        float itemPrice = 15.0f;
        float expResult = 90.00f;
        float result = instance.purchaseInventory(funds, itemQuantity, itemPrice);
        assertEquals(expResult, result, 0.00);
    }
    
    @Test
    public void testPurchaseInventory5() {
         /*************************
         * Test Case #5
         */
 
        System.out.println("\tTest Case #5");
        float funds = 800.00f;
        float itemQuantity = 3f;
        float itemPrice = 50.0f;
        float expResult = 150.00f;
        float result = instance.purchaseInventory(funds, itemQuantity, itemPrice);
        assertEquals(expResult, result, 0.00);
    }
    
    @Test
    public void testPurchaseInventory6() {
         /*************************
         * Test Case #6
         * Invalid
         */
      
        System.out.println("\tTest Case #6");
        float funds = 800.00f;
        float itemQuantity = 6f;
        float itemPrice = 0.0f;
        float expResult = -3f;
        float result = instance.purchaseInventory(funds, itemQuantity, itemPrice);
        assertEquals(expResult, result, 0.00);
    }
    
    @Test
    public void testPurchaseInventory7() {
        /*************************
         * Test Case #7
         * Invalid
         */

        System.out.println("\tTest Case #7");
        float funds = 0.00f;
        float itemQuantity = 10f;
        float itemPrice = 6.0f;
        float expResult = -1f;
        float result = instance.purchaseInventory(funds, itemQuantity, itemPrice);
        assertEquals(expResult, result, 0.00);
   }
    
    @Test
    public void testPurchaseInventory8() {
         /*************************
         * Test Case #8
         * Invalid
         */

        System.out.println("\tTest Case #8");
        float funds = 800.00f;
        float itemQuantity = -6f;
        float itemPrice = 89.0f;
        float expResult = -2f;
        float result = instance.purchaseInventory(funds, itemQuantity, itemPrice);
        assertEquals(expResult, result, 0.00);
    }
    
      @Test
    public void testPurchaseInventory9() {
        /*************************
         * Test Case #9
         * Invalid
         */

        System.out.println("\tTest Case #9");
        float funds = 30.00f;
        float itemQuantity = 1f;
        float itemPrice = 40.0f;
        float expResult = -4f;
        float result = instance.purchaseInventory(funds, itemQuantity, itemPrice);
        assertEquals(expResult, result, 0.00);       
    }
}
