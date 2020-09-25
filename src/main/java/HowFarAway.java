import java.util.Scanner;

public class HowFarAway 
{
    public static void main(String[] args)
    {
        double startLat, startLong;
        double endLat,endLong, distance;

        Scanner in = new Scanner(System.in);

        //gets the info from user
        System.out.println("Enter the latitude of the starting location: ");
        startLat = in.nextDouble();

        System.out.println("Enter the longitude of the starting location: ");
        startLong = in.nextDouble();

        System.out.println("Enter the latitude of the ending location: ");
        endLat = in.nextDouble();

        System.out.println("Enter the longitude of the ending location: ");
        endLong = in.nextDouble();

        //calculates how far away the locations are from each other

        GeoLocation startLocation = new GeoLocation(startLat, startLong);
        GeoLocation endLocation = new GeoLocation(endLat, endLong);
        distance = startLocation.distanceFrom(endLocation);

        System.out.println("The distance is " + distance + " miles.");
    }
}