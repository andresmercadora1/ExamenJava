package com.edu.cesde;

public class Accountant extends Person {
    private String leader;
    private String parking;

    public String getLeader() {
        return leader;
    }

    public void setLeader(String leader) {
        this.leader = leader;
    }

    public String getParking() {
        return parking;
    }

    public void setParking(String parking) {
        this.parking = parking;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", leader='" + leader + '\'' +
                ", parking='" + parking + '\'' +
                '}';
    }
}
