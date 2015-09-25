import java.util.*;
import java.lang.Object;
import java.nio.file.Paths;
import java.nio.file.Files;



public class Distance {


	static double[][] distanceTable = new double[1000][1000];

	
	public static final double R = 6372.8; // Radius of the earth in kilometers
	public static void main(String[] args) {

		
		// stores all the locations to the airports
		double[][] airports = new double[1000][2];
    	getAirports(airports); // 

    	// double[][] distanceTable = new double[1000][1000];
    	
    	
    	getDistance(airports);

    	// String shortestPath = getPath(distanceTable);
    	// boolean[] visited = new boolean[1000];
    	// getPath(distanceTable, 0,visited);


    	double shortestDistance = -1;
    	String shortestPath = "";



    	for(int i = 0; i<1000; i++) {

    		String[] path = getPath(i);

    		if(shortestDistance == -1 || shortestDistance > Double.parseDouble(path[0])) {
    			shortestDistance = Double.parseDouble(path[0]);
    			shortestPath = path[1];
    		}

    	}	

    	System.out.println(shortestPath);

    	// for(double[] i : distanceTable) {
    	// 	System.out.println("|");
    	// 	for(double j : i) {
    	// 		System.out.print(j + "|");
    	// 	}
    	// 	System.out.println("");
    	// }
	}


	// function to get all locations and store them in the airports arrray
	public static void getAirports(double[][] airports) {
		int x = 0;
   		 // Read in files and add in stack
		try {
			for (String line : Files.readAllLines(Paths.get("1000airports.txt"))) {
       			String[]  array = line.split(",");
				for(int i = 0; i<array.length; i++) {
          			if(i > 1) {
            			airports[x][i-2] = Double.parseDouble(array[i]);
          			} //end if
        		} // end for
        		x++;
			} // end for
		} catch(Exception e) {
        System.out.println(e.getMessage());
		} // end try catch

	}



	// get distance between all towns and store them in distanceTable array
	public static void getDistance(double[][] airports) {

		for(int i = 0; i <distanceTable.length; i++) {
			for(int j = 0; j<distanceTable[i].length; j++) {
				distanceTable[i][j] = haversine(airports[i][0], airports[i][1],airports[j][0],airports[j][1]);

			}
		}
	}

	// This function gets the shortest path
	public static String[] getPath(int start) {

		double totalDistance = 0;

		ArrayList<Integer> canVisit = new ArrayList<Integer>();
		for(int i = 0; i < 1000; i++) canVisit.add(i);

		// remove starting town from list
		canVisit.remove(start);

		String path = "" + (start + 1);

		while(!canVisit.isEmpty()) {

			int nearestTownID = -1;
			double nearestTownDistance = 0;

			for(int town : canVisit) {

				if(nearestTownID == -1 || distanceTable[start][town] < nearestTownDistance) {
					nearestTownID = town;
					nearestTownDistance = distanceTable[start][town];
				}

			}

			path += "." + (nearestTownID + 1);

			totalDistance += distanceTable[start][nearestTownID];

			start = nearestTownID;

			// remove town id from arraylist
			for(int i = 0; i < canVisit.size(); i++) {
				if(canVisit.get(i) == nearestTownID) canVisit.remove(i);
			}


		}

		// System.out.println(path);

		String[] returning = new String[2];
		returning[0] = "" + totalDistance;
		returning[1] = path;

		return returning;

	}

	// haversine formula to get distance between 2 points
  	public static double haversine(double lat1, double lon1, double lat2, double lon2) {
      double dLat = Math.toRadians(lat2 - lat1);
      double dLon = Math.toRadians(lon2 - lon1);
      lat1 = Math.toRadians(lat1);
      lat2 = Math.toRadians(lat2);
      double a = Math.sin(dLat / 2) * Math.sin(dLat / 2) + Math.sin(dLon / 2) * Math.sin(dLon / 2) * Math.cos(lat1) * Math.cos(lat2);
      double c = 2 * Math.asin(Math.sqrt(a));
      return R * c;
  	}



}

