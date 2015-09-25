public class Distance {

  public static final double R = 6372.8; // Radius of the earth in kilometers

  public static void main(String[] args) {

      double[] maynoothUniversity = {53.3807,-6.594596000000024};
      double[] statueOfLiberty = {40.6892494,-74.0445004};

      double distance = haversine(maynoothUniversity[0], maynoothUniversity[1], statueOfLiberty[0], statueOfLiberty[1]);
      System.out.println("The distance is : " + distance + "km");


  }



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
