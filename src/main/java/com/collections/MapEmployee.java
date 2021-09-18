package com.collections;

public class MapEmployee {
    private String name;
    private String place;
    private long salary;

    public MapEmployee(String name, String place, long salary) {
        this.name = name;
        this.place = place;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }


}
