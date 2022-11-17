package be.howest.ti.mars.logic.domain;

public class Dome {

    private final int id;
    private final String domeName;
    private final double latitude;
    private final double longitude;

    public Dome(int id, String domeName, double latitude, double longitude) {
        this.id = id;
        this.domeName = domeName;
        this.latitude = latitude;
        this.longitude = longitude;
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
