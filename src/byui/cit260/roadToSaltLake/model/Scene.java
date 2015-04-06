/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.roadToSaltLake.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author David Cheney and Amy Staiger
 */
public enum Scene implements Serializable {

    /**
     * here is the enum of scenes
     */
//    Nauvoo("swamp",Weather.RainGood,true);
    mountain("rocky", Weather.Snow, false),
    river("water", Weather.Calm, false),
    prairieFire("prairie", Weather.HeatBad, false),
    springsGood("springs", Weather.Calm, false),
    springsBad("springs", Weather.Calm, false),
    prairieCalm("prairie", Weather.Calm, false),
    riverCrossingGood("water", Weather.HeatGood, false),
    riverCrossingBad("water", Weather.Cold, false),
    hilly("uneven", Weather.Calm, false),
    muddy("muddy", Weather.HeatBad, false),
    snow("Wet", Weather.Snow, false),
    
    
    Nauvoo("swamp", Weather.RainGood, true),
    SugarCreek("water", Weather.HeatBad, false),
    RichardsonsPoint("flat", Weather.Hail, false),
    CharitonRiverCrossing("water", Weather.Hail, false),
    LocustCreek("prairie", Weather.HeatBad, false),
    GardenGrove("prairie", Weather.HeatBad, false),
    MountPisgah("prairie", Weather.Cool, false),
    NishnabotnaRiverCrossing("prairie", Weather.Calm, false),
    GrandEncampmentWinterQuarters("prairie", Weather.Calm, true),
    PlatteRiver("water", Weather.Fire, false),
    LoupFork("water", Weather.RainGood, false),
    FortKearny("flat", Weather.Calm, true),
    ConfluencePoint("flat", Weather.Hail, false),
    AshHollow("flat", Weather.RainGood, false),
    ChimneyRock("rocky", Weather.HeatGood, false),
    ScottsBluff("prairie", Weather.HeatBad, false),
    FortLaramie("prairie", Weather.Cold, true),
    UpperPlatteMormonFerry("water", Weather.Hail, false),
    RedButte("rocky", Weather.HeatGood, false),
    SweetwaterIndependence("prairie", Weather.HeatBad, false),
    DevilsGate("prairie", Weather.HeatBad, false),
    MartinsCove("prairie", Weather.Cool, false),
    RockyRidgeRockCreek("rocky", Weather.Cold, false),
    SouthPass("rocky", Weather.Cold, false),
    GreenRiverLombardFerry("prairie", Weather.Calm, false),
    FortBridger("prairie", Weather.Calm, true),
    BearRiver("water", Weather.Calm, false),
    TheNeedlesEchoCanyon("water", Weather.Cool, false),
    BigMountainPassRoadEmigrationCanyon("rocky", Weather.Cool, false),
    SaltLakeCity("prairie", Weather.HeatGood, true);
    
    private String terrain;
    private Weather weather;
    private boolean store;
    
    
    Scene (String terrain, Weather weather, boolean store) {
        this.terrain = terrain;
        this.weather = weather;
        this.store = store;
    }

    public String getTerrain() {
        return terrain;
    }

    public Weather getWeather() {
        return weather;
    }

    public boolean getStore(){
        return store;
    }
}
