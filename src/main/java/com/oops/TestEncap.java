package com.oops;

public class TestEncap {
    public static void main(String[] args) {
        Encapsulation encapsulation=new Encapsulation();
        encapsulation.setName("Avinash");
        encapsulation.setPlace("VJA");
        encapsulation.setSalary(4556);


        System.out.println(encapsulation.getName());
        System.out.println(encapsulation.getPlace());
        System.out.println(encapsulation.getSalary());

        Encapsulation[] arr=new Encapsulation[5];

        for(int i=0;i<=4;i++){
            Encapsulation obj=new Encapsulation();
            obj.setName("user"+i);
            obj.setPlace("Place"+i);
            obj.setSalary(233*i);
            arr[i]=obj;

        }
        System.out.println("-----------------------------");
        System.out.println(arr.length);
        System.out.println("-----------------------------");
        System.out.println(arr[1]);
        System.out.println("-----------------------------");


        for(Encapsulation encap:arr){
            System.out.println(encap.getName());
            System.out.println(encap.getPlace());
            System.out.println(encap.getSalary());
            System.out.println("-----------------------------");

        }
    }
}
