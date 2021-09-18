package com.oops.polymorphisim;

public class CheckPoly {
    public static void main(String[] args) {
        TestPloy testPloy=new TestPloy();
        testPloy.getData();
        testPloy.getData("TC01");
        testPloy.getData("TC01","json");

        // overriding
        System.out.println("---------------");
        System.out.println("overriding methods");

        ParentClass_Method parentClass_method=new ParentClass_Method();
        parentClass_method.getData();


        ChildClass_Method childClass_method=new ChildClass_Method();
        childClass_method.getData();

        ParentClass_Method obj=new ChildClass_Method();
        obj.getData();



    }
}
