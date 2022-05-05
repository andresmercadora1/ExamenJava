package com.edu.cesde;

public class CleaningStaff extends Person {
    private String dayOff;

    public String getDayOff() {
        return dayOff;
    }

    public void setDayOff(String dayOff) {
        this.dayOff = dayOff;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", dayOff='" + dayOff + '\'' +
                '}';
    }
}
