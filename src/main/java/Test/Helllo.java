package Test;

import com.Strings.ToCharArray;
import com.stringmethods.Task_2;

public class Helllo {

    public Helllo(){
      this(2);
        System.out.println("i am zero constructor");
    }
    public  Helllo(int a){
        System.out.println("i am constructor"+" "+a);
    }

    public void add(int a,int b){
        System.out.println(a+b);
    }
     void sub(int a,int b){
        System.out.println(a-b);
    }

    String a="Avinash Aashritha";
  public static void Charr(String a){
      char[] chr=a.toCharArray();
      for (char c:chr){
          System.out.println(c);
      }

  }
    public static void main(String[] args) {
        Helllo helllo=new Helllo();
        Task_2 task_2=new Task_2();
        //Helllo helllo1=new Helllo(1);
        helllo.add(1,2);
        helllo.sub(2,3);
        Helllo.Charr(Task_2.str1);

    }
}
