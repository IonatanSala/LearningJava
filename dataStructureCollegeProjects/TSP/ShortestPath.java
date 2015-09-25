import java.util.*;
import java.lang.Object;
import java.nio.file.Paths;
import java.nio.file.Files;

public class ShortestPath {

  public static final double R = 6372.8; // Radius of the earth in kilometers

  public static void main(String[] args) {
    String path = ""; //
    int howMany = 0;
    double distance = 0;  // the distance of all the 
    Stack<Double> stack = new Stack<Double>(); // Default Java Implementation
		
    // Read in files and add in stack
		try {
			for (String line : Files.readAllLines(Paths.get("1000airports.txt"))) {
        String[]  array = line.split(",");
				for(int i = 0; i<array.length; i++) {
          if(i > 1) {
            stack.push(Double.parseDouble(array[i]));
          } //end if
          if(i == 0) {
            stack.push(Double.parseDouble(array[i]));
          }
        } // end for
			} // end for
		} catch(Exception e) {
        System.out.println(e.getMessage());
		} // end try catch

    int count = 0;

    for(int j = 0; j<1; j++) {
      // double lon1 = stack.pop();
      // double lat1 = stack.pop();
      double lat2 = 0;
      double lon2 = 0;
      int b = 0, c =0;
      double neighbour = 1000000;
      int x = 1;
      int d = 0;

      for(double i : stack) {
        // if(b == c && b > 0) {
        //   double z = haversine(lat1,lon1,lat2,lon2);
        //   if(z < neighbour) {
        //     neighbour = z;
        //     d = c;
        //   }
        // }
        // if (x % 2 == 0) {
        //   lon2 = i;
        //   b++;
        // } else {
        //   lat2 = i;
        //   c++;
        // }
        // x++;  
        System.out.println(i);
      } //end inner for
      distance += neighbour;
      // howMany++;
      path += d +".";
      // count++;
    } // end  outer for

    for(String p : path.split(".")) {
      howMany++;
    }
    // System.out.println(howMany);
    // System.out.println(distance);
    // System.out.println(path);

  } // end main

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
