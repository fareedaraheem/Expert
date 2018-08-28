package second;

/**
 * Created by expert on 7/3/18.
 */
public class A {
    int a=10;
    int b=20;
    A()
    {
        System.out.println("parent class constructor");
    }

    public void display(){
        System.out.println("hello world");

    }
    public int add( int x,int y){
        System.out.println("in parent");
        return x+y;

    }
}
