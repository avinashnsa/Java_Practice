package com.interfaces;

public class AbstractClass extends SchoolImpl {
    @Override
    public void deleteStudent() {
        System.out.println("delete student details");

    }

    @Override
    public void updateStudent() {
        System.out.println("Update student details");

    }
}
