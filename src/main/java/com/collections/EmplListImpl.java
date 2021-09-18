package com.collections;


import java.util.*;

public class EmplListImpl {
    public static void main(String[] args) {
        List<Employee> employees=new ArrayList<>();

        int r=new Random().nextInt(50);

        for (int i=0;i<=50;i++){
            employees.add(new Employee(i,"Name"+i,"Place"+i,200*i));
        }

        //sort the entire list using utils class called Collection
        Collections.sort(employees);
        System.out.println(employees.get(employees.size()-1));
        System.out.println("--------------------");


        //Get each employee from the given list
        long sum = 0;
        for(Employee employee:employees){
            System.out.println(employee.getName());
            System.out.println(employee.getPlace());
            System.out.println(employee.getSalary());
            System.out.println(Collections.max(employees).getName());
            sum=sum+employee.getSalary();
            System.out.println("--------------------");
        }

        System.out.println("total salary is" +' '+sum);

        Employee maxemp =  Collections.max(employees, Comparator.comparing(s -> s.getSalary()));
        System.out.println("The max salary is" + maxemp.getName());

        Employee minemp =  Collections.min(employees, Comparator.comparing(s -> s.getSalary()));
        System.out.println("The minimum salary is" + minemp.getName());

        System.out.println("--------------------");

    }
}
