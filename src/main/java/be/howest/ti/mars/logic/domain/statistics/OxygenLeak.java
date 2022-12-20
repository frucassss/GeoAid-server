package be.howest.ti.mars.logic.domain.statistics;

import be.howest.ti.mars.logic.util.DangerLevel;

public class OxygenLeak {
    private final int id;
    private final DangerLevel dangerLevel;
    private final int domeId;
    private final String date;

    private final Double longitude;
    private final Double latitude;

    public OxygenLeak(int id, DangerLevel dangerLevel, int dome, String date, Double longitude, Double latitude) {
        this.id = id;
        this.dangerLevel = dangerLevel;
        this.domeId = dome;
        this.date = date;
        this.longitude = longitude;
        this.latitude = latitude;
    }

    public int getId() {
        return id;
    }

    public DangerLevel getDangerLevel() {
        return dangerLevel;
    }

    public int getDomeId() {
        return domeId;
    }

    public String getDate() {
        return date;
    }

    public Double getLongitude() {
        return longitude;
    }

    public Double getLatitude() {
        return latitude;
    }
}

