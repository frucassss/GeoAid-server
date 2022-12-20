package be.howest.ti.mars.logic.domain.statistics;

import be.howest.ti.mars.logic.util.Colony;

public class Population {

    private final int id;

    private final int size;
    private final double latitude;
    private final double longitude;

    private final Colony colony;

    public Population(int id, int size, double latitude, double longitude, Colony colony) {
        this.id = id;
        this.size = size;
        this.latitude = latitude;
        this.longitude = longitude;
        this.colony = colony;
    }

    public int getId() {
        return id;
    }

    public int getSize() {
        return size;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public Colony getColony() {
        return colony;
    }
}
