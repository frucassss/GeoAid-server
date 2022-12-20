package be.howest.ti.mars.logic.domain.statistics;

import be.howest.ti.mars.logic.domain.Dome;
import be.howest.ti.mars.logic.util.TypeOfDispach;

public class MedicalDispach {
    private final int id;
    private final TypeOfDispach dispachType;
    final int domeId;
    private final String date;
    private final Double longitude;
    private final Double latitude;
    private final Dome dome;

    public MedicalDispach(int id, TypeOfDispach dispachType, int domeId, String date, Double longitude, Double latitude, Dome dome) {
        this.id = id;
        this.dispachType = dispachType;
        this.domeId = domeId;
        this.date = date;
        this.longitude = longitude;
        this.latitude = latitude;
        this.dome = dome;
    }

    public int getId() {
        return id;
    }

    public TypeOfDispach getDispachType() {
        return dispachType;
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

    public Dome getDome() {
        return dome;
    }
}
