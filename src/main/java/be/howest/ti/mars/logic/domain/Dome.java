package be.howest.ti.mars.logic.domain;

public class Dome {

    private final int id;
    private final String domeName;
    private final int latitude;
    private final int longitude;

    public Dome(int id, String domeName, int latitude, int longitude) {
        this.id = id;
        this.domeName = domeName;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    @Override
    public String toString() {
        return "Dome{" +
                "id=" + id +
                ", domeName='" + domeName + '\'' +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                '}';
    }
}
