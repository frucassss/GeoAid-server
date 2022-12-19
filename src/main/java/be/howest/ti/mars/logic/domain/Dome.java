package be.howest.ti.mars.logic.domain;

public class Dome {

    private final int id;
    private final String domeName;
    private final double latitude;
    private final double longitude;
    private final double surface;

    public Dome(int id, String domeName, double latitude, double longitude, double surface) {
        this.id = id;
        this.domeName = domeName;
        this.latitude = latitude;
        this.longitude = longitude;
        this.surface = surface;
    }

    public int getId() {
        return id;
    }

    public String getDomeName() {
        return domeName;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public double getSurface() {
        return surface;
    }

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", domeName='" + domeName + '\'' +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                '}';
    }
}
