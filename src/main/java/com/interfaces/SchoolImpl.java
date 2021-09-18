package com.interfaces;

public abstract class SchoolImpl implements School{
    @Override
    public void addStudent() {
        System.out.println("Adding student");
    }

    @Override
    public void getStudent() {
        System.out.println("Getting student details");

    }


}
