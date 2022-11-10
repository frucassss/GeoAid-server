package be.howest.ti.mars.logic.domain;

public class Dome {

    private  int id;
    private final String domeName;
    private final int latitude;
    private final int longitude;

    public Dome(int id, String domeName, int latitude, int longitude) {
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

    public int getLatitude() {
        return latitude;
    }

    public int getLongitude() {
        return longitude;
    }

    public void setId(int id) {
        this.id = id;
    }
}
