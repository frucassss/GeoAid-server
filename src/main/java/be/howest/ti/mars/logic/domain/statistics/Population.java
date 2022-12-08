package be.howest.ti.mars.logic.domain.statistics;

public class Population {

    private final int size;
    private final double latitude;
    private final double longitude;

    public Population(int size, double latitude, double longitude) {
        this.size = size;
        this.latitude = latitude;
        this.longitude = longitude;
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
}
