package be.howest.ti.mars.logic.domain.statistics;

import be.howest.ti.mars.logic.util.DangerLevel;

public class OxygenLeak {
    private final int id;
    private final DangerLevel dangerLevel;
    private final int domeId;

    String date;

    public OxygenLeak(int id, DangerLevel dangerLevel, int dome, String date) {
        this.id = id;
        this.dangerLevel = dangerLevel;
        this.domeId = dome;
        this.date = date;
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
}
