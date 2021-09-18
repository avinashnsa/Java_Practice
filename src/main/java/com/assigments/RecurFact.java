package com.assigments;

public class
        RecurFact {
    public void Recurfac(int i,int num){
        int fact=1;
        if (i<=num){
            fact=fact*i;
            i++;
            Recurfac(i,num);
            System.out.println(fact);
        }

    }



    public static void main(String[] args) {
        RecurFact recurFact=new RecurFact();
        recurFact.Recurfac(1,5);
    }
}
