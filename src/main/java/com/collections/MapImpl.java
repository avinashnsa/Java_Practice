package com.collections;

import java.util.HashMap;
import java.util.Map;

public class MapImpl {
    public static void main(String[] args) {
        Map<Integer,MapEmployee> employeeMap=new HashMap<>();
        for(int i=1;i<=15;i++){
            employeeMap.put(i,new MapEmployee("user"+i,"place"+i,(i*5)));
        }
        System.out.println(employeeMap.size());
        System.out.println(employeeMap.get(5).getName());
        System.out.println(employeeMap.containsKey(5));
        System.out.println(employeeMap);

        for(Map.Entry<Integer, MapEmployee> employeeEntry:employeeMap.entrySet()){
            System.out.println(employeeEntry.getKey());
            System.out.println(employeeEntry.getValue().getName());
        }
    }

}
