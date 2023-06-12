package com.arkajyoti;
//Design a Metric class that supports Kilometre to Mile conversion with distance
// in Kilometre as argument.and Mile to Kilometre conversion with distance in mile as argument.
// Assume, one Mile equals 1.5 Kilometre.

public class Metric {
    private static final double param = 1.5d;
    public static double kmToMile(double km)
    {
        return (km/param);
    }
    public static double mileToKm(double mile)
    {
        return (mile * param);
    }
}
