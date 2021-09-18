package com.conditionalstatments;

public class JavaBasics {
    static int a=4;
    int z=10;
    static int x=20;
    static int y=30;
    // instence method
    public void add(){
        JavaBasics javaBasics=new JavaBasics();
        String name="avi";
        System.out.println("instance method result");
        System.out.println(x+y+z);
        System.out.println(name);
        System.out.println(this.z);

    }
    // static method
    public static void multi(){
        int a=5;
        JavaBasics javaBasics=new JavaBasics();
        System.out.println("Static method result");
        System.out.println(x*y* javaBasics.z);
        System.out.println(a);

    }

    public static void main(String[] args) {
        JavaBasics javaBasics=new JavaBasics();
       multi();
       javaBasics.add();
    }
}
