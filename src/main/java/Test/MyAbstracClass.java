package Test;

public abstract class MyAbstracClass implements Myinterface{
    public static void name(String n){
        System.out.println("Vamsi");
        System.out.println(n);
    }

    public static void name(String n,int i){
        System.out.println("i am overloded");

    }
    public abstract int two(int a,int b);

    public static void main(String[] args) {
        name("veeru",2);

        }

}

