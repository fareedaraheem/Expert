package second;

/**
 * Created by expert on 7/3/18.
 */
public class B extends A {
    int c=1;
    int d=2;
    B(){
        //super();// by default! this invokes the parent class constructor

        System.out.println("child class constructor");
    }
    public void display(){
        System.out.println("hello");
        super.display();//to refer parent class
    }
    public int add(int x,int y){
        System.out.println("in child");
        return x+y;
    }

    public static void main(String[] args) {
        B obj=new B();
        System.out.println("properties of parent class "+obj.a+" "+obj.b);
        System.out.println("properties of child class "+obj.c+" "+obj.d);
        obj.display();
        obj.add(3,3);

    }

}
