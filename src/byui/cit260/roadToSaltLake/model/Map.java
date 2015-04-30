/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.roadToSaltLake.model;

import byui.cit260.roadToSaltLake.control.GameControl;
import java.io.Serializable;
import static java.lang.Math.abs;
import java.util.Random;

/**
 *
 * @author David Cheney and Amy Staiger
 */
public class Map implements Serializable {

    private int rowCount;
    private int colCount;
    private Location[][] locations;

    public Map() {

    }

    public Map(int noOfRows, int noOfColumns) {
        if (noOfRows < 1 || noOfColumns < 1) {
            System.out.println("the number of rows and columns must be > zero");
            return;
        }
        this.rowCount = noOfRows;
        this.colCount = noOfColumns;

        //create 2-D array for location objects
        this.locations = new Location[noOfRows][noOfColumns];

        for (int row = 0; row < noOfRows; row++) {
            for (int column = 0; column < noOfColumns; column++) {
                //create and initialize new location object instance}
                Location location = new Location();
                location.setCol(column);
                location.setRow(row);
                location.setVisited(false);

                //assign the location ojbect to the current position in array
                locations[row][column] = location;
            }
        }
    }
    
    



    public static void assignScenesToLocations(Map map, Scene[] scenes) {

        Location[][] locations = map.getLocations();

        // predetermined locations of the best path to take to Salt Lake. Players
        // won't know this is what best path is. This includes all the land marks that
        // the pioneers actually visited.
        locations[7][94].setScene(scenes[Scene.Nauvoo.ordinal()]);
        locations[9][47].setScene(scenes[Scene.hilly.ordinal()]);
        locations[9][46].setScene(scenes[Scene.hilly.ordinal()]);
        locations[8][67].setScene(scenes[Scene.muddy.ordinal()]);
        locations[8][66].setScene(scenes[Scene.springsBad.ordinal()]);
        locations[8][65].setScene(scenes[Scene.prairieCalm.ordinal()]);
        locations[8][64].setScene(scenes[Scene.prairieCalm.ordinal()]);
        locations[8][60].setScene(scenes[Scene.prairieCalm.ordinal()]);
        locations[8][59].setScene(scenes[Scene.prairieFire.ordinal()]);
        locations[8][58].setScene(scenes[Scene.prairieCalm.ordinal()]);
        locations[8][47].setScene(scenes[Scene.hilly.ordinal()]);
        locations[8][46].setScene(scenes[Scene.hilly.ordinal()]);
        locations[8][60].setScene(scenes[Scene.prairieCalm.ordinal()]);
        locations[7][93].setScene(scenes[Scene.SugarCreek.ordinal()]);
        locations[7][92].setScene(scenes[Scene.snow.ordinal()]);
        locations[7][91].setScene(scenes[Scene.springsBad.ordinal()]);
        locations[7][90].setScene(scenes[Scene.springsBad.ordinal()]);
        locations[7][88].setScene(scenes[Scene.riverCrossingGood.ordinal()]);
        locations[7][87].setScene(scenes[Scene.muddy.ordinal()]);
        locations[7][85].setScene(scenes[Scene.muddy.ordinal()]);
        locations[7][84].setScene(scenes[Scene.muddy.ordinal()]);
        locations[7][71].setScene(scenes[Scene.muddy.ordinal()]);
        locations[7][70].setScene(scenes[Scene.muddy.ordinal()]);
        locations[7][67].setScene(scenes[Scene.muddy.ordinal()]);
        locations[7][66].setScene(scenes[Scene.springsGood.ordinal()]);
        locations[7][65].setScene(scenes[Scene.prairieCalm.ordinal()]);
        locations[7][64].setScene(scenes[Scene.prairieCalm.ordinal()]);
        locations[7][63].setScene(scenes[Scene.prairieCalm.ordinal()]);
        locations[7][62].setScene(scenes[Scene.prairieCalm.ordinal()]);
        locations[7][61].setScene(scenes[Scene.prairieCalm.ordinal()]);
        locations[7][60].setScene(scenes[Scene.FortKearny.ordinal()]);
        locations[7][59].setScene(scenes[Scene.prairieCalm.ordinal()]);
        locations[7][58].setScene(scenes[Scene.prairieFire.ordinal()]);
        locations[7][57].setScene(scenes[Scene.prairieFire.ordinal()]);
        locations[7][56].setScene(scenes[Scene.prairieFire.ordinal()]);
        locations[7][55].setScene(scenes[Scene.prairieFire.ordinal()]);
        locations[7][54].setScene(scenes[Scene.muddy.ordinal()]);
        locations[7][53].setScene(scenes[Scene.ConfluencePoint.ordinal()]);
        locations[7][52].setScene(scenes[Scene.muddy.ordinal()]);
        locations[7][51].setScene(scenes[Scene.prairieCalm.ordinal()]);
        locations[7][50].setScene(scenes[Scene.prairieCalm.ordinal()]);
        locations[7][49].setScene(scenes[Scene.prairieCalm.ordinal()]);
        locations[7][48].setScene(scenes[Scene.muddy.ordinal()]);
        locations[7][47].setScene(scenes[Scene.AshHollow.ordinal()]);
        locations[7][46].setScene(scenes[Scene.hilly.ordinal()]);
        locations[7][45].setScene(scenes[Scene.prairieCalm.ordinal()]);
        locations[7][44].setScene(scenes[Scene.prairieCalm.ordinal()]);
        locations[7][18].setScene(scenes[Scene.mountain.ordinal()]);
        locations[7][17].setScene(scenes[Scene.hilly.ordinal()]);
        locations[7][1].setScene(scenes[Scene.SaltLakeCity.ordinal()]);
        locations[6][93].setScene(scenes[Scene.snow.ordinal()]);
        locations[6][92].setScene(scenes[Scene.snow.ordinal()]);
        locations[6][91].setScene(scenes[Scene.RichardsonsPoint.ordinal()]);
        locations[6][90].setScene(scenes[Scene.springsGood.ordinal()]);
        locations[6][89].setScene(scenes[Scene.riverCrossingGood.ordinal()]);
        locations[6][88].setScene(scenes[Scene.CharitonRiverCrossing.ordinal()]);
        locations[6][87].setScene(scenes[Scene.riverCrossingBad.ordinal()]);
        locations[6][86].setScene(scenes[Scene.LocustCreek.ordinal()]);
        locations[6][85].setScene(scenes[Scene.muddy.ordinal()]);
        locations[6][84].setScene(scenes[Scene.GardenGrove.ordinal()]);
        locations[6][83].setScene(scenes[Scene.MountPisgah.ordinal()]);
        locations[6][78].setScene(scenes[Scene.springsGood.ordinal()]);
        locations[6][77].setScene(scenes[Scene.springsGood.ordinal()]);
        locations[6][76].setScene(scenes[Scene.prairieCalm.ordinal()]);
        locations[6][75].setScene(scenes[Scene.prairieCalm.ordinal()]);
        locations[6][74].setScene(scenes[Scene.prairieFire.ordinal()]);
        locations[6][73].setScene(scenes[Scene.muddy.ordinal()]);
        locations[6][72].setScene(scenes[Scene.PlatteRiver.ordinal()]);
        locations[6][71].setScene(scenes[Scene.muddy.ordinal()]);
        locations[6][70].setScene(scenes[Scene.muddy.ordinal()]);
        locations[6][69].setScene(scenes[Scene.springsGood.ordinal()]);
        locations[6][68].setScene(scenes[Scene.LoupFork.ordinal()]);
        locations[6][67].setScene(scenes[Scene.springsBad.ordinal()]);
        locations[6][66].setScene(scenes[Scene.prairieCalm.ordinal()]);
        locations[6][65].setScene(scenes[Scene.muddy.ordinal()]);
        locations[6][64].setScene(scenes[Scene.prairieCalm.ordinal()]);
        locations[6][59].setScene(scenes[Scene.prairieCalm.ordinal()]);
        locations[6][58].setScene(scenes[Scene.prairieFire.ordinal()]);
        locations[6][52].setScene(scenes[Scene.muddy.ordinal()]);
        locations[6][51].setScene(scenes[Scene.muddy.ordinal()]);
        locations[6][43].setScene(scenes[Scene.hilly.ordinal()]);
        locations[6][42].setScene(scenes[Scene.ChimneyRock.ordinal()]);
        locations[6][41].setScene(scenes[Scene.hilly.ordinal()]);
        locations[6][22].setScene(scenes[Scene.prairieCalm.ordinal()]);
        locations[6][21].setScene(scenes[Scene.prairieCalm.ordinal()]);
        locations[6][20].setScene(scenes[Scene.mountain.ordinal()]);
        locations[6][19].setScene(scenes[Scene.RockyRidgeRockCreek.ordinal()]);
        locations[6][18].setScene(scenes[Scene.SouthPass.ordinal()]);
        locations[6][17].setScene(scenes[Scene.hilly.ordinal()]);
        locations[6][16].setScene(scenes[Scene.hilly.ordinal()]);
        locations[6][15].setScene(scenes[Scene.hilly.ordinal()]);
        locations[6][14].setScene(scenes[Scene.muddy.ordinal()]);
        locations[6][12].setScene(scenes[Scene.prairieCalm.ordinal()]);
        locations[6][6].setScene(scenes[Scene.prairieCalm.ordinal()]);
        locations[6][2].setScene(scenes[Scene.hilly.ordinal()]);
        locations[6][1].setScene(scenes[Scene.SaltLakeCity.ordinal()]);
        locations[5][90].setScene(scenes[Scene.prairieCalm.ordinal()]);
        locations[5][87].setScene(scenes[Scene.riverCrossingBad.ordinal()]);
        locations[5][86].setScene(scenes[Scene.riverCrossingBad.ordinal()]);
        locations[5][84].setScene(scenes[Scene.hilly.ordinal()]);
        locations[5][83].setScene(scenes[Scene.mountain.ordinal()]);
        locations[5][82].setScene(scenes[Scene.hilly.ordinal()]);
        locations[5][81].setScene(scenes[Scene.prairieCalm.ordinal()]);
        locations[5][80].setScene(scenes[Scene.prairieCalm.ordinal()]);
        locations[5][79].setScene(scenes[Scene.prairieFire.ordinal()]);
        locations[5][78].setScene(scenes[Scene.riverCrossingGood.ordinal()]);
        locations[5][77].setScene(scenes[Scene.NishnabotnaRiverCrossing.ordinal()]);
        locations[5][76].setScene(scenes[Scene.riverCrossingGood.ordinal()]);
        locations[5][75].setScene(scenes[Scene.muddy.ordinal()]);
        locations[5][74].setScene(scenes[Scene.muddy.ordinal()]);
        locations[5][73].setScene(scenes[Scene.muddy.ordinal()]);
        locations[5][72].setScene(scenes[Scene.prairieCalm.ordinal()]);
        locations[5][71].setScene(scenes[Scene.prairieCalm.ordinal()]);
        locations[5][70].setScene(scenes[Scene.prairieCalm.ordinal()]);
        locations[5][67].setScene(scenes[Scene.springsGood.ordinal()]);
        locations[5][66].setScene(scenes[Scene.springsGood.ordinal()]);
        locations[5][42].setScene(scenes[Scene.hilly.ordinal()]);
        locations[5][41].setScene(scenes[Scene.ScottsBluff.ordinal()]);
        locations[5][40].setScene(scenes[Scene.mountain.ordinal()]);
        locations[5][39].setScene(scenes[Scene.hilly.ordinal()]);
        locations[5][38].setScene(scenes[Scene.prairieCalm.ordinal()]);
        locations[5][37].setScene(scenes[Scene.FortLaramie.ordinal()]);
        locations[5][36].setScene(scenes[Scene.hilly.ordinal()]);
        locations[5][35].setScene(scenes[Scene.prairieCalm.ordinal()]);
        locations[5][34].setScene(scenes[Scene.prairieCalm.ordinal()]);
        locations[5][33].setScene(scenes[Scene.prairieCalm.ordinal()]);
        locations[5][32].setScene(scenes[Scene.prairieCalm.ordinal()]);
        locations[5][31].setScene(scenes[Scene.hilly.ordinal()]);
        locations[5][27].setScene(scenes[Scene.hilly.ordinal()]);
        locations[5][26].setScene(scenes[Scene.prairieCalm.ordinal()]);
        locations[5][24].setScene(scenes[Scene.mountain.ordinal()]);
        locations[5][23].setScene(scenes[Scene.MartinsCove.ordinal()]);
        locations[5][22].setScene(scenes[Scene.prairieCalm.ordinal()]);
        locations[5][21].setScene(scenes[Scene.prairieCalm.ordinal()]);
        locations[5][20].setScene(scenes[Scene.mountain.ordinal()]);
        locations[5][17].setScene(scenes[Scene.hilly.ordinal()]);
        locations[5][16].setScene(scenes[Scene.hilly.ordinal()]);
        locations[5][15].setScene(scenes[Scene.hilly.ordinal()]);
        locations[5][14].setScene(scenes[Scene.muddy.ordinal()]);
        locations[5][13].setScene(scenes[Scene.GreenRiverLombardFerry.ordinal()]);
        locations[5][12].setScene(scenes[Scene.prairieCalm.ordinal()]);
        locations[5][8].setScene(scenes[Scene.muddy.ordinal()]);
        locations[5][7].setScene(scenes[Scene.BearRiver.ordinal()]);
        locations[5][6].setScene(scenes[Scene.mountain.ordinal()]);
        locations[5][5].setScene(scenes[Scene.TheNeedlesEchoCanyon.ordinal()]);
        locations[5][4].setScene(scenes[Scene.mountain.ordinal()]);
        locations[5][3].setScene(scenes[Scene.mountain.ordinal()]);
        locations[5][2].setScene(scenes[Scene.BigMountainPassRoadEmigrationCanyon.ordinal()]);
        locations[5][1].setScene(scenes[Scene.hilly.ordinal()]);
        locations[4][84].setScene(scenes[Scene.mountain.ordinal()]);
        locations[4][83].setScene(scenes[Scene.MountPisgah.ordinal()]);
        locations[4][82].setScene(scenes[Scene.hilly.ordinal()]);
        locations[4][81].setScene(scenes[Scene.prairieFire.ordinal()]);
        locations[4][78].setScene(scenes[Scene.prairieCalm.ordinal()]);
        locations[4][37].setScene(scenes[Scene.prairieFire.ordinal()]);
        locations[4][32].setScene(scenes[Scene.prairieCalm.ordinal()]);
        locations[4][31].setScene(scenes[Scene.prairieCalm.ordinal()]);
        locations[4][30].setScene(scenes[Scene.prairieCalm.ordinal()]);
        locations[4][29].setScene(scenes[Scene.muddy.ordinal()]);
        locations[4][28].setScene(scenes[Scene.UpperPlatteMormonFerry.ordinal()]);
        locations[4][27].setScene(scenes[Scene.hilly.ordinal()]);
        locations[4][26].setScene(scenes[Scene.muddy.ordinal()]);
        locations[4][25].setScene(scenes[Scene.prairieCalm.ordinal()]);
        locations[4][24].setScene(scenes[Scene.DevilsGate.ordinal()]);
        locations[4][23].setScene(scenes[Scene.hilly.ordinal()]);
        locations[4][13].setScene(scenes[Scene.muddy.ordinal()]);
        locations[4][12].setScene(scenes[Scene.prairieCalm.ordinal()]);
        locations[4][11].setScene(scenes[Scene.prairieCalm.ordinal()]);
        locations[4][10].setScene(scenes[Scene.prairieCalm.ordinal()]);
        locations[4][9].setScene(scenes[Scene.FortBridger.ordinal()]);
        locations[4][8].setScene(scenes[Scene.prairieCalm.ordinal()]);
        locations[4][7].setScene(scenes[Scene.muddy.ordinal()]);
        locations[3][83].setScene(scenes[Scene.mountain.ordinal()]);
        locations[3][82].setScene(scenes[Scene.mountain.ordinal()]);
        locations[3][28].setScene(scenes[Scene.prairieCalm.ordinal()]);
        locations[3][27].setScene(scenes[Scene.hilly.ordinal()]);
        locations[3][26].setScene(scenes[Scene.RedButte.ordinal()]);
        locations[3][25].setScene(scenes[Scene.SweetwaterIndependence.ordinal()]);
        locations[3][24].setScene(scenes[Scene.mountain.ordinal()]);
        locations[3][11].setScene(scenes[Scene.mountain.ordinal()]);
        locations[3][10].setScene(scenes[Scene.mountain.ordinal()]);

        
        Random rand = new Random();
        Scene[] rPlaces = {Scene.prairieCalm,
            Scene.prairieFire,
            Scene.mountain,
            Scene.hilly,
            Scene.muddy};
        
        for (int i = 0; i < locations.length; i++) {
            for (int j = 0; j < locations[i].length; j++) {
                if (locations[i][j] == null) //trying to setup a random generator for all the locations not specified.
                {
                    locations[i][j].setScene(scenes[rPlaces[abs(rand.nextInt()) % 5].ordinal()]); //setScene(scenes[Scene.prairieCalm.ordinal()]);
                }
            }
        }
    }

    private static Scene[] createScenes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static Map createMap() {
        Map map = new Map(10, 95);

        Scene[] scenes = createScenes();

        GameControl.assignScenesToLocations(map, scenes);

        return map;
    }

    public Location[][] getLocations() {
        return locations;
    }

    public void setLocations(Location[][] locations) {
        this.locations = locations;
    }

}
