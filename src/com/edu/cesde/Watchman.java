package com.edu.cesde;

public class Watchman extends Person {
    private String weapon;
    private String workday;

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public String getWorkday() {
        return workday;
    }

    public void setWorkday(String workday) {
        this.workday = workday;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", weapon='" + weapon + '\'' +
                ", workday='" + workday + '\'' +
                '}';
    }
}
