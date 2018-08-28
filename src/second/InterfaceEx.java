package second;

/**
 * Created by expert on 7/6/18.
 */
public class InterfaceEx implements SampleInterface{

    final int i=10;
    static final int k;
    static{
        k=10;
    }
    @Override
    public void add(int x, int y) {
        System.out.println(x+y);
    }

    @Override
    public void display() {
        System.out.println("hello");

    }

    public static void main(String[] args) {
        InterfaceEx obj=new InterfaceEx();
        obj.add(3,4);
        obj.display();

    }
}
