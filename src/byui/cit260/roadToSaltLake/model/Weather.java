/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.roadToSaltLake.model;

/**
 *
 * @author David
 */
public enum Weather {
    RainGood("Refreshing rains restore water supply."),
    RainBad("Drenching rains soak travellers and rot meat rations."),
    Hail("Hail destroys canvas tops. Replace top if you have some in your rations."),//replace canvas from rations
    Fire("Fire scatters oxen.  Spend the day searching for oxen.  No miles gained or lost."),// no miles gained or lost today
    HeatGood("Welcome heat dries out wet clothes.  Energy to go an extra two miles today!"),// gain 2 miles to total
    HeatBad("Unwelcome heat - stop early in the shade of a nearby grove.  Loose 2 miles today."), //loose 2 miles from total
    Cold("Bitter cold stops you today.  No travelling today."),
    Snow("Overnight snow dampens wood, clothes, and the spirits of the company."),
    Flood("Storms upstream flood the trail.  Loose 5 miles today going around the flood."), //loose 5 miles from total
    Calm("No significant weather events today.  Carry on!"),
    Cool("Overcast and comfortable. Gain a Gain a day!");
	
    private final String description;

    Weather(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
