package be.howest.ti.mars.logic.domain;

import be.howest.ti.mars.logic.util.DangerLevel;

public class OxygenLeak {
    int id;
    DangerLevel dangerLevel;
    int domeId;

    public OxygenLeak(int id, DangerLevel dangerLevel, int dome) {
        this.id = id;
        this.dangerLevel = dangerLevel;
        this.domeId = dome;
    }

    public int getId() {
        return id;
    }

    public DangerLevel getDangerLevel() {
        return dangerLevel;
    }

    public int getDome() {
        return domeId;
    }
}
