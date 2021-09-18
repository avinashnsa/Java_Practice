package Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListMethods {
    public static void main(String[] args) {
        List al=new ArrayList<>();
        al.add("Aashritha");
        al.add("Avinash");
        al.add("veeru");
        al.add(31);
        al.add(1.8);

        List<String> nam=new ArrayList<>();
        nam.add("aa");
        nam.add("sh");
        nam.add("ritha");
        for (String s:nam){
          //  System.out.print(s);
        }
        for (int i=0;i<al.size();i++){
           // System.out.println(al.get(i));
        }
        ListIterator<String> i=nam.listIterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }

        Iterator itr= al.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }




    }
}
