package be.howest.ti.mars.logic.domain;

import be.howest.ti.mars.logic.util.DangerLevel;

public class OxygenLeak {
    int id;
    DangerLevel dangerLevel;
    Dome dome;

    public OxygenLeak(int id, DangerLevel dangerLevel, Dome dome) {
        this.id = id;
        this.dangerLevel = dangerLevel;
        this.dome = dome;
    }

    public int getId() {
        return id;
    }

    public DangerLevel getDangerLevel() {
        return dangerLevel;
    }

    public Dome getDome() {
        return dome;
    }
}
