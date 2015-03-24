/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.roadToSaltLake.model;

import byui.cit260.roadToSaltLake.control.GameControl;
import java.io.Serializable;
import static java.lang.System.in;

/**
 *
 * @author David Cheney and Amy Staiger
 */
public class Map implements Serializable{

    private static Scene[] createScenes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private int rowCount;
    private int colCount;

    private Location[][] locations; 
    
   private static Map createMap() {
       Map map = new Map (10, 90);
       
       Scene [] scenes = createScenes();
       
       GameControl. assignScenesToLocations(map, scenes);
       
       return map;
   }
    private int noOfColulmns;

public Map (int noOfRows, int noOfColumns) {	
	if (noOfRows < 1 || noOfColulmns < 1) {
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
		location.setColumn(column);
		location.setRow(row);
		location.setVisited(false);
		
		//assign the location ojbect to the current position in array
		locations[row][column] = location;
		}
	}
}
    private Map(int i, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Map() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Location[][] getLocations() {
        return locations;
    }

    public void setLocations(Location[][] locations) {
        this.locations = locations;
    }

    public int getRowCount() {
        return rowCount;
    }

    public void setRowCount(int rowCount) {
        this.rowCount = rowCount;
    }

    public int getColCount() {
        return colCount;
    }

    public void setColCount(int colCount) {
        this.colCount = colCount;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + this.rowCount;
        hash = 71 * hash + this.colCount;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Map other = (Map) obj;
        if (this.rowCount != other.rowCount) {
            return false;
        }
        if (this.colCount != other.colCount) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Map{" + "rowCount=" + rowCount + ", colCount=" + colCount + '}';
    }
}
