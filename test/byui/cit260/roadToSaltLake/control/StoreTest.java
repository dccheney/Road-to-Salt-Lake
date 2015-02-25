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
        double funds = 800.00;
        int item = 1;
        double itemQuantity = 4;
        double itemPrice = 30.00;      
        double expResult = 120.00;
        double result = instance.purchaseInventory(funds, itemQuantity, itemPrice);
        assertEquals(expResult, result, 0.00);
    }
    @Test
    public void testPurchaseInventory2() {
        /*************************
         * Test Case #2
         */
        
        System.out.println("\tTest Case #2");
        double funds = 800.00;
        int item = 2;
        double itemQuantity = 10;
        double itemPrice = 2.0;
        double expResult = 20.00;
        double result = instance.purchaseInventory(funds, itemQuantity, itemPrice);
        assertEquals(expResult, result, 0.00);
    }
         
    @Test
    public void testPurchaseInventory3() {    
         /*************************
         * Test Case #3
         */
        
        System.out.println("\tTest Case #3");
        double funds = 800.00;
        int item = 3;
        double itemQuantity = 4;
        double itemPrice = 5.0;
        double expResult = 20.00;
        double result = instance.purchaseInventory(funds, itemQuantity, itemPrice);
        assertEquals(expResult, result, 0.00);
    }
        
    @Test
    public void testPurchaseInventory4() {
        /*************************
         * Test Case #4
         */       
        
        System.out.println("\tTest Case #4");
        double funds = 800.00;
        int item = 4;
        double itemQuantity = 6;
        double itemPrice = 15.0;
        double expResult = 90.00;
        double result = instance.purchaseInventory(funds, itemQuantity, itemPrice);
        assertEquals(expResult, result, 0.00);
    }
    
    @Test
    public void testPurchaseInventory5() {
         /*************************
         * Test Case #5
         */
 
        System.out.println("\tTest Case #5");
        double funds = 800.00;
        int item = 5;
        double itemQuantity = 3;
        double itemPrice = 50.0;
        double expResult = 150.00;
        double result = instance.purchaseInventory(funds, itemQuantity, itemPrice);
        assertEquals(expResult, result, 0.00);
    }
    
    @Test
    public void testPurchaseInventory7() {
         /*************************
         * Test Case #6
         * Invalid
         */
      
        System.out.println("\tTest Case #7");
        double funds = 800.00;
        int item = 1;
        double itemQuantity = 6;
        double itemPrice = 0.0;
        double expResult = -3;
        double result = instance.purchaseInventory(funds, itemQuantity, itemPrice);
        assertEquals(expResult, result, 0.00);
    }
    
    @Test
    public void testPurchaseInventory8() {
        /*************************
         * Test Case #7
         * Invalid
         */

        System.out.println("\tTest Case #8");
        double funds = 0.00;
        int item = 2;
        double itemQuantity = 10;
        double itemPrice = 6.0;
        double expResult = -1;
        double result = instance.purchaseInventory(funds, itemQuantity, itemPrice);
        assertEquals(expResult, result, 0.00);
   }
    
    @Test
    public void testPurchaseInventory9() {
         /*************************
         * Test Case #8
         * Invalid
         */

        System.out.println("\tTest Case #9");
        double funds = 800.00;
        int item = 3;
        double itemQuantity = -6;
        double itemPrice = 89.0;
        double expResult = -2;
        double result = instance.purchaseInventory(funds, itemQuantity, itemPrice);
        assertEquals(expResult, result, 0.00);
    }
    
      @Test
    public void testPurchaseInventory10() {
        /*************************
         * Test Case #9
         * Invalid
         */

        System.out.println("\tTest Case #10");
        double funds = 30.00;
        int item = 4;
        double itemQuantity = 1;
        double itemPrice = 40.0;
        double expResult = -4;
        double result = instance.purchaseInventory(funds, itemQuantity, itemPrice);
        assertEquals(expResult, result, 0.00);       
    }
}
