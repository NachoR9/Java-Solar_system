package dev.nacho;

public class Planet {

    private static final int AU = 149597870;

    private String name = null;
    private int satellites = 0;
    private double mass = 0;
    private double volume = 0;
    private int diameter = 0;
    private int sunDistance = 0;
    private PlanetType planetType;
    private boolean observable = false;
    private double orbitalPeriod;
    private double rotationPeriod;

    public Planet(String name, int satellites, double mass, double volume, int diameter, int sunDistance,
            PlanetType planetType, boolean observable, double orbitalPeriod, double rotationPeriod) {
        this.name = name;
        this.satellites = satellites;
        this.mass = mass;
        this.volume = volume;
        this.diameter = diameter;
        this.sunDistance = sunDistance;
        this.planetType = planetType;
        this.observable = observable;
        this.orbitalPeriod = orbitalPeriod;
        this.rotationPeriod = rotationPeriod;
    }

    @Override
    public String toString() {
        return "Planet [name=" + name + ", satellites=" + satellites + ", mass=" + mass + ", volume=" + volume
                + ", diameter=" + diameter + ", sunDistance=" + sunDistance + ", planetType=" + planetType
                + ", observable="
                + observable + ", orbitalPeriod=" + orbitalPeriod + ", rotationPeriod=" + rotationPeriod + "]";
    }

    public double calculateDensity() {
        return mass / volume;
    }

    public boolean isExterior() {
        double distanceInAU = sunDistance / AU;
        return distanceInAU > 3.4;
    }

}
