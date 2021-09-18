package com.interfaces;

public class TestInterface {

    public static void main(String[] args) {
        //parent p=new child
        School school=new AbstractClass();
        school.addStudent();
        school.getStudent();
        school.deleteStudent();
        school.updateStudent();
    }

}
