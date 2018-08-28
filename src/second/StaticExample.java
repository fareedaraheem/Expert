package second;

/**
 * Created by expert on 7/4/18.
 */
public class StaticExample {

    static int i=1;
    int j=1;
    StaticExample(){
        ++i;
        ++j;
        System.out.println(i+" "+j);
    }
    static class InnerStatic{

        public void showMessage(){
            System.out.println("hello world");
        }
        public static void printfun(){
            System.out.println("static function of inner class");
        }
    }
    public static void display() {
        System.out.println("static function");
    }
    static{
        System.out.println("static" );
    }

    public static void main(String[] args) {
        StaticExample s=new StaticExample();
        StaticExample s1=new StaticExample();
        System.out.println(s.j+" "+StaticExample.i);
        display();
        InnerStatic.printfun();
        InnerStatic i=new InnerStatic();
        i.showMessage();
    }
}
