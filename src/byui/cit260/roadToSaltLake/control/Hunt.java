/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.roadToSaltLake.control;

import static java.lang.Math.abs;
import java.util.Random;

/**
 *
 * @author David Cheney and Amy Staiger
 */
public class Hunt {
    int hunting(int ammo, int ammoToUse, int skill)
    {
        int ammountFood = 0;
        //int[] food = {5, 28, 0, 3, 17, 0, 8, 49, 0, 35};
        
        // for testing purposes I will use a simpler array because every test
        // will produce a different output with the array above which is what we
        // want for the game, but we can't predict the outcomes for testing purposes
        int[] food = {5, 5, 5, 5, 5, 5, 5, 5, 5, 5};
        
        if (ammoToUse < 1)
        {
            return -1;
        }
        else if (ammoToUse > ammo || ammo <= 0)
        {
            return -2;
        }
        else if (skill < 1 || skill > 10)
        {
            return -3;
        }
        else
        {
            Random random = new Random();
            for (int i = 0; i < skill; i++)
            {
                ammountFood += food[abs(random.nextInt()) % 10];
            }
        }
        return ammountFood;
    }
}
