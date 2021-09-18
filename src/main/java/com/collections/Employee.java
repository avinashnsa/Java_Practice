package com.collections;

public class Employee implements Comparable<Employee>{
    private int id;
    private String name;
    private String place;
    private long salary;

    public Employee(int id, String name, String place, long salary) {
        this.id = id;
        this.name = name;
        this.place = place;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    @Override
    public int compareTo(Employee e) {
        return (int) (this.salary - e.salary);
    }

}
