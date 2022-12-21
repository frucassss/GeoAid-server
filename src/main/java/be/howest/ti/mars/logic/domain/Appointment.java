package be.howest.ti.mars.logic.domain;

public class Appointment {
    private final int id;
    private final String date;
    private final String time;
    private final String topic;
    private final int employeeId;
    private final String expertise;

    public Appointment(int id, String date, String time, String topic, int employeeId, String expertise) {
        this.id = id;
        this.date = date;
        this.time = time;
        this.topic = topic;
        this.employeeId = employeeId;
        this.expertise = expertise;
    }

    public int getId() {
        return id;
    }

    public String getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }

    public String getTopic() {
        return topic;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getExpertise() {
        return expertise;
    }
}